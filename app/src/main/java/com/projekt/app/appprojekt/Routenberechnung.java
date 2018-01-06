package com.projekt.app.appprojekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Routenberechnung extends AppCompatActivity implements View.OnClickListener {

    Button btnMenu2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routenberechnung);

        btnMenu2 = (Button) findViewById(R.id.btnMenu2);
        btnMenu2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Funktion, was passieren soll, wenn der Button gedrückt wird.
        Intent Menu = new Intent(this, Menue.class);
        startActivity(Menu);
        this.finish();
    }


}