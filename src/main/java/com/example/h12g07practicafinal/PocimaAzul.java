package com.example.h12g07practicafinal;

public class PocimaAzul extends Objeto{
    private int vidaExtra;

    public PocimaAzul(int vidaExtra, String nombre, int valor) {
        super(nombre, valor);
        this.vidaExtra = vidaExtra;
    }

    public int getVidaExtra() {
        return vidaExtra;
    }
    public void setVidaExtra(int vidaExtra) {
        this.vidaExtra = vidaExtra;
    }
}
