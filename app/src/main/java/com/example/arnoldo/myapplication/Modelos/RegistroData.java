package com.example.arnoldo.myapplication.Modelos;

/**
 * Created by alan on 11/04/18.
 */
//sustituir por los campos de la api
    //crear constructores
    //crear getters and setters

public class RegistroData {
    private String nombre;
    private String correo;
    private String telefono;
    private String contrasena;
    private String confirmar;



    public RegistroData(String nombre, String correo, String telefono, String contrasena,String confirmar) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.confirmar=confirmar;
    }

    public RegistroData() {
        this.nombre = "";
        this.correo = "";
        this.telefono = "";
        this.contrasena ="";
        this.confirmar="";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getConfirmar() {
        return confirmar;
    }

    public void setConfirmar(String confirmar) {
        this.confirmar = confirmar;
    }
}
