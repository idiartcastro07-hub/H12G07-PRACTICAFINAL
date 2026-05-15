package com.example.h12g07practicafinal;

public class ObjetoDefensa extends Objeto{
    private int defensaExtra;

    public ObjetoDefensa(int defensaExtra, String nombre, int valor){
        super(nombre, valor);
        this.defensaExtra = defensaExtra;
    }

    public int getDefensaExtra() {
        return defensaExtra;
    }
    public void setDefensaExtra(int defensaExtra) {
        this.defensaExtra = defensaExtra;
    }
}
