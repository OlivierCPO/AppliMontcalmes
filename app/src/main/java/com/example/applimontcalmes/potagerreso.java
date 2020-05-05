package com.example.applimontcalmes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class potagerreso extends AppCompatActivity {
    private EditText editText5 = null; // endroit ou rentrer le texte
    private Button button12; // //bouton pour valider sa reponse

    private String reponse = "tournesol";//reponse attendue

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potagerreso);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        editText5 = (EditText) findViewById(R.id.editText5); //rentre sa reponse
        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener()  {
                                       @Override
                                       public void onClick(View v) {
                                           Log.i("DEBUG","Bouton cliqué");
                                           String reponseuse = editText5.getText().toString();
                                           String textView2 = "e";

                                           //int reponseuser= Integer.parseInt(reponseuse);

                                           if (reponseuse.equals(reponse)){
                                               Intent intent = new Intent (potagerreso.this,potager.class); //bonne reponse
                                               startActivity(intent);                }
                                           else {
                                               Intent intent = new Intent (potagerreso.this,Echec.class); //mauvaise reponse
                                               startActivity(intent);
                                           }
                                       };
                                   }
        );
    }


}

