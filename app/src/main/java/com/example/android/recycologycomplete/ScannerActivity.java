package com.example.android.recycologycomplete;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScannerActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    ZXingScannerView ScannerView;

    public void openDescrip(){
        startActivity(new Intent(ScannerActivity.this, DescriptionActivity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScannerView = new ZXingScannerView(this);
        setContentView(ScannerView);
    }

    @Override
    public void handleResult(Result result) {
        Intent i = new Intent(this, DescriptionActivity.class);
        i.putExtra("resultBarcode", result.getText());
        startActivity(i);

    }

    @Override
    protected void onPause(){
        super.onPause();
        ScannerView.stopCamera();
    }

    @Override
    protected void onResume(){
        super.onResume();

        ScannerView.setResultHandler(this);
        ScannerView.startCamera();
    }


}
