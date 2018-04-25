package com.example.arnoldo.myapplication.Utils;

import com.example.arnoldo.myapplication.Modelos.LoginUsuario;
import com.example.arnoldo.myapplication.Modelos.RegistroData;
import com.example.arnoldo.myapplication.Modelos.RegistroPedido;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by alan on 24/02/18.
 */

public interface Interfaz {

// se Crea una interfaz de usuario que se manda llamar en el manejador para saver que datos mandar a la API
    @POST("login")
    Call<JsonObject> iniciosesion(@Body LoginUsuario usuarioRegistrado);

    @POST("re")
    Call<JsonObject> usuario(@Body RegistroData registroUsuario);

    @POST("pedidos")
    Call<JsonObject> pedido(@Body RegistroPedido registroPedido);


}
