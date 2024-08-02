package com.celeste.miumg.edu.gt;

public class Equipo {
    private String tipo;
    private boolean estado;
    private String nombre;

    public Equipo(String tipo, boolean estado, String nombre) {
        this.tipo = tipo;
        this.estado = estado;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void Encender(){
        estado = true;
        System.out.println("El equipo esta encendido");
    }

    public void reparar(){
        estado = false;
        System.out.println("El equipo esta reparado");
        estado = true;
    }

    public void Apagar(){
        estado = false;
        System.out.println("El eqipo esta apagado");
    }
}
