package com.example.h12g07practicafinal;

public class Arma extends Objeto{
    private int ataqueExtra;

    public Arma(int ataqueExtra,  String nombre, int valor) {
        super(nombre, valor);
        this.ataqueExtra = ataqueExtra;
    }
    public int getataqueExtra() {
        return ataqueExtra;
    }
    public void setataqueExtra(int ataqueExtra) {
        this.ataqueExtra = ataqueExtra;
    }
}
