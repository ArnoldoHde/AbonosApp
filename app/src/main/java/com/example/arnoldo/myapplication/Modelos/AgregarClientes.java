package com.example.arnoldo.myapplication.Modelos;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by sauceda on 24/04/18.
 */

public class AgregarClientes {
    private String sexo;
    private String nombre;
    private Number numero;
    private String direccion;
    private Image foto;

    public AgregarClientes(String sexo, String nombre, Number numero, String direccion, Image foto) {
        this.sexo = sexo;
        this.nombre = nombre;
        this.numero = numero;
        this.direccion = direccion;
        this.foto = foto;
    }

    public AgregarClientes() {
        this.sexo = "";
        this.nombre = "";
        this.numero = -1;
        this.direccion = "";
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Number getNumero() {
        return numero;
    }

    public void setNumero(Number numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }
}
