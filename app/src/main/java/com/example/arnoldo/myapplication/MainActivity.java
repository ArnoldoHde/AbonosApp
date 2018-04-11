package com.example.arnoldo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText email,password;
TextView tvOlvidastecontra,tvCuenta;
Button btnIngresar;
private LoginUsuario loginUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Prueba
        email=findViewById(R.id.edtUsuario);
        password=findViewById(R.id.edtContraseña);
        tvOlvidastecontra=findViewById(R.id.tvOlvidastecontra);
        tvCuenta=findViewById(R.id.tvCuenta);
        btnIngresar=findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();


            }
        });
        //Prueba Conexion de Alan

    }
    //Creo el metodo para obtener el texto del layaut y validar los datos
    private void Login() {
        //valido si los campos estan bacios

        if (email.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
            Toast.makeText(this, "Los campos o Algun campo estan vacio", Toast.LENGTH_SHORT).show();
        } else {
            String correo = email.getText().toString();
            String contraseña = password.getText().toString();

            loginUsuario = new LoginUsuario();
            loginUsuario.setCorreo(correo);
            loginUsuario.setContraseña(contraseña);

            LoginManeger.login(loginUsuario);

        }
    }
    public void setLogin(LoginEvent event){

        Toast.makeText(this, "Bienvenido"+event.getMessage(), Toast.LENGTH_SHORT).show();

    }

    public void LoginError(LoginErrorEvent event){
        Toast.makeText(this, "Fallo Error"+event.getMessage(), Toast.LENGTH_SHORT).show();
    }
}