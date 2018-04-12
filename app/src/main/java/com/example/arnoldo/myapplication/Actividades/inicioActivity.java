package com.example.arnoldo.myapplication.Actividades;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.arnoldo.myapplication.Fragmentos.fragment_clientes;
import com.example.arnoldo.myapplication.Fragmentos.fragment_inicio;
import com.example.arnoldo.myapplication.Fragmentos.fragment_pedidos;
import com.example.arnoldo.myapplication.R;

public class inicioActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_inicio:
                    Fragment FragmentInicio= new fragment_inicio();
                    FragmentManager fminicio=getSupportFragmentManager();
                    fminicio.beginTransaction().replace(R.id.contenedor,FragmentInicio).commit();
                    return true;
                case R.id.navigation_clientes:
                    Fragment FragmentCliente= new fragment_clientes();
                    FragmentManager fmclientes=getSupportFragmentManager();
                    fmclientes.beginTransaction().replace(R.id.contenedor,FragmentCliente).commit();
                    return true;
                case R.id.navigation_pedidos:
                    Fragment FragmentPedidos= new fragment_pedidos();
                    FragmentManager fmpedidos=getSupportFragmentManager();
                    fmpedidos.beginTransaction().replace(R.id.contenedor,FragmentPedidos).commit();
                    return true;
            }
            return false;
        }
    };@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
