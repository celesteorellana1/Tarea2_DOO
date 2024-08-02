package com.celeste.miumg.edu.gt;

import java.util.List;

public abstract class Cafe {
    private String nombre;
    private int tamano;
    private double precio;

    List<Ingrediente> ingredientes;

    public Cafe(String nombre, int tamano, int precio, List<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public Cafe(String nombre, int tamano, int precio) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public abstract void  preparar();

    public abstract void servir();

}
