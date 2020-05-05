package com.example.applimontcalmes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class eglisereso extends AppCompatActivity {
    private EditText editText4 = null; //endroit ou l'utilisateur va rentrer sa reponse
    private Button button7; // bouton pour valider sa reponse

    private int valeurrech = 6; // reponse attendue

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eglisereso);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        editText4 = (EditText) findViewById(R.id.editText4); //recupere le contenu rentré
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Log.i("DEBUG","Bouton cliqué");
                String strinombre = editText4.getText().toString();
                String editText4 = "e";

                if (strinombre.equals(""))return;

                int valentree= Integer.parseInt(strinombre);

                if (valentree==valeurrech){ // en cas de bonne reponse
                    Intent intent = new Intent (eglisereso.this,potager.class); //acces a l'enigme sivante
                    startActivity(intent);                }
                else {
                    Intent intent = new Intent (eglisereso.this,Echec.class);// sinon case echec et on pourra retenter sa chance
                    startActivity(intent);
                }
            };
            }
);
    }


}