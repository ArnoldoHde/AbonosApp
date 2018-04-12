package com.example.arnoldo.myapplication.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.arnoldo.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_clientes extends Fragment {


    TextView tv;
    public fragment_clientes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_clientes, container, false);
        tv= rootView.findViewById(R.id.tvcliente);

        return rootView;

    }

}
