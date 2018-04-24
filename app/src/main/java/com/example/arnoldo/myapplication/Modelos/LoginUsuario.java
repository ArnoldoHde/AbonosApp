package com.example.arnoldo.myapplication.Modelos;

/**
 * Created by arnoldo on 10/04/18.
 */

//Son los parametros que le enviaremos a la api siempre y cuando el usuario este registrado
public class LoginUsuario {
    private String correo;
    private String contrasena;




    public LoginUsuario(String email, String password)    {
        this.correo = email;
        this.contrasena = password;



    }

    public LoginUsuario() {

        this.correo = "";
        this.contrasena = "";

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


