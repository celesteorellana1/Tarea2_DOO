package com.celeste.miumg.edu.gt;

public class CafeColombiano extends Cafe{

    private String tipoGrano;

    public CafeColombiano(String nombre, int tamano, int precio, String tipoGrano) {
        super(nombre, tamano, precio);
        this.tipoGrano = tipoGrano;
    }

    public String getTipoGrano() {
        return tipoGrano;
    }

    public void setTipoGrano(String tipoGrano) {
        this.tipoGrano = tipoGrano;
    }

    @Override
    public void preparar() {
        System.out.println("preparando cafe colombiano");
    }

    @Override
    public void servir() {
        System.out.println("servir cafe colombiano");

    }
}
