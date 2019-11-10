package com.example.remedm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.remedm.R;

public class BuscarClinica extends AppCompatActivity {
    Spinner BuscarCliAr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscar_clinica);
        BuscarCliAr =(Spinner) findViewById(R.id.Area1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.BuscarCliAr, android.R.layout.simple_spinner_item);
        BuscarCliAr.setAdapter(adapter);
    }
}
