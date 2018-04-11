package com.example.arnoldo.myapplication;

import android.content.Context;

/**
 * Created by arnoldo on 10/04/18.
 */

public class Config {
    public static SharedPreferencesUser sharedPreferencesUser;

    public static void init(Context context) {

        sharedPreferencesUser = new SharedPreferencesUser(context);

    }
}
