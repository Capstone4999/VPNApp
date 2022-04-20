package com.buzz.vpn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.text.TextUtils;
//import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
//import com.google.android.gms.common.ConnectionResult;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signup_activity extends AppCompatActivity {
    Button signUpButton;
    EditText mail1, mail2, pword1, pword2;
    ProgressBar progressBar;
    private static final String TAG = "SingUpActivity";
    private FirebaseAuth fAuth;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        fAuth = FirebaseAuth.getInstance();
        signUpButton = (Button) findViewById(R.id.secureme);
        mail1 = findViewById(R.id.email1);
        mail2 = findViewById(R.id.email2);
        pword1 = findViewById(R.id.password1);
        pword2 = findViewById(R.id.password2);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email_1 = mail1.getText().toString().trim();
                String email_2 = mail2.getText().toString().trim();
                String word_1 = pword1.getText().toString().trim();
                String word_2 = pword2.getText().toString().trim();
                if(TextUtils.equals(email_1, email_2)){

                } else{
                    mail2.setError("Emails Are Not The Same");
                    return;
                }
                if(TextUtils.equals(word_1, word_2)){

                } else{
                    pword2.setError("Passwords Are Not The Same");
                    return;
                }
                //progressBar.setVisibility(View.VISIBLE);

                fAuth.createUserWithEmailAndPassword(email_1, word_1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(signup_activity.this, "User Created", Toast.LENGTH_SHORT).show(); // TODO send email verification
                            startActivity(new Intent(getApplicationContext(), WelcomeActivity.class));
                        } else {
                            Toast.makeText(signup_activity.this, "Login Failed", Toast.LENGTH_SHORT).show();
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