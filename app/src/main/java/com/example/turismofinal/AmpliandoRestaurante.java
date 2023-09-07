package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turismofinal.Moldes.MoldeHotel;
import com.example.turismofinal.Moldes.MoldeRestaurante;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurante moldeRestaurante;
    TextView Àmpliandonombrerest;
    ImageView AmpliandofotoRest;
    TextView AmpliandoprecioRest;
    TextView Ampliandocontactohotel;
    TextView resenaAhotel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);


        Àmpliandonombrerest=findViewById(R.id.Àmpliandonombrerest);
        AmpliandofotoRest=findViewById(R.id.AmpliandofotoRest);
        AmpliandoprecioRest=findViewById(R.id.AmpliandoprecioRest);
        Ampliandocontactohotel=findViewById(R.id.Ampliandocontactohotel);
        resenaAhotel=findViewById(R.id.resenaAhotel);






            moldeRestaurante=(MoldeRestaurante) getIntent().getSerializableExtra("datosrestaurante");
            Toast.makeText(this, moldeRestaurante.getNombre(),Toast.LENGTH_LONG).show();


    }
}