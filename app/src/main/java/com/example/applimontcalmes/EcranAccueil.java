package com.example.applimontcalmes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EcranAccueil extends AppCompatActivity {
    //PREMIERE CLASS CONCERNE CE QUI S'AFFICHE QUAND ON OUVRE L'APPLICATION

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecran_accueil);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Button monBouton = (Button)findViewById(R.id.button);
        monBouton.setOnClickListener(new View.OnClickListener() {

        public void onClick (View view){
            visualiser_presentation();
        }
    });
}//detecte quand le bouton est appuyé (l'utilisater veut avancer dans l'histoire)
   private void visualiser_presentation()
   {
       // creation d'une nouvelle activité


       Intent intent = new Intent (this , presentation.class );//la fonction ouvre la classe "presentation"
       startActivity(intent);
    }
}
//tentative commit