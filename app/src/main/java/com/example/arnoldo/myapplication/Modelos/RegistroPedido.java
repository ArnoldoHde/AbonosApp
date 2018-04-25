package com.example.arnoldo.myapplication.Modelos;

/**
 * Created by arnoldo on 24/04/18.
 */

public class RegistroPedido {
 private String modelo;
 private int cantidad;
 private String producto;
 private int talla;
 private String color;
 private int costo;
 private int venta;
 private int pedido;

    public RegistroPedido(String modelo, int cantidad, String producto, int talla, String color, int costo, int venta, int pedido) {
        this.modelo = modelo;
        this.cantidad = cantidad;
        this.producto = producto;
        this.talla = talla;
        this.color = color;
        this.costo = costo;
        this.venta = venta;
        this.pedido = pedido;
    }

    public RegistroPedido() {
        this.modelo = "";
        this.cantidad = 0;
        this.producto = "";
        this.talla = 0;
        this.color = "";
        this.costo = 0;
        this.venta = 0;
        this.pedido = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }
}
