package com.example.applimontcalmes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class enigme1 extends AppCompatActivity {
    private Button button3; //correspond au bouton A - le bouton indiquant le bon chemin
    private Button button4; //correspond au bouton B - mauvaise reponse
    private Button button5; //correspond au bouton C - mauvaise reponse


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int i=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enigme1);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(button3Listener); // detection de l'appui sur le bouton
        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(button4Listener);
        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(button5Listener);
    }

private View.OnClickListener button3Listener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent (enigme1.this, Eglise.class); // en cas d'appui sur la bonne reponse, on accede a l'activité suivante dans l'histoire
        startActivity(intent);
    };

};




private View.OnClickListener button4Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent (enigme1.this, Echec.class); // en cas de mauvaise reponse, on est renvoyé vers l'activité echec qui nous renverra directement à cette enigme
            startActivity(intent);
        };

};

    private View.OnClickListener button5Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent (enigme1.this, Echec.class); //idem mauvaise reponse
            startActivity(intent);
        };

    };

}
