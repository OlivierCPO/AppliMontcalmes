package com.example.applimontcalmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Perdu extends AppCompatActivity {
    private Button boutonreessayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perdu);
        boutonreessayer = (Button) findViewById(R.id.boutonreessayer);
        boutonreessayer.setOnClickListener(boutonreessayerListener);

    }

    private void Revenir() {
        finish();
    }

    private View.OnClickListener boutonreessayerListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Revenir();

        };
    };
