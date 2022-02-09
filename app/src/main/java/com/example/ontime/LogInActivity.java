package com.example.ontime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LogInActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    private EditText etEmail,etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        connectComponents();

    }

    private void connectComponents(){
        etEmail=findViewById(R.id.etUsernameLOGIN);
        etPassword=findViewById(R.id.etPasswordLOGIN);
        auth = FirebaseAuth.getInstance();
    }

    public void BackToMain(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void LogIn(View view) {
        String username = etEmail.getText().toString();
        String password = etPassword.getText().toString();


        //check if the email or the password is empty
        if (username.trim().isEmpty() || password.trim().isEmpty()) {
            Toast.makeText(LogInActivity.this, "Username or password is empty!", Toast.LENGTH_SHORT).show();
            return;
        }

        auth.createUserWithEmailAndPassword(username, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {


                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            //  if successful

                        } else {
                            // if failed
                            Toast.makeText(LogInActivity.this, "Username or password is empty!", Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }
                });



    }

}