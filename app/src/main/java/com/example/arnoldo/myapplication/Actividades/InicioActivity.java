package com.example.arnoldo.myapplication.Actividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.arnoldo.myapplication.Fragmentos.fragment_clientes;
import com.example.arnoldo.myapplication.Fragmentos.fragment_inicio;
import com.example.arnoldo.myapplication.Fragmentos.fragment_pedidos;
import com.example.arnoldo.myapplication.R;

public class InicioActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    //Se crea el menú de Navegacion entre Fragments "Inicio, Clientes y Pedidos"
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
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btnFlotante);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
       Intent intent= new Intent(InicioActivity.this,AgregarActivity.class);
            startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.drawerEdit) {
            // Handle the camera action
        } else if (id == R.id.drawerCerrarSesion) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
