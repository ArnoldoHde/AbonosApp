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

import com.example.arnoldo.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_agregarCliente extends Fragment {
    public static final int CAMERA_REQUEST=123;


    RadioGroup radioGroup;
    EditText nombre,numero,direccion;
    ImageView imgFoto;
    Button btnAgregar;

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
                        break;
                    case R.id.rbMujer:
                        imgFoto.setImageResource(R.drawable.mujer);
                        break;
                }
            }
        });
    }




}
