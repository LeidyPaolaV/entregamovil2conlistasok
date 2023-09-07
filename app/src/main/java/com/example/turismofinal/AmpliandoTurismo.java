package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turismofinal.Moldes.MoldeRestaurante;
import com.example.turismofinal.Moldes.MoldeTurismo;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeTurismo moldeTurismo;
    TextView Àmpliandonombreturismo;
    ImageView Ampliandofototurismo;
    TextView Ampliandoprecioturismo;
    TextView Ampliandocontactoturismo;
    TextView resenaAturismo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        Àmpliandonombreturismo.findViewById(R.id.Àmpliandonombreturismo);
        Ampliandofototurismo.findViewById(R.id.Ampliandofototurismo);
        Ampliandoprecioturismo.findViewById(R.id.Ampliandoprecioturismo);
        Ampliandocontactoturismo.findViewById(R.id.Ampliandocontactoturismo);
        resenaAturismo.findViewById(R.id.resenaAturismo);





        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datosturismo");
        //Toast.makeText(this, moldeTurismo.getNombre(),Toast.LENGTH_LONG).show();

    }
}