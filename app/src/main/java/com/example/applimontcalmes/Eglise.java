package com.example.applimontcalmes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eglise extends AppCompatActivity {


    // transition entre enigme 1 et enigme de l'eglise cela permet de mieux comprendre l'histoire
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eglise);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Button monBouton = (Button)findViewById(R.id.button6);
        monBouton.setOnClickListener(new View.OnClickListener() {

            public void onClick (View view){
                visualiser_enig1();
            }
        });
    }

    private void visualiser_enig1()
    {
        Intent intent = new Intent (this , eglisereso.class );
        startActivity(intent);
    }
}


