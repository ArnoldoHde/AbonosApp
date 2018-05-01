package com.example.arnoldo.myapplication.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import com.example.arnoldo.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_agregarVale extends Fragment {


    AutoCompleteTextView tvBuscarClienteVale;
    EditText edtEmpresa, edtCostoVale;
    Button btnAgregarVale;
    public fragment_agregarVale() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.fragment_agregar_cliente, container, false);
        tvBuscarClienteVale=rootView.findViewById(R.id.tvBuscarClienteVale);
        edtEmpresa=rootView.findViewById(R.id.edtEmpresaDeVale);
        edtCostoVale=rootView.findViewById(R.id.edtCostoDeVale);
        btnAgregarVale=rootView.findViewById(R.id.btnAgregarVale);




        return rootView;
    }

}
