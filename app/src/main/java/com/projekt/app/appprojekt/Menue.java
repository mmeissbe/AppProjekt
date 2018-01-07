package com.projekt.app.appprojekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menue extends AppCompatActivity implements View.OnClickListener {

    Button Routenberechnung, HHNStandorte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menue);

        Routenberechnung = (Button) findViewById(R.id.Routenberechnung);
        HHNStandorte = (Button) findViewById(R.id.HHNStandorte);

        Routenberechnung.setOnClickListener(this);
        HHNStandorte.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Routenberechnung:
                Intent Maps = new Intent(this, MapsActivity.class);
                startActivity(Maps);
                break;
            case R.id.HHNStandorte:
                Intent Standorte = new Intent(this, Standortauswahl.class);
                startActivity(Standorte);
                break;
        }

    }
}
