package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turismofinal.Moldes.MoldeRestaurante;
import com.example.turismofinal.Moldes.MoldeTurismo;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeTurismo moldeTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datosturismo");
        Toast.makeText(this, moldeTurismo.getNombre(),Toast.LENGTH_LONG).show();

    }
}