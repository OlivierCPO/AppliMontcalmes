package com.example.applimontcalmes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class potager extends AppCompatActivity {
//transition eglise potager simple boutton
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potager);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Button monBouton = (Button)findViewById(R.id.button9);
        monBouton.setOnClickListener(new View.OnClickListener() {

            public void onClick (View view){
                visualiser_lab();
            }
        });
    }

    private void visualiser_lab()
    {
        Intent intent = new Intent (this , potagerreso.class );
        startActivity(intent);
    }
}


