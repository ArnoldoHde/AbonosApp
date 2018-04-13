package com.example.arnoldo.myapplication.Utils;

import com.example.arnoldo.myapplication.Modelos.LoginUsuario;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by alan on 24/02/18.
 */

public interface Interfaz {

// se Crea una interfaz de usuario que se manda llamar en el manejador
    @POST("login")
    Call<JsonObject> login(@Body LoginUsuario usuarioReg);



}
