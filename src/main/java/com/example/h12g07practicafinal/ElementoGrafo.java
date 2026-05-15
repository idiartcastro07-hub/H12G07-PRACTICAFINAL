package com.example.h12g07practicafinal;

public class ElementoGrafo {
    public NodoGrafo nodo; //nodo real del grafo
    public ElementoGrafo siguiente; // enlace al siguiente elemento

    public ElementoGrafo(NodoGrafo nodo) {
        this.nodo = nodo;
        this.siguiente = null;
    }
}
