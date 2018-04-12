package com.example.arnoldo.myapplication;

/**
 * Created by arnoldo on 10/04/18.
 */

//Son los parametros que le enviaremos a la api siempre y cuando el usuario este registrado
public class LoginUsuario {
    private String email;
    private String password;



    public LoginUsuario(String email, String password)

    {
        this.email = email;
        this.password = password;


    }

    public LoginUsuario() {

        this.email = "";
        this.password = "";

    }

    public String getCorreo() {
        return email;
    }

    public void setCorreo(String correo) {
        this.email = correo;
    }

    public String getContraseña() {
        return password;
    }

    public void setContraseña(String contraseña) {
        this.password = contraseña;
    }
}


