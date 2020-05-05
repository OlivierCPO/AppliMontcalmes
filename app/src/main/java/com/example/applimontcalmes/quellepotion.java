package com.example.applimontcalmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quellepotion extends AppCompatActivity {

    private Button Suivant;
    private Button precedent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quellepotion);

        Suivant = (Button) findViewById(R.id.Suivant);
        Suivant.setOnClickListener(suivantListener);
        precedent = (Button) findViewById(R.id.precedent);
        precedent.setOnClickListener(revenirListener);

    }

    private View.OnClickListener revenirListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }

    };


    private void ActiviteSuivante (){
        Intent intent = new Intent (this,unparchemin.class );
        startActivity(intent);
    }

    private View.OnClickListener suivantListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ActiviteSuivante ();
        }
    };
}