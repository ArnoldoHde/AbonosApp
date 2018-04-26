package com.example.arnoldo.myapplication.Managers;

import android.content.Intent;
import android.widget.Toast;

import com.example.arnoldo.myapplication.Actividades.InicioActivity;
import com.example.arnoldo.myapplication.Events.SingUpEvent;
import com.example.arnoldo.myapplication.Modelos.RegistroData;
import com.example.arnoldo.myapplication.Utils.ApiControler;
import com.example.arnoldo.myapplication.Utils.BusProvider;
import com.example.arnoldo.myapplication.Utils.Interfaz;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by alan on 11/04/18.
 */

public class RegistroManager {
    public static void singUp(RegistroData registro) {
        Call<JsonObject> callResponse = ApiControler
                .createService(Interfaz.class)
                .registro(registro);
        callResponse.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.isSuccessful()) {
                    Gson gson = new Gson();
                    JsonElement respuesta = response.body().get("success");
                    Boolean respuesta1 = respuesta.getAsBoolean();

                    if (respuesta1) {
                        JsonElement token = response.body().get("token");
                       Config.sharedPreferencesUser.saveSession(token.toString());
                        String mesaje = token.toString();
                        BusProvider.getInstnce().post((new SingUpEvent(mesaje)));


                    }else{
                        BusProvider.getInstnce().post(new ErrorEvent(response.message(), 0));
                    }

                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                BusProvider.getInstnce().post(new ErrorEvent(t.getMessage(), 0));

            }
        });

    }
}
