package com.projekt.app.appprojekt;

import android.media.MediaRouter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Standortauswahl extends AppCompatActivity implements View.OnClickListener {

    Button Menu, RouteSontheim,StandortSontheim,RouteEuropaplatz,StandortEuropaplatz,RouteSHA,StandortSHA,RouteKUN,StandortKUN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standortauswahl);

        Menu = (Button) findViewById(R.id.Menu);
        RouteSontheim = (Button) findViewById(R.id.RouteSontheim);
        StandortSontheim = (Button) findViewById(R.id.StandortSontheim);
        RouteEuropaplatz = (Button) findViewById(R.id.RouteEuropaplatz);
        StandortEuropaplatz = (Button) findViewById(R.id.StandortEuropaplatz);
        RouteSHA = (Button) findViewById(R.id.RouteSHA);
        StandortSHA = (Button) findViewById(R.id.StandortSHA);
        RouteKUN = (Button) findViewById(R.id.RouteKUN);
        StandortKUN = (Button) findViewById(R.id.StandortKUN);

        Menu.setOnClickListener(this);
        RouteSontheim.setOnClickListener(this);
        StandortSontheim.setOnClickListener(this);
        RouteEuropaplatz.setOnClickListener(this);
        StandortEuropaplatz.setOnClickListener(this);
        RouteSHA.setOnClickListener(this);
        StandortSHA.setOnClickListener(this);
        RouteKUN.setOnClickListener(this);
        StandortKUN.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Menu:
                break;
            case R.id.RouteSontheim:
                break;
            case R.id.StandortSontheim:
                break;
            case R.id.RouteEuropaplatz:
                break;
            case R.id.StandortEuropaplatz:
                break;
            case R.id.RouteSHA:
                break;
            case R.id.StandortSHA:
                break;
            case R.id.RouteKUN:
                break;
            case R.id.StandortKUN:
                break;
        }
    }
}
