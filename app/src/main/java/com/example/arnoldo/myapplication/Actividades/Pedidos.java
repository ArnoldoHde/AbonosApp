package com.example.arnoldo.myapplication.Actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.arnoldo.myapplication.Modelos.RegistroPedido;
import com.example.arnoldo.myapplication.R;

public class Pedidos extends AppCompatActivity {

    private RegistroPedido registroPedido;
    RadioButton rbVenta,rbPedido;
    EditText edtBuscarCliente,edtModelo,edtCantidad,edtProducto,edtTalla,edtColor,edtCostoProd;
    Button btnAgregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_agregar_pedido);
        edtBuscarCliente=findViewById(R.id.edtBuscarCliente);
        edtModelo=findViewById(R.id.edtClave);
        edtCantidad=findViewById(R.id.edtCantidad);
        edtProducto=findViewById(R.id.edtProducto);
        edtTalla=findViewById(R.id.edtTalla);
        edtColor=findViewById(R.id.edtColor);
        edtCostoProd=findViewById(R.id.edtCostoProducto);
        rbVenta=findViewById(R.id.rbHombre);
        rbPedido=findViewById(R.id.rbMujer);
        btnAgregar=findViewById(R.id.btnAgregarPedido);
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

            public void AgregarPedido(){
            if (rbVenta.isChecked()==true){

                registroPedido= new RegistroPedido();


            }
            if(rbPedido.isChecked()==true){

                }else {

                }
            }
        });

    }
}
