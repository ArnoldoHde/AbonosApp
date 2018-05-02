package com.example.arnoldo.myapplication.Utils;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by sauceda on 2/05/18.
 */

public class App extends Application {
    public static SharedPreferences sharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();
        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);

    }

    public static SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }
}
