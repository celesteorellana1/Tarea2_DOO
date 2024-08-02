package com.celeste.miumg.edu.gt;

public class CafeExpressoItaliano extends Cafe{

    private int intesidad;

    public CafeExpressoItaliano(String nombre, int tamano, int precio, int intesidad) {
        super(nombre, tamano, precio);
        this.intesidad = intesidad;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Cafe Expresso");
    }

    @Override
    public void servir() {
        System.out.println("Servir CafeExpresso");
    }
}
