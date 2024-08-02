package com.celeste.miumg.edu.gt;

public class Espuma implements Ingrediente{
    private String nombre;
    private int cantidad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Espuma(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getCantidad() {
        return this.cantidad;
    }
}
