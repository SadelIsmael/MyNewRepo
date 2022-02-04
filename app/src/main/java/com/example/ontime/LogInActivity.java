package com.example.ontime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
        etPassword=findViewById(R.id.etPasswordLogIn);
        auth = FirebaseAuth.getInstance();
    }

    public void BackToMain(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void LogIn(View view) {
    }
}