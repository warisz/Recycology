package com.example.android.recycologycomplete;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    Button submit;
    EditText search;
    String user;
    LatLng sarcan = new LatLng(52.128713, -106.589033);
    LatLng loraas = new LatLng(52.155518, -106.658870);
    LatLng lakewood = new LatLng(52.104851, -106.585210);
    LatLng lawson = new LatLng(52.168223, -106.632853);
    LatLng meadowGreen = new LatLng(52.129187, -106.711353);
    LatLng fire = new LatLng(52.147328, -106.575753);
    LatLng cosmo = new LatLng(52.145734, -106.666283);
    LatLng city = new LatLng(52.133282, -106.670011);
    LatLng bN = new LatLng(52.156182, -106.662653);
    LatLng saskCivic = new LatLng(52.100792, -106.725303);
    LatLng alch = new LatLng(52.137199, -106.660169);
    LatLng eastCompost = new LatLng(52.142940, -106.523031);
    LatLng westCompost = new LatLng(52.116828, -106.774319);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        submit = findViewById(R.id.submit);
        search = findViewById(R.id.search);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = search.getText().toString().toLowerCase();
                hideSoftKeyboard();
                if (user.contains("water bottle") || user.equals("juice box") || user.contains("carton") || user.contains("sticky note") || user.contains("shampoo") || user.contains("conditioner") || user.contains("body")) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(city, 11));
                    mMap.addMarker(new MarkerOptions().position(sarcan).title("Sarcan"));
                    mMap.addMarker(new MarkerOptions().position(loraas).title("Loraas Recycling Center"));
                    mMap.addMarker(new MarkerOptions().position(lakewood).title("Lakewood Civic Center"));
                    mMap.addMarker(new MarkerOptions().position(lawson).title("Lawson"));
                    mMap.addMarker(new MarkerOptions().position(meadowGreen).title("Meadowgreen Recycling Depot"));
                    mMap.addMarker(new MarkerOptions().position(fire).title("Fire Station #9"));
                    mMap.addMarker(new MarkerOptions().position(cosmo).title("Cosmopolitan Industries"));
                } else if (user.contains("pencil")) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(city, 11));
                    mMap.addMarker(new MarkerOptions().position(sarcan).title("Sarcan"));
                    mMap.addMarker(new MarkerOptions().position(cosmo).title("Cosmopolitan Industries"));
                    mMap.addMarker(new MarkerOptions().position(bN).title("BN Steel & Metals"));
                } else if(user.contains("lighter") || user.contains("cleaning")) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(city, 11));
                    mMap.addMarker(new MarkerOptions().position(sarcan).title("Sarcan"));
                    mMap.addMarker(new MarkerOptions().position(saskCivic).title("Saskatoon Civic Operations Centre"));
                } else if(user.contains("aerosol")) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(city, 11));
                    mMap.addMarker(new MarkerOptions().position(sarcan).title("Sarcan"));
                    mMap.addMarker(new MarkerOptions().position(saskCivic).title("Saskatoon Civic Operations Centre"));
                    mMap.addMarker(new MarkerOptions().position(alch).title("Alchemy Clothing and Salon"));
                } else if(user.contains("tea")) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(city, 10));
                    mMap.addMarker(new MarkerOptions().position(sarcan).title("Sarcan"));
                    mMap.addMarker(new MarkerOptions().position(eastCompost).title("Saskatoon East Compost Depot"));
                    mMap.addMarker(new MarkerOptions().position(westCompost).title("Saskatoon West Compost Depot"));
                } else if(user.contains("foil")) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(city, 11));
                    mMap.addMarker(new MarkerOptions().position(sarcan).title("Sarcan"));
                    mMap.addMarker(new MarkerOptions().position(loraas).title("Loraas Recycling Center"));
                    mMap.addMarker(new MarkerOptions().position(lakewood).title("Lakewood Civic Center"));
                    mMap.addMarker(new MarkerOptions().position(lawson).title("Lawson"));
                    mMap.addMarker(new MarkerOptions().position(meadowGreen).title("Meadowgreen Recycling Depot"));
                    mMap.addMarker(new MarkerOptions().position(fire).title("Fire Station #9"));
                    mMap.addMarker(new MarkerOptions().position(cosmo).title("Cosmopolitan Industries"));
                    mMap.addMarker(new MarkerOptions().position(bN).title("BN Steel & Metals"));
                } else if(user.contains("chip") || user.contains("bag")) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(city, 11));
                    mMap.addMarker(new MarkerOptions().position(sarcan).title("Sarcan"));
                    mMap.addMarker(new MarkerOptions().position(loraas).title("Loraas Recycling Center"));
                } else {
                    Toast.makeText(MapsActivity.this, "Item Not Found", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sask = new LatLng(52.133697, -106.630886);

        mMap.addMarker(new MarkerOptions().position(sask).title("University of Saskatchewan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sask, 15));

    }

    private void hideSoftKeyboard() {
        if (getCurrentFocus() != null && getCurrentFocus() instanceof EditText) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(search.getWindowToken(), 0);
        }
    }
}
