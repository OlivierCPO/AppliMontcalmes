package com.example.applimontcalmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class eglisereso extends AppCompatActivity {
    private EditText editText4 = null;
    private Button button7;

    private int valeurrech = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eglisereso);
        editText4 = (EditText) findViewById(R.id.editText4);
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Log.i("DEBUG","Bouton cliqué");
                String strinombre = editText4.getText().toString();
                String editText4 = "e";

                if (strinombre.equals(""))return;

                int valentree= Integer.parseInt(strinombre);

                if (valentree==valeurrech){
                    Intent intent = new Intent (eglisereso.this,potager.class);
                    startActivity(intent);                }
                else {
                    Intent intent = new Intent (eglisereso.this,Echec.class);
                    startActivity(intent);
                }
            };
            }
);
    }


}