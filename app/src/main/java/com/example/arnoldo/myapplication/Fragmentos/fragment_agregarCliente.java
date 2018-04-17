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

import com.example.arnoldo.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_agregarCliente extends Fragment {

    EditText nombre,numero,direccion;
    public static final int CAMERA_REQUEST=123;
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




}
