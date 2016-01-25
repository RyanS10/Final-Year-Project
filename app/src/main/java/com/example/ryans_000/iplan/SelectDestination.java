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

public class SelectDestination extends AppCompatActivity {

    private static Button buttonPub, buttonNightclub, buttonRestaurant, buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_destination);
        onClickButtonListener();
    }

    public void onClickButtonListener(){
        buttonPub = (Button)findViewById(R.id.btnPub);
        buttonPub.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.Pub");
                        startActivity(intent);
                    }
                }
        );

        buttonNightclub = (Button)findViewById(R.id.btnNightclub);
        buttonNightclub.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.Nightclub");
                        startActivity(intent);
                    }
                }
        );

        buttonRestaurant = (Button)findViewById(R.id.btnRestaurant);
        buttonRestaurant.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.ryans_000.iplan.Restaurant");
                        startActivity(intent);
                    }
                }
        );
    }
}