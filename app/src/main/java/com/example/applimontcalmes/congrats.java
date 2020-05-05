package com.example.applimontcalmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class congrats extends AppCompatActivity {
    private Button suivant;
    private Button revenir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.congrats);
        suivant = (Button) findViewById(R.id.suivant);
        suivant.setOnClickListener(suivantListener);
        revenir = (Button) findViewById(R.id.revenir);
        revenir.setOnClickListener(revenirListener);

    }

    private View.OnClickListener revenirListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }

    };


    private void ActiviteSuivante (){
        Intent intent = new Intent (this,skinnydipping.class );
        startActivity(intent);
    }

    private View.OnClickListener suivantListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ActiviteSuivante ();
        }
    };
}
