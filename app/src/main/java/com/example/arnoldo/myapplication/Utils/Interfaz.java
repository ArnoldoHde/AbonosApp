package com.example.arnoldo.myapplication.Utils;

import android.os.Handler;

import com.example.arnoldo.myapplication.Modelos.ClienteData;
import com.example.arnoldo.myapplication.Modelos.LoginUsuario;
import com.example.arnoldo.myapplication.Modelos.RegistroData;
import com.example.arnoldo.myapplication.Modelos.RegistroPedido;
import com.example.arnoldo.myapplication.Modelos.Vacio;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by alan on 24/02/18.
 */

public interface Interfaz {

// se Crea una interfaz de usuario que se manda llamar en el manejador para saver que datos mandar a la API
    @POST("login")
    Call<JsonObject> iniciosesion(@Body LoginUsuario usuarioRegistrado);

    @POST("registro")
    Call<JsonObject> registra(@Body Vacio registroUsuario);

    @POST("registrarcliente")
    Call<JsonObject> clientes(@Body ClienteData clienteData);

    @POST("pedidos")
    Call<JsonObject> pedido(@Body RegistroPedido registroPedido);// no lo borren que es el de pedido w


}
