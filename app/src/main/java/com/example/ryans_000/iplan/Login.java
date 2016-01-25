package com.example.ryans_000.iplan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button buttonSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //onClickButtonListener();
    }

    //Intent intent = new Intent("com.example.ryans_000.iplan.SelectDestination");
    //startActivity(intent);

    /*public void onClickButtonListener(){
        buttonSignIn = (Button)findViewById(R.id.btnSignIn);
        buttonSignIn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.SelectDestination");
                        startActivity(intent);
                    }
                }
        );
    }*/
}