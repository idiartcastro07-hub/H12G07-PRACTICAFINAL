package com.example.h12g07practicafinal;

public class PocimaVerde extends Objeto {
    private int poderExtra;

    public PocimaVerde(int poderExtra, String nombre, int valor) {
        super (nombre, valor);
        this.poderExtra = poderExtra;
    }

    public int getPoderExtra() {
        return poderExtra;
    }
    public void setPoderExtra(int poderExtra) {
        this.poderExtra = poderExtra;
    }
}
