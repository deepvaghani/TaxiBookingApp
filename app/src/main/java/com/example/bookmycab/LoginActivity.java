package com.example.bookmycab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void phoneLoginClick(View view) {
        Intent intent = new Intent(LoginActivity.this,PhoneLogin.class);
        startActivity(intent);
    }
}