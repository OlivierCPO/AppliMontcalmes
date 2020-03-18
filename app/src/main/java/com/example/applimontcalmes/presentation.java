package com.example.applimontcalmes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class presentation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation2);
        Button monBouton = (Button)findViewById(R.id.button2);
        monBouton.setOnClickListener(new View.OnClickListener() {

            public void onClick (View view){
                visualiser_lab();
            }
        });
    }

    private void visualiser_lab()
    {
        Intent intent = new Intent (this , enigme1.class );
        startActivity(intent);
    }
}


