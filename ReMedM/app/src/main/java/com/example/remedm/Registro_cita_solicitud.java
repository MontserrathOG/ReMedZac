package com.example.remedm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Registro_cita_solicitud  extends AppCompatActivity {
    Spinner BuscarCliMedNue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_cita_solicitud);

        BuscarCliMedNue =(Spinner) findViewById(R.id.medicoB);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.BuscarCliMedNue, android.R.layout.simple_spinner_item);
        BuscarCliMedNue.setAdapter(adapter1);


    }
}