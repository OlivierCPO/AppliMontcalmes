package com.example.applimontcalmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class enigme1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int i=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enigme1);
        Button monBouton = (Button)findViewById(R.id.button3);
        monBouton.setOnClickListener(new View.OnClickListener() {

            public void onClick (View view){
                visualiser_enig1();
            }
        });
    }

    private void visualiser_enig1()
    {
        Intent intent = new Intent (this , Eglise.class );
        startActivity(intent);
    }
}


