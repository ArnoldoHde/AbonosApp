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



    public RegistroData(String nombre, String correo, String telefono, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
    }

    public RegistroData() {
        this.nombre = "";
        this.correo = "";
        this.telefono = "";
        this.contrasena ="";
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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contrasena;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }


}
