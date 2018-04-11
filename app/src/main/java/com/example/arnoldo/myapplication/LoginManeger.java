package com.example.arnoldo.myapplication;

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
    public static void login(LoginUsuario usuarioReg) {

        Call<JsonObject> callResponse = ApiControler
                .createService(Interfaz.class)
                .login(usuarioReg);
        callResponse.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.isSuccessful()) {

                    Gson gson = new Gson();

                    JsonObject respuesta = response.body();
                    JsonElement token = respuesta.get("auth_token");
                    Config.sharedPreferencesUser.saveSession(token.toString());
                    String mesaje = token.toString();
                    BusProvider.getInstnce().post((new LoginEvent(mesaje)));



                } else {
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
