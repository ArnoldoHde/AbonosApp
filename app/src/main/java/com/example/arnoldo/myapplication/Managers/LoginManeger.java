package com.example.arnoldo.myapplication.Managers;
import com.example.arnoldo.myapplication.Events.ErrorEvent;
import com.example.arnoldo.myapplication.Events.LoginEvent;
import com.example.arnoldo.myapplication.Utils.Interfaz;
import com.example.arnoldo.myapplication.Modelos.LoginUsuario;
import com.example.arnoldo.myapplication.Utils.ApiControler;
import com.example.arnoldo.myapplication.Utils.BusProvider;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by arnoldo on 10/04/18.
 */
/*Aqui en el manejador se mandan llamar las diferentes actividades que se necesitan para enviar
    la informacion, validar si es correcto y obtener la respuesta del la api.*/
public class LoginManeger {
    public static void login(LoginUsuario usuarioRegistrado) {

        Call<JsonObject> callResponse = ApiControler
                .createService(Interfaz.class)
                .iniciosesion(usuarioRegistrado);
        callResponse.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                //Se valida si los datos enviados son correctos se manda el token generado
                if (response.isSuccessful()) {

                    Gson gson = new Gson();

                    JsonObject respuesta = response.body();
                    JsonElement token = respuesta.get("autorizacion");
                    Config.sharedPreferencesUser.saveSession(token.toString());
                    String mesaje = token.toString();
                    BusProvider.getInstnce().post((new LoginEvent(mesaje)));

                } else {
      //en caso de que alla un error en el servidor se cachara y se plasma en pantalla
                    BusProvider.getInstnce().post(new ErrorEvent(response.message(), 0));
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                BusProvider.getInstnce().post(new ErrorEvent(t.getMessage(), 0));

            }
        });

    }
}
