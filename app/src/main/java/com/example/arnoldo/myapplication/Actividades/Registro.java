package com.example.arnoldo.myapplication.Actividades;

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
EditText cPass,Nombre,Pass,Email,edtTelefono;
Button btnRegistro;


    private RegistroData registroUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        cPass=findViewById(R.id.cPass);
        Pass=findViewById(R.id.Pass);
        Nombre=findViewById(R.id.Nombre);
        Email=findViewById(R.id.E_mail);
        edtTelefono=findViewById(R.id.Tell);
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

        if (Nombre.getText().toString().isEmpty() || Pass.getText().toString().isEmpty()||Pass.getText().toString().isEmpty()||Email.getText().toString().isEmpty()||
                edtTelefono.getText().toString().isEmpty()||cPass.getText().toString().isEmpty()) {
            Toast.makeText(this, "Los campos no deben ir vacios", Toast.LENGTH_SHORT).show();
        } else {


            String nombre = Nombre.getText().toString();
            String email = Email.getText().toString();
            String pass = Pass.getText().toString();
            String confirmPass = cPass.getText().toString();
            String telefono = edtTelefono.getText().toString();
            int tel = Integer.parseInt(telefono);
            RegistroData registroData = new RegistroData();
            registroData.setNombre(Nombre.getText().toString());
            registroData.setCorreo(Email.getText().toString());
            registroData.setTelefono(tel);
            registroData.setContraseña(Pass.getText().toString());
            RegistroManager.singUp(registroData);

        }
    }

    @Subscribe
    public void signupOk(SingUpEvent signUpEvent) {
        signUpEvent.toString();
    }

    @Subscribe
    public void signupError(LoginErrorEvent errorEvent) {
        Toast.makeText(this, "Error: "+errorEvent.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
