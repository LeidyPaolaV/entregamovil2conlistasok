package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turismofinal.Moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView AmpliandofotoHotel;
    TextView Àmpliandonombrehotel;
    TextView AmpliandoprecioHotel;
    TextView Ampliandocontactohotel;
    TextView valoracion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);


        AmpliandofotoHotel=findViewById(R.id.AmpliandofotoHotel);
        Àmpliandonombrehotel=findViewById(R.id.Àmpliandonombrehotel);
        AmpliandoprecioHotel=findViewById(R.id.AmpliandoprecioHotel);
        Ampliandocontactohotel=findViewById(R.id.Ampliandocontactohotel);
        valoracion=findViewById(R.id.valoracion);

        moldeHotel=(MoldeHotel) getIntent().getSerializableExtra("datoshotel");
        Toast.makeText(this, moldeHotel.getNombre(),Toast.LENGTH_LONG).show();

        //CARGANDO LA INFO EN LOS COMPONENTES GRAFICOS
        AmpliandofotoHotel.setImageResource(moldeHotel.getFoto());
        Àmpliandonombrehotel.setText(moldeHotel.getNombre());
        valoracion.setText(moldeHotel.getValoracion());



    }
}