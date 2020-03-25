package com.example.applimontcalmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EcranAccueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecran_accueil);
        Button monBouton = (Button)findViewById(R.id.button);
        monBouton.setOnClickListener(new View.OnClickListener() {

        public void onClick (View view){
            visualiser_presentation();
        }
    });
}
   private void visualiser_presentation()
   {
       // creation d'une nouvelle activité
       // ok

       Intent intent = new Intent (this , presentation.class );
       startActivity(intent);
    }
}
//tentative commit