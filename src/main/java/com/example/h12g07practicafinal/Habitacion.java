package com.example.h12g07practicafinal;

public class Habitacion extends Celda {
    private int ancho;
    private int alto;
    private Celda[][] cuadricula;

    public Habitacion(int fila, int columna, int ancho, int alto) {
        super(fila, columna);
        this.ancho = ancho;
        this.alto = alto;
        this.cuadricula = new Celda[ancho][alto];
    }

    public void construirMatriz() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i > 0) cuadricula[i][j].agregarVecino(cuadricula[i-1][j]);
                if (i < alto -1) cuadricula [i][j].agregarVecino(cuadricula[i+1][j]);
                if (j > 0) cuadricula[i][j].agregarVecino(cuadricula[i][j-1]);
                if (j < ancho -1) cuadricula[i][j].agregarVecino(cuadricula[i][j+1]);
            }
        }
    }

    public Celda obtenerCelda(int x, int y) {
        if (x >= 0 && x < alto && y >= 0 && y < ancho) {
            return cuadricula[x][y];
        }
        return null;
    }

    public int getAncho () {
        return ancho;
    }

    public int getAlto () {
        return alto;
    }

    public String toString () {
        return "Habitacion(" + getFila() + "," + getColumna() + ")";
    }


}