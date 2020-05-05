package com.example.applimontcalmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lac extends AppCompatActivity {

    private EditText textnombre = null;
    private Button verifier;
    private int searchedvalue=11;
    private int essais;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lac);
        textnombre = (EditText) findViewById(R.id.textnombre);
        verifier = (Button) findViewById(R.id.verifier);
        verifier.setOnClickListener(verifierListener);



    }

    private void Congratulations (){
        Intent intent = new Intent (this,congrats.class );
        startActivity(intent);
       /* AlertDialog felicitations = new AlertDialog.Builder( this ).create();
        felicitations.setTitle(getString(R.string.nomenigme));
        felicitations.setMessage(getString(R.string.felicitations));
        felicitations.setButton(AlertDialog.BUTTON_POSITIVE.getString(R.string.continuer), new AlertDialog.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                init ();
            }
        });
felicitations.show();*/
    }
    private void Perdu (){
        Intent intent = new Intent (this,Perdu.class );
        startActivity(intent);
    }
    private View.OnClickListener verifierListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("DEBUG","Bouton cliqué");
            String strnombre = textnombre.getText().toString();
            String textnombre = "e";
            if (strnombre.equals(""))return;

            int enteredValue= Integer.parseInt(strnombre);

            if (enteredValue==searchedvalue){
                Congratulations();
            }
            else{
                Perdu ();
            }


        }
    };
}
