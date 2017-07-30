package com.example.hasini.inna_mobileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity {

    //Declare variables in FirstPage
    private Button signUp;
    private Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        //Initialize variables in FirstPage
        signUp = (Button)findViewById(R.id.btnSignUp);
        signIn = (Button)findViewById(R.id.btnSingIn);

        //Setting OnClickListners for buttons
        signUp.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        signUpBtnClicked();
                    }
                }
        );

        signIn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        signInBtnClicked();
                    }
                }
        );
    }

    //Button clicked methods

    private void signUpBtnClicked() {
        Intent i = new Intent(".SignUp");
        startActivity(i);
    }

    private void signInBtnClicked() {
        Intent i = new Intent(".SignIn");
        startActivity(i);
    }
}
