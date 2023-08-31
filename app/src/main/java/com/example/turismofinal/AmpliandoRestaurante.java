package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turismofinal.Moldes.MoldeHotel;
import com.example.turismofinal.Moldes.MoldeRestaurante;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurante moldeRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);


            moldeRestaurante=(MoldeRestaurante) getIntent().getSerializableExtra("datosrestaurante");
            Toast.makeText(this, moldeRestaurante.getNombre(),Toast.LENGTH_LONG).show();


    }
}