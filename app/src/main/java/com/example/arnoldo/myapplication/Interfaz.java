package com.example.arnoldo.myapplication;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by alan on 24/02/18.
 */

public interface Interfaz {

// se Crea una interfaz de usuario que se manda llamar en el manejador
    @POST("login")
    Call<JsonObject> login(@Body LoginUsuario usuarioReg);



}
