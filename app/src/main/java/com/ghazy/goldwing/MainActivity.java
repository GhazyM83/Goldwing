package com.ghazy.goldwing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

    }

    public void goToLogin(View view) {
        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
    }

    public void goToSignup(View view) {
        Intent i = new Intent(getApplicationContext(), Signup.class);
        startActivity(i);
    }
}