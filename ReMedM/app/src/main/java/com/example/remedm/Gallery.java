package com.example.remedm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Gallery  extends AppCompatActivity {
    Spinner BuscarCliAr;
    Spinner BuscarCliMed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gallery);
        BuscarCliAr =(Spinner) findViewById(R.id.AreaEH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.BuscarCliAr, android.R.layout.simple_spinner_item);
        BuscarCliAr.setAdapter(adapter);
        BuscarCliMed =(Spinner) findViewById(R.id.medicoEH);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.BuscarCliMed, android.R.layout.simple_spinner_item);
        BuscarCliMed.setAdapter(adapter1);


    }
}

