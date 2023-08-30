package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turismofinal.Moldes.MoldeHotel;
import com.example.turismofinal.adaptadores.AdaptadorHotel;


import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorHotel adaptadorHoteles=new AdaptadorHotel(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);

    }
    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel("Hotel casa Benigno", "$80000 COP", "3107099476",R.drawable.h1));
        listaHoteles.add(new MoldeHotel("Hotel caña de azùcar", "$150000 COP", "3225457893",R.drawable.h2));
        listaHoteles.add(new MoldeHotel("Hotel flor de durazno", "$180000 COP", "3152635846",R.drawable.h3));
        listaHoteles.add(new MoldeHotel("Hotel la campera", "$200000 COP", "3053425935",R.drawable.h4));
        listaHoteles.add(new MoldeHotel("Hotel villas vieja", "$350000 COP", "3286471200",R.drawable.h5));
    }
}


