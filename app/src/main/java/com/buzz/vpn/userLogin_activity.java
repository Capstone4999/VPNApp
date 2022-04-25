package com.buzz.vpn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
//import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.ConnectionResult;
//import com.google.android.gms.common.SignInButton;
//import com.google.android.gms.common.api.GoogleApiClient;
import android.app.Activity;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class userLogin_activity extends AppCompatActivity/*Activity implements View.OnClickListener AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener, View.OnClickListener*/ {
    Button signInButton, signUp_button;
    EditText email, pword;
    ProgressBar progressBar;
    //TextView statusTextView;
    //GoogleApiClient mGoogleApiClient;
    private static final String TAG = "SignInActivity";
    //private static final int RC_SIGN_IN = 9001;
    private FirebaseAuth fAuth;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        fAuth = FirebaseAuth.getInstance();
        //GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        //statusTextView = (TextView) findViewById(R.id.status_textview);
        signInButton = (Button) findViewById(R.id.login_btn);
        signUp_button = (Button) findViewById(R.id.signup_button);
        //signInButton.setOnClickListener(this);
        //registerButton = (Button) findViewById(R.id.register_button);
        //registerButton.setOnClickListener(this);
        email = findViewById(R.id.username);
        pword = findViewById(R.id.password);
        progressBar = findViewById(R.id.iv_progress_bar);

        /*if (fAuth.getCurrentUser() != null) {
            startActivity(new Intent(getApplicationContext(), WelcomeActivity.class));
            finish();
        }*/

        signUp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), signup_activity.class));
            }
        });

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = email.getText().toString().trim();
                String word = pword.getText().toString().trim();
                if (TextUtils.isEmpty(mail)) {
                    email.setError("Email is Required");
                    return;
                }
                if (TextUtils.isEmpty(word)) {
                    pword.setError("Password is Required");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);
                fAuth.signInWithEmailAndPassword(mail, word).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(userLogin_activity.this, "User Logged In", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), homeOff.class));
                        } else {
                            Toast.makeText(userLogin_activity.this, "Loggin Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        Log.d(TAG, "onConnectionFailed: " + connectionResult);
    }

    private void sendEmailVerification() {
        final FirebaseUser user = fAuth.getCurrentUser();
        user.sendEmailVerification()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        // Email sent
                    }
                });
    }

    private void reload() {
    }

    private void updateUI(FirebaseUser user) {
        System.out.println("success");
    }
}