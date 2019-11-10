package com.example.remedm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Registro_cita_Doctor extends AppCompatActivity {
    Spinner BuscarCliMed;
    Spinner BuscarCli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_cita_doctor);
        BuscarCli =(Spinner) findViewById(R.id.CliniA);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.BuscarCli, android.R.layout.simple_spinner_item);
        BuscarCli.setAdapter(adapter);
        BuscarCliMed =(Spinner) findViewById(R.id.medicog);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.BuscarCliMed, android.R.layout.simple_spinner_item);
        BuscarCliMed.setAdapter(adapter1);


    }
}