package com.example.slip1;

import androidx.fragment.app.FragmentActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mMap;
    ArrayList<LatLng> points = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        // Zoom In
        mMap.animateCamera(CameraUpdateFactory.zoomIn());

        // Zoom Out
        mMap.animateCamera(CameraUpdateFactory.zoomOut());

        // Satellite View
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        // Terrain View
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
    }
}