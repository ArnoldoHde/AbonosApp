package com.example.arnoldo.myapplication.Actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SearchView;

import com.example.arnoldo.myapplication.Modelos.RegistroPedido;
import com.example.arnoldo.myapplication.R;

public class Pedidos extends AppCompatActivity {
 // declaraión de variables
    SearchView shBuscar;
    private RegistroPedido registroPedido;
    RadioGroup Venta_Pedido;
    RadioButton rbVenta,rbPedido;
    EditText cliente,edtModelo,edtCantidad,edtProducto,edtTalla,edtColor,edtCostoProd;
    Button btnAgregar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_agregar_pedido);

       shBuscar.findViewById(R.id.shBuscarCliente);
       Venta_Pedido=findViewById(R.id.rgVenta_Pedido);
        cliente=findViewById(R.id.shBuscarCliente);
        edtModelo=findViewById(R.id.edtClave);
        edtCantidad=findViewById(R.id.edtCantidad);
        edtProducto=findViewById(R.id.edtProducto);
        edtTalla=findViewById(R.id.edtTalla);
        edtColor=findViewById(R.id.edtColor);
        edtCostoProd=findViewById(R.id.edtCostoProducto);
        rbVenta=findViewById(R.id.rbVenta);
        rbPedido=findViewById(R.id.rbPedido);
        btnAgregar=findViewById(R.id.btnAgregarPedido);
        // se creo un arreglo para guardar el numero de venta o pedido que sea
        final int pedidos [];
        pedidos= new int [10];

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AgregarPedido();
            }

            public void AgregarPedido(){
                String modelo= edtModelo.getText().toString();
                int cantidad=Integer.parseInt(edtCantidad.getText().toString());
                String producto=edtProducto.getText().toString();
                String talla=edtTalla.getText().toString();
                String color=edtColor.getText().toString();
                int costo=Integer.parseInt(edtCostoProd.getText().toString());
                //si se ha pulsado el radioButton de venta que envie esos datos
            if (rbVenta.isChecked()==true){//el for nos servira para guaradar el numero de ventas en un arreglo
                for(int valor=0;valor<=pedidos.length;valor ++) {

                    registroPedido = new RegistroPedido();
                    registroPedido.setModelo(modelo);
                    registroPedido.setCantidad(cantidad);
                    registroPedido.setProducto(producto);
                    registroPedido.setTalla(talla);
                    registroPedido.setColor(color);
                    registroPedido.setCosto(costo);
                    registroPedido.setVenta(valor);

                }
                // necesito el manejador indicado para mandarlos datos

 }
            if(rbPedido.isChecked()==true) {
                for(int valor=0;valor<=pedidos.length;valor ++){
                registroPedido = new RegistroPedido();
                registroPedido.setModelo(modelo);
                registroPedido.setCantidad(cantidad);
                registroPedido.setProducto(producto);
                registroPedido.setTalla(talla);
                registroPedido.setColor(color);
                registroPedido.setCosto(costo);
                registroPedido.setVenta(valor);
            }
            }else {

                }
            }
        });

    }
}
