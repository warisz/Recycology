package com.example.android.recycologycomplete;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DescriptionActivity extends AppCompatActivity {
    List<String> barcodes;
    public TextView result;
    public static Button locations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        barcodes = new ArrayList<String>();
        barcodes.add("082657504063");
        barcodes.add("022592846613");
        barcodes.add("071142953110");
        barcodes.add("075720438662");
        barcodes.add("012000504044");
        barcodes.add("012000001574");
        barcodes.add("012000012044");
        barcodes.add("069000061015");
        barcodes.add("818235774814");
        barcodes.add("071142953110");
        barcodes.add("071142953110");

        result = (TextView)findViewById(R.id.result);
        Intent intent = getIntent();
        String resultBarcode = intent.getExtras().getString("resultBarcode");
        result.setText("Barcode Scanned: " + resultBarcode);

        if(barcodes.contains(resultBarcode)){
            Log.v("RECYCLE", "YES IT IS");
        }else{
            Log.v("RECYCLE", "NO ITS NOT");
        }
        locations = (Button)findViewById(R.id.locations);

        locations.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
            }
        });

        TextView title, recycle, info;

        title = findViewById(R.id.title);
        recycle = findViewById(R.id.recycle);
        info = findViewById(R.id.info);
        if(resultBarcode.equals("771047597074")){
            title.setText("Candy Product");
            recycle.setText("Recyclable");
            info.setText("If you are in the city’s waste collection program, chip bags go in the black bin because they are type 4 plastics that are hard to recycle. Search chip bag on map to find nearest depots.");
        }
        else if (barcodes.contains(resultBarcode)) {
            title.setText("Plastic Water Bottle");
            recycle.setText("Recyclable");
            info.setText("If you are in the city's waste collection program, empty bottles go to the blue bin and caps go to the black bin. If needed, search plastic water bottle on map for nearest depots. How to recycle: take the cap off, rinse/empty the bottle, and crush if possible. Crushing allows for space to be saved both in your bin and at the processing facility. ");
        }

    }




}
