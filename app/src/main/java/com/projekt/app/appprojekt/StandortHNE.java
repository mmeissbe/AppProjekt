package com.projekt.app.appprojekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StandortHNE extends AppCompatActivity implements View.OnClickListener {

    Button ZuruckSHE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standort_hne);

        ZuruckSHE = (Button) findViewById(R.id.ZuruckSHE);
        ZuruckSHE.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent Standortauswahl = new Intent(this, Standortauswahl.class);
        startActivity(Standortauswahl);
        this.finish();
    }
}
