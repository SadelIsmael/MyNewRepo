package com.example.ontime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoLogIn(View view) {
        Intent i = new Intent(this, LogInActivity.class);
        startActivity(i);
    }

    public void GoSignUp(View view) {
        Intent i = new Intent(this, SignUpActivity.class);
        startActivity(i);
    }
}