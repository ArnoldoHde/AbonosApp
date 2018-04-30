package com.example.arnoldo.myapplication.Modelos;

public class ClienteData {

   private String nombre,sexo,direccion,foto,numero;

    public ClienteData(String numero, String nombre, String sexo, String direccion, String foto) {

    }

    public ClienteData() {
        this.nombre = "";
        this.numero = "";
        this.direccion = "";
        this.foto = "";
        this.sexo = "";
        }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
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
