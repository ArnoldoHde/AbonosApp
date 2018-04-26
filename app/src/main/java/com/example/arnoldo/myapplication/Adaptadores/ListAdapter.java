package com.example.arnoldo.myapplication.Adaptadores;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arnoldo.myapplication.R;

import java.util.List;
/*
public class ListAdapter extends ArrayAdapter<String> {

   private List<String> listaClientes;

    public ListAdapter( Context context, List<String> Clientes) {
        super(context, R.layout.fragment_clientes, Clientes);
        this.listaClientes = Clientes;
    }

    public View getView(int position,View convertView, ViewGroup parent){

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.fila_lista,null);

        TextView texto_principal= item.findViewById(R.id.texto_principal);
        texto_principal.setText(listaClientes.get(position).);

        TextView texto_secundario= item.findViewById(R.id.texto_secundario);
        ImageView icon =(ImageView) item.findViewById(R.id.icon);
    }
}
*/;