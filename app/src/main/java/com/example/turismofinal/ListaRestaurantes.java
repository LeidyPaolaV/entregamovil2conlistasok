package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turismofinal.Moldes.MoldeRestaurante;
import com.example.turismofinal.adaptadores.AdaptadorRestaurante;


import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<MoldeRestaurante> listaRestaurantes=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listarestaurantes);
        recyclerView=findViewById(R.id.listarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorRestaurante adaptadorRestaurante=new AdaptadorRestaurante(listaRestaurantes);
        recyclerView.setAdapter(adaptadorRestaurante);

    }
    public void llenarListaConDatos(){
        listaRestaurantes.add(new MoldeRestaurante("El Buen Sazon","3107099476", "23000 COP", "Ajiaco", R.drawable.r1, R.drawable.patio,"Todo me a encantado, vengo de otro pais y su sabor me a enloquecido"));
        listaRestaurantes.add(new MoldeRestaurante("La Cocina De Otilia","3115468265", "23000 COP", "Frijoles", R.drawable.r2, R.drawable.tyy,"Todo me a encantado, vengo de otro pais y su sabor me a enloquecido"));
        listaRestaurantes.add(new MoldeRestaurante("Comiendo","3165467844", "23000 COP", "Sancocho", R.drawable.r3, R.drawable.club,"Todo me a encantado, vengo de otro pais y su sabor me a enloquecido"));
        listaRestaurantes.add(new MoldeRestaurante("La Delicia", "3107099476","33000 COP", "sPAGGUTTIS",R.drawable.r4, R.drawable.name,"Todo me a encantado, vengo de otro pais y su sabor me a enloquecido"));
        listaRestaurantes.add(new MoldeRestaurante("El Meson", "315658456", "44000 cop","frijoles",R.drawable.r5, R.drawable.terraza,"Todo me a encantado, vengo de otro pais y su sabor me a enloquecido"));
    }
}

