package com.example.arnoldo.myapplication.Adaptadores;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arnoldo.myapplication.R;

public class ListAdapter extends ArrayAdapter<String> {

    private  final Activity context;
    private  final String[] itemname;
    private  final Integer[] integers;

    public ListAdapter(Activity context, String[] itemname, Integer[] integers, Activity context1, String[] itemname1, Integer[] integers1){
        super(context, R.layout.fila_lista, itemname);
        this.context = context1;
        this.itemname = itemname1;
        this.integers = integers1;
    }

    public View getView(int posicion, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.fila_lista,null,true);

        TextView txtTitle =  rowView.findViewById(R.id.texto_principal);
        ImageView imageView = rowView.findViewById(R.id.icon);
        TextView etxDescripcion = rowView.findViewById(R.id.texto_secundario);

        txtTitle.setText(itemname[posicion]);
        imageView.setImageResource(integers[posicion]);
        etxDescripcion.setText("Descripción"+itemname[posicion]);

        return rowView;
    }

}
