package com.example.turismofinal.Moldes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.turismofinal.R;

import java.io.Serializable;

public class MoldeHotel implements Serializable {

    private String nombre;
    private String precio;
    private String telefono;
    private Integer foto;
    private String valoracion;



    public MoldeHotel (){
        //constructor vacio
    }


    public MoldeHotel(String nombre, String precio, String telefono, Integer foto, String valoracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
        this.valoracion = valoracion;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getNombre (){return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}


