package com.example.arnoldo.myapplication.Managers;

import android.content.Context;

import com.example.arnoldo.myapplication.Managers.SharedPreferencesUser;

/**
 * Created by arnoldo on 10/04/18.
 */
//utilize la clase config para inizializar la clase share preferens y poder aser uso de ella
public class Config {
    public static SharedPreferencesUser sharedPreferencesUser;

    public static void init(Context context) {

        sharedPreferencesUser = new SharedPreferencesUser(context);

    }
}
