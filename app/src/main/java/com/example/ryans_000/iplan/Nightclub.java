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


public class Nightclub extends AppCompatActivity {

    private static Button buttonHome, buttonDiceys, buttonCFJ, buttonPalace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nightclub);
        onClickButtonListener();
    }

    public void onClickButtonListener() {
        buttonHome = (Button) findViewById(R.id.btnHome);
        buttonHome.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Nightclub.this, SelectDestination.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }
                }
        );

        buttonDiceys = (Button)findViewById(R.id.btnDiceys);
        buttonDiceys.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.Diceys");
                        startActivity(intent);
                    }
                }
        );

        buttonCFJ = (Button)findViewById(R.id.btnCFJ);
        buttonCFJ.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.CFJ");
                        startActivity(intent);
                    }
                }
        );

        buttonPalace = (Button)findViewById(R.id.btnPalace);
        buttonPalace.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.Palace");
                        startActivity(intent);
                    }
                }
        );
    }
}
