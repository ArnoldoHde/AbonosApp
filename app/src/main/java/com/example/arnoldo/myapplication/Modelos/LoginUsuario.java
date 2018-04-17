package com.example.arnoldo.myapplication.Modelos;

/**
 * Created by arnoldo on 10/04/18.
 */

//Son los parametros que le enviaremos a la api siempre y cuando el usuario este registrado
public class LoginUsuario {
    private String correo;
    private String contrasena;
    private int telefono;



    public LoginUsuario(String email, String password, int telefono)    {
        this.correo = email;
        this.contrasena = password;
        this.telefono = telefono;


    }

    public LoginUsuario() {

        this.correo = "";
        this.contrasena = "";
        this.telefono =0;

    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contrasena;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }
}


