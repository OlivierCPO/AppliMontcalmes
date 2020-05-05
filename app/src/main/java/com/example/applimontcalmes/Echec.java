package com.example.applimontcalmes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Echec extends AppCompatActivity {
//code non complet manque partie retour à l'enigme
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echec);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
