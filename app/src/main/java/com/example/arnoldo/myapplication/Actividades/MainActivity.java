package com.example.arnoldo.myapplication.Actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.arnoldo.myapplication.Events.LoginErrorEvent;
import com.example.arnoldo.myapplication.Events.LoginEvent;
import com.example.arnoldo.myapplication.Managers.LoginManeger;
import com.example.arnoldo.myapplication.Modelos.LoginUsuario;
import com.example.arnoldo.myapplication.R;

import java.util.regex.Pattern;

public class    MainActivity extends AppCompatActivity {
EditText email,password;
TextView tvCuenta;
Button btnIngresar;
private LoginUsuario loginUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.edtUsuario);
        password=findViewById(R.id.edtContraseña);
        tvCuenta=findViewById(R.id.tvCuenta);
        btnIngresar=findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Login();
            }
        });

        tvCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crearCuenta();
            }
        });



    }
    private  void crearCuenta(){
        Intent intent= new Intent(MainActivity.this,Registro.class);
        startActivity(intent);
    }

    //Creo el metodo para obtener el texto del layaut y validar los datos
    private void Login() {
        //valido si los campos estan bacios
        if (email.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
            Toast.makeText(this, "Los campos no deben ir vacios", Toast.LENGTH_SHORT).show();
        }

        String correo = email.getText().toString();//contiene lo que el usuario a introducido en nuestro campo de texto
        String contrasena = password.getText().toString();

        //valido si el correo es verdadero que acceda
        if (validarEmail(correo)) {
            loginUsuario = new LoginUsuario();
            loginUsuario.setCorreo(correo);
            loginUsuario.setContraseña(contrasena);

            LoginManeger.login(loginUsuario);
            Toast.makeText(this, "En proceso", Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(this, "usuario no Valido", Toast.LENGTH_SHORT).show();
        }
    }

    public void setLogin(LoginEvent event){

        Toast.makeText(this, "Bienvenido"+event.getMessage(), Toast.LENGTH_SHORT).show();
        // debo agregar el intent a la pantalla principal
        Intent intent= new Intent( MainActivity.this,InicioActivity.class);
        startActivity(intent);
    }

    public void LoginError(LoginErrorEvent event){
        Toast.makeText(this, "Fallo Error"+event.getMessage(), Toast.LENGTH_SHORT).show();
        // evento para berificar si exsite algun error en los campos
    }
    //creo el metodo para verificar si es un usuario valido
    //Pattern
    private boolean validarEmail(String email) {
            Pattern pattern = Patterns.EMAIL_ADDRESS;
            return pattern.matcher(email).matches();
        }

    }



