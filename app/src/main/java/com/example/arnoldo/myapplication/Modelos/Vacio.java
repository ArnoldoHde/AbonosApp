package com.example.arnoldo.myapplication.Modelos;

/**
 * Created by sauceda on 1/05/18.
 */

public class Vacio {

   private RegistroData usuario;

    public Vacio(RegistroData usuario) {
        this.usuario = usuario;
    }

    public Vacio() {
        this.usuario = null;

    }

    public RegistroData getUsuario() {
        return usuario;
    }

    public void setUsuario(RegistroData usuario) {
        this.usuario = usuario;
    }
}
