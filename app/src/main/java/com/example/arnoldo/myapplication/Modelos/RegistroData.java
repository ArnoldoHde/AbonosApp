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
    private int telefono;
    private String contraseña;



    public RegistroData(String nombre, String correo, int telefono, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.contraseña = contraseña;
    }

    public RegistroData() {
        this.nombre = "";
        this.correo = "";
        this.telefono = Integer.parseInt("");
        this.contraseña ="";
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

    public int getTelefono() {
        return Integer.parseInt(String.valueOf(telefono));
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


}
