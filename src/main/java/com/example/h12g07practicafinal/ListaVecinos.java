package com.example.h12g07practicafinal;

public class ListaVecinos {
    private NodoLista primero;
    private int tamano;

    public ListaVecinos() {
        this.primero = null;
        this.tamano = 0;
    }

    public void addCelda(Celda celda) {
        NodoLista nuevo = new NodoLista(celda);

        if (primero == null) {
            primero = nuevo;
        } else {
            NodoLista actual = primero;
            while (actual.siguiente != null)  {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        tamano++;
    }
    public Celda getCelda(int i) {
        if (i < 0 || i >= tamano) {
            return null;
        }
        NodoLista actual = primero;
        for (int j = 0; j < i; j++) {
            actual = actual.siguiente;
        }
        return actual.celda;
    }

    public boolean isEmpty() {return primero == null;}
    public int getTamano() {return tamano;}

    public String toString() {
        String resultado = "";
        NodoLista actual = primero;
        while (actual != null) {
            resultado += "[" +actual.celda.getFila() + "," + actual.celda.getColumna() + "]";
            if (actual.siguiente != null) resultado += "-";
            actual = actual.siguiente;
        }
        return resultado;
    }
}
