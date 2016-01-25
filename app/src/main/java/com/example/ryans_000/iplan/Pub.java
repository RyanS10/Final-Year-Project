package com.example.ryans_000.iplan;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Pub extends AppCompatActivity {

    private static Button buttonHome, buttonOval, buttonLagoona, buttonMurrays;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pub);
        onClickButtonListener();
    }

    public void onClickButtonListener() {
        buttonHome = (Button) findViewById(R.id.btnHome);
        buttonHome.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Pub.this, SelectDestination.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }
                }
        );

        buttonLagoona = (Button)findViewById(R.id.btnLagoona);
        buttonLagoona.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.Lagoona");
                        startActivity(intent);
                    }
                }
        );

        buttonOval = (Button)findViewById(R.id.btnOval);
        buttonOval.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.Oval");
                        startActivity(intent);
                    }
                }
        );

        buttonMurrays = (Button)findViewById(R.id.btnMurrays);
        buttonMurrays.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.Murrays");
                        startActivity(intent);
                    }
                }
        );
    }
}