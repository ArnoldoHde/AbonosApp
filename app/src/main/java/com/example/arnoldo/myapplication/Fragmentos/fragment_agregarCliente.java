package com.example.arnoldo.myapplication.Fragmentos;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.arnoldo.myapplication.Actividades.InicioActivity;
import com.example.arnoldo.myapplication.Actividades.Registro;
import com.example.arnoldo.myapplication.Events.ErrorEvent;
import com.example.arnoldo.myapplication.Events.SingUpEvent;
import com.example.arnoldo.myapplication.Managers.ClientesManager;
import com.example.arnoldo.myapplication.Modelos.ClienteData;
import com.example.arnoldo.myapplication.Modelos.RegistroData;
import com.example.arnoldo.myapplication.R;
import com.squareup.otto.Subscribe;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_agregarCliente extends Fragment {
    public static final int CAMERA_REQUEST=123;


    RadioGroup radioGroup;
    EditText nombre,numero,direccion;
    ImageView imgFoto;
    Button btnAgregar;
    String sexo;
    public fragment_agregarCliente() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_agregar_cliente, container, false);
        imgFoto=rootView.findViewById(R.id.imageFotoCliente);
        radioGroup=rootView.findViewById(R.id.rgSexo);
        nombre=rootView.findViewById(R.id.edtNombreCliente);
        numero=rootView.findViewById(R.id.edtNumeroCliente);
        direccion=rootView.findViewById(R.id.edtDireccionCliente);
        btnAgregar=rootView.findViewById(R.id.btnAgregarCliente);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarCliente();
            }
        });

        SeleccionSexo();
        imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,CAMERA_REQUEST);
            }
        });


        return rootView;



    }

    private void agregarCliente() {

        ClienteData clienteData = new ClienteData();
        clienteData.setNombre(nombre.getText().toString());
        clienteData.setNumero(numero.getText().toString());
        clienteData.setDireccion(direccion.getText().toString());
        clienteData.setFoto(imgFoto.toString());
        clienteData.setSexo(sexo.toString());
        ClientesManager.singUp(clienteData);

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if( requestCode==CAMERA_REQUEST && resultCode== Activity.RESULT_OK){
            Bitmap photo= (Bitmap)data.getExtras().get("data");
            imgFoto.setImageBitmap(photo);
        }
    }

    public void SeleccionSexo(){
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rbHombre:
                        imgFoto.setImageResource(R.drawable.hombre);
                        sexo="Hombre";
                        break;
                    case R.id.rbMujer:
                        imgFoto.setImageResource(R.drawable.mujer);
                        sexo="Mujer";
                        break;
                }
            }
        });
    }
    @Subscribe
    public void signupOk(SingUpEvent signUpEvent) {
        signUpEvent.toString();

        Toast.makeText(getContext(), "Exito: "+signUpEvent.getMessage(), Toast.LENGTH_SHORT).show();

    }

    @Subscribe
    public void signupError(ErrorEvent errorEvent) {
        Toast.makeText(getContext(), "Error: "+errorEvent.getMessage(), Toast.LENGTH_SHORT).show();
    }



}
