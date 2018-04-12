package com.example.arnoldo.myapplication.Actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.arnoldo.myapplication.Modelos.RegistroData;
import com.example.arnoldo.myapplication.R;

public class Registro extends AppCompatActivity {
EditText cPass,Nombre,Pass,Email,Telefono;
Button btnRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        cPass=findViewById(R.id.cPass);
        Pass=findViewById(R.id.Pass);
        Nombre=findViewById(R.id.Nombre);
        Email=findViewById(R.id.E_mail);
        Telefono=findViewById(R.id.Tell);
        btnRegistro=findViewById(R.id.btnRegistrar);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegistroData registroData = new RegistroData();

            }
        });
    }
}
