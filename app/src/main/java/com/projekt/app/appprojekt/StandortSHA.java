package com.projekt.app.appprojekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StandortSHA extends AppCompatActivity implements View.OnClickListener {

    Button ZuruckSHA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standort_sh);

        ZuruckSHA = (Button) findViewById(R.id.ZuruckSHA);
        ZuruckSHA.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent Standortauswahl = new Intent(this, Standortauswahl.class);
        startActivity(Standortauswahl);
        this.finish();
    }
}
