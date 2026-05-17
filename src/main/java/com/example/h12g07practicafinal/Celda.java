package com.example.h12g07practicafinal;

public class Celda {
    private int fila;
    private int columna;
    private boolean visitado;
    private Celda[] vecinos;
    private int numVecinos;
    private Objeto objeto;
    private Enemigo enemigo;
    private boolean trampa;

    public Celda (int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.visitado = false;
        this.vecinos = new Celda[4];
        this.numVecinos = 0;
        this.objeto = null;
        this.enemigo = null;
        this.trampa = false;
    }

    public void agregarVecino (Celda vecino) {
        if (numVecinos < 4) {
            vecinos[numVecinos] = vecino;
            numVecinos++;
        }
    }

    public Celda[] obtenerVecinos() {
        Celda[] resultado = new Celda[numVecinos];
        for (int i = 0; i < numVecinos; i++) {
            resultado[i] = vecinos[i];
        }
        return resultado;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public boolean isEmpty() {return objeto == null;}
    public boolean hayObjeto() {return objeto != null;}
    public boolean hayEnemigo() {return enemigo != null;}
    public boolean hayTrampa() {return trampa;}

    public String toString() {
        return "Celda(" + fila + ", " + columna + ")";
    }
}