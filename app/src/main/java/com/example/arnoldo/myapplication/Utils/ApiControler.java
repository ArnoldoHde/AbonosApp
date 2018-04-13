package com.example.arnoldo.myapplication.Utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by arnoldo on 10/04/18.
 */

public class ApiControler {
    public ApiControler() {
    }
 /*creo el servicio y mando llamar la url de consumo..... Esta clase la mandamos
   llamar en el manejador para posteriormente invocarla a la actividad principal*/
    public static <S> S createService(Class<S> serviceClass){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LinkConsumo.KEY_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return  retrofit.create(serviceClass);

    }
}
