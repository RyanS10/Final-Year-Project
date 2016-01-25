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

public class Restaurant extends AppCompatActivity {

    private static Button buttonHome, buttonAussieBBQ, buttonNandos, buttonMilanos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        onClickButtonListener();
    }



    public void onClickButtonListener() {
        buttonHome = (Button) findViewById(R.id.btnHome);
        buttonHome.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Restaurant.this, SelectDestination.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }
                }
        );

        buttonAussieBBQ = (Button)findViewById(R.id.btnAussieBBQ);
        buttonAussieBBQ.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.AussieBBQ");
                        startActivity(intent);
                    }
                }
        );

        buttonNandos = (Button)findViewById(R.id.btnNandos);
        buttonNandos.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.Nandos");
                        startActivity(intent);
                    }
                }
        );

        buttonMilanos = (Button)findViewById(R.id.btnMilanos);
        buttonMilanos.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.Milanos");
                        startActivity(intent);
                    }
                }
        );
    }
}
