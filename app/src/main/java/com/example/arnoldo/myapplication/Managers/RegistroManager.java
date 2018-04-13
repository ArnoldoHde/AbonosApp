package com.example.arnoldo.myapplication.Managers;

import com.example.arnoldo.myapplication.Modelos.RegistroData;

/**
 * Created by alan on 11/04/18.
 */

public class RegistroManager {
    public static void singUp(RegistroData registro) {
        /*Call<JsonObject> callResponse = ApiControler
                .createService(Interfaz.class)
                //.singUp(registro);
        callResponse.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.isSuccessful()) {
                    Gson gson = new Gson();
                    JsonElement respuesta = response.body().get("result");
                    Boolean respuesta1 = respuesta.getAsBoolean();

                    if (respuesta1) {
                        JsonElement token = response.body().get("auth_token");
                      //  Config.sharedPreferencesUser.saveSession(token.toString());
                        String mesaje = token.toString();
                        BusProvider.getInstnce().post((new SingUpEvent(mesaje)));
                    }else{
                       // BusProvider.getInstnce().post(new ErrorEvent(response.message(), 0));
                    }

                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                //BusProvider.getInstnce().post(new ErrorEvent(t.getMessage(), 0));

            }
        });
*/
    }
}
