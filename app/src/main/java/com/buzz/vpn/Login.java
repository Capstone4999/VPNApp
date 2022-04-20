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

public class Login extends AppCompatActivity/*Activity implements View.OnClickListener AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener, View.OnClickListener*/ {
    Button signInButton;
    //Button registerButton;
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
        setContentView(R.layout.activity_login2);
        fAuth = FirebaseAuth.getInstance();
        //GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        //statusTextView = (TextView) findViewById(R.id.status_textview);
        signInButton = (Button) findViewById(R.id.sing_in_button);
        //signInButton.setOnClickListener(this);
        //registerButton = (Button) findViewById(R.id.register_button);
        //registerButton.setOnClickListener(this);
        email = findViewById(R.id.username);
        pword = findViewById(R.id.password);
        //progressBar = findViewById(R.id.iv_progress_bar);

        /*if(fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(), Login.class));
            finish();
        }*/

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
                    pword.setError("Password is Required");
                    return;
                }
                //progressBar.setVisibility(View.VISIBLE);
                fAuth.signInWithEmailAndPassword(mail,word).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Login.this, "User Logged In", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), WelcomeActivity.class));
                        }else{
                            Toast.makeText(Login.this, "Loggin Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }

    /*@Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = fAuth.getCurrentUser();
        if(currentUser != null){
            reload();
        }
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.sing_in_button:
                signIn();
                break;
            //case R.id.register_button:
                //createAccount();
                //break;
            default:
                break;
        }

    }
    private void signIn() {
        fAuth.signInWithEmailAndPassword(email, pword)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = fAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(Login.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }
                    }
                });
        // [END sign_in_with_email]
    }
    private void createAccount() {
        fAuth.createUserWithEmailAndPassword(email.getText().toString(), pword.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = fAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(Login.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }
                    }
                });
    }*/
    /*@Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RC_SIGN_IN) {
            GoogleSingInResult result Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleSignInResult(result);
        }
    }
    private void signOut(){
        Auth.GoogleSignInApi.signOut(mGoogleApiClient).setResultCallback(new ResultCallback<Status>() {
            @Override
            public void onResult(@NonNull Status status) {
                statusTextView.setText("Signed Out");
            }
        });
    }
    private void handleSignInResult (GoogleSignInResult result) {
        Log.d(TAG, "handleSignInResult:" + result.isSuccess());
        if(result.isSuccess()) {
            GoogleSingInAccount acct = result.getSingInAccount();
            statusTextView.setText("Hello, " + acct.getDisplayName());
        } else {

        }
    }*/
    //@Override
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

    private void reload() { }

    private void updateUI(FirebaseUser user) {
        System.out.println("success");
    }
}