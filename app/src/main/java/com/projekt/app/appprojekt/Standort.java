package com.projekt.app.appprojekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Standort extends AppCompatActivity implements View.OnClickListener {

    Button Zuruck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standort);

        Zuruck = (Button) findViewById(R.id.Zuruck);
        Zuruck.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent Maps = new Intent(this, MapsActivity.class);
        startActivity(Maps);
        this.finish();
    }
}
