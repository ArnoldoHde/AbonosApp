package com.example.arnoldo.myapplication.Modelos;

public class ClienteData {
   private int numero;
   private String nombre,sexo,direccion,foto;

    public ClienteData(int numero, String nombre, String sexo, String direccion, String foto) {

    }

    public ClienteData() {
        this.nombre = "";
        this.numero = 0;
        this.direccion = "";
        this.foto = "";
        this.sexo = "";
        }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
