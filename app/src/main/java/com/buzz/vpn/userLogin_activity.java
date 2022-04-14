package com.buzz.vpn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.ConnectionResult;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class userLogin_activity extends AppCompatActivity {
    Button signInButton;
    EditText email, pword;
    ProgressBar progressBar;
    private static final String TAG = "SignInActivity";
    private FirebaseAuth fAuth;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        fAuth = FirebaseAuth.getInstance();
        signInButton = (Button) findViewById(R.id.login_btn);
        email = findViewById(R.id.username);
        pword = findViewById(R.id.password);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = email.getText().toString().trim();
                String word = pword.getText().toString().trim();
                if(TextUtils.isEmpty(mail)){
                    email.setError("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty(word)){
                    email.setError("Password is Required");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);

                fAuth.signInWithEmailAndPassword(mail, word).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(userLogin_activity.this, "User Logged In", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), WelcomeActivity.class));
                        } else {
                            Toast.makeText(userLogin_activity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }

    private void sendEmailVerification(){
        final FirebaseUser user = fAuth.getCurrentUser();
        user.sendEmailVerification().addOnCompleteListener(this, new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                //send email
            }
        });
    }
}