package com.example.arnoldo.myapplication.Actividades;

import android.content.Intent;
import android.os.UserManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.arnoldo.myapplication.Events.LoginErrorEvent;
import com.example.arnoldo.myapplication.Events.SingUpEvent;
import com.example.arnoldo.myapplication.Managers.LoginManeger;
import com.example.arnoldo.myapplication.Managers.RegistroManager;
import com.example.arnoldo.myapplication.Modelos.LoginUsuario;
import com.example.arnoldo.myapplication.Modelos.RegistroData;
import com.example.arnoldo.myapplication.R;
import com.squareup.otto.Subscribe;

public class Registro extends AppCompatActivity {
EditText edtCpass,edtNombre,edtPass,edtEmail,edtTelefono;
Button btnRegistro;


    private RegistroData registroUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        edtCpass=findViewById(R.id.edtCpass);
        edtPass=findViewById(R.id.edtPass);
        edtNombre=findViewById(R.id.edtNombre);
        edtEmail=findViewById(R.id.edtE_mail);
        edtTelefono=findViewById(R.id.edtTell);
        btnRegistro=findViewById(R.id.btnRegistrar);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                               SingUp();

            }
        });
    }

    private void SingUp() {
        //valido si los campos estan bacios
         if (edtNombre.getText().toString().isEmpty() || edtPass.getText().toString().isEmpty() || edtEmail.getText().toString().isEmpty() ||
                           edtTelefono.getText().toString().isEmpty() || edtCpass.getText().toString().isEmpty()) {

             Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT);

         }else {

                if (edtCpass.getText().toString() == edtPass.getText().toString())  {

                    String nombre = edtNombre.getText().toString();
                    String email = edtEmail.getText().toString();
                    String pass = edtPass.getText().toString();
                    String telefono = edtTelefono.getText().toString();
                    RegistroData registroData = new RegistroData();
                    registroData.setNombre(nombre);
                    registroData.setCorreo(email);
                    registroData.setTelefono(telefono);
                    registroData.setContrasena(pass);
                    RegistroManager.singUp(registroData);

                }else {
                    Toast.makeText(this, "Los campos no deben estar vacios", Toast.LENGTH_SHORT).show();
                }


            }
        }


    @Subscribe
    public void signupOk(SingUpEvent signUpEvent) {
        signUpEvent.toString();

        Intent intent = new Intent(Registro.this, InicioActivity.class);
        startActivity(intent);
    }

    @Subscribe
    public void signupError(LoginErrorEvent errorEvent) {
        Toast.makeText(this, "Error: "+errorEvent.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
