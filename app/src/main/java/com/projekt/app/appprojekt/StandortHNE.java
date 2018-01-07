package com.projekt.app.appprojekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class StandortHNE extends FragmentActivity implements OnMapReadyCallback, View.OnClickListener {

    Button ZuruckSHE;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standort_hne);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        ZuruckSHE = (Button) findViewById(R.id.ZuruckSHE);
        ZuruckSHE.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent Standortauswahl = new Intent(this, Standortauswahl.class);
        startActivity(Standortauswahl);
        this.finish();
    }
 
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Marker am Standort Heilbronn Europaplatz
        LatLng Europaplatz = new LatLng(49, 9);
        mMap.addMarker(new MarkerOptions().position(Europaplatz).title("Standort Heilbronn Europaplatz"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Europaplatz));
    }
}
