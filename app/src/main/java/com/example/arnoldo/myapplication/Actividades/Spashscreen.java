package com.example.arnoldo.myapplication.Actividades;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.example.arnoldo.myapplication.R;

import java.util.Timer;
import java.util.TimerTask;

public class Spashscreen extends AppCompatActivity {
    // tiempo del splash
    private static final long Tiempo_del_delay = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //se agrega la orientacion portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //se oculta la barra de titulo
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_spashscreen);

        TimerTask task =new TimerTask() {
            @Override
            public void run() {
                //empesar siguiente actividad
                Intent mainIntent =new Intent().setClass(Spashscreen.this, Registro.class);
                startActivity(mainIntent);
                //cerramos la actividad para que el usuario no pueda regresar a ella
                finish();
            }
        };
        Timer timer =new Timer();
        timer.schedule(task,Tiempo_del_delay);

    }
}
