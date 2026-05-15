package com.example.h12g07practicafinal;

public class Celda {
    private int fila, columna;
    private Objeto objeto;
    private Enemigo enemigo;
    private boolean trampa;

    public boolean isEmpty() {return objeto == null;}
    public boolean hayObjeto() {return objeto != null;}
    public boolean hayEnemigo() {return enemigo != null;}
    public boolean hayTrampa() {return trampa;}
}