package com.example.h12g07practicafinal;

public class ColaGrafo {
    private ElementoCola primero; //primer elemento de la cola
    private ElementoCola ultimo; //ultimo elemento de la cola

    //Nodo interno de la cola
    private class ElementoCola {
        NodoGrafo nodo;
        ElementoCola siguiente;

        ElementoCola(NodoGrafo nodo) {
            this.nodo = nodo;
            this.siguiente = null;
        }
    }

    public ColaGrafo() {
        primero = null;
        ultimo = null;
    }

    //Añadir al final
    public void encolar(NodoGrafo nodo) {
        ElementoCola nuevo = new ElementoCola(nodo);
        if (ultimo == null) { //cola vacia
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo; //el ultimo apunta al nuevo
            ultimo = nuevo; // el nuevo pasa a ser el ultimo
        }
    }

    //Sacar del principio
    public NodoGrafo desencolar() {
        if (primero == null) return null;
        NodoGrafo nodo = primero.nodo;
        primero = primero.siguiente;
        if (primero == null) ultimo = null; //si se vacia, ambos null
        return nodo;
    }

    public boolean isEmpty() {return primero == null;}
}
