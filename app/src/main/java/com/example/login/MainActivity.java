package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout loginContainer,signupContainer;
    Button gotoLogin,gotoSignup;
    View loginClicked,signupClicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginContainer =(ConstraintLayout) findViewById(R.id.logincontainer);
        signupContainer = (ConstraintLayout) findViewById(R.id.signupcontainer);
        loginClicked = findViewById(R.id.logindivider);
        signupClicked = findViewById(R.id.signupdivider);
        gotoLogin = (Button) findViewById(R.id.login);
        gotoSignup = (Button) findViewById(R.id.signup);

        gotoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color= Color.parseColor("#00c3e1");
                loginClicked.setBackgroundColor(color);
                signupClicked.setBackgroundColor(Color.WHITE);
                loginContainer.setVisibility(View.VISIBLE);
                signupContainer.setVisibility(View.INVISIBLE);
            }
        });

        gotoSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color= Color.parseColor("#00c3e1");
                loginClicked.setBackgroundColor(Color.WHITE);
                signupClicked.setBackgroundColor(color);
                loginContainer.setVisibility(View.INVISIBLE);
                signupContainer.setVisibility(View.VISIBLE);
            }
        });
    }
}
