package com.example.h12g07practicafinal;

public class NodoGrafo {
    public String nombre; //nombre del nodo(A, B, C...)
    public ListaNodoGrafo vecinos; //Lista de nodos conectados al nodo especifico

    public NodoGrafo(String nombre) {
        this.nombre = nombre;
        this.vecinos = new ListaNodoGrafo(); //se crea la lista vacia de vecinos
    }
}
