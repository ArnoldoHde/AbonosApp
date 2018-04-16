package com.example.arnoldo.myapplication.Actividades;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.arnoldo.myapplication.Fragmentos.fragment_agregarCliente;
import com.example.arnoldo.myapplication.Fragmentos.fragment_agregarPedido;
import com.example.arnoldo.myapplication.Fragmentos.fragment_agregarVale;
import com.example.arnoldo.myapplication.R;

public class AgregarActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.agregarCliente:
                    Fragment FragmentClienteAdd= new fragment_agregarCliente();
                    FragmentManager fmAddCliente=getSupportFragmentManager();
                    fmAddCliente.beginTransaction().replace(R.id.contenedorAgregar,FragmentClienteAdd).commit();
                    return true;
                case R.id.agregarPedido:
                    Fragment FragmentPedidoAdd= new fragment_agregarPedido();
                    FragmentManager fmAddPedidos=getSupportFragmentManager();
                    fmAddPedidos.beginTransaction().replace(R.id.contenedorAgregar,FragmentPedidoAdd).commit();
                    return true;
                case R.id.agregarVale:
                    Fragment FragmentValeAdd= new fragment_agregarVale();
                    FragmentManager fmAddVale=getSupportFragmentManager();
                    fmAddVale.beginTransaction().replace(R.id.contenedorAgregar,FragmentValeAdd).commit();
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationAgregar);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }
}
