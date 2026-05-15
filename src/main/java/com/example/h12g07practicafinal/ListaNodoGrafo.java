package com.example.h12g07practicafinal;

public class ListaNodoGrafo {
    private ElementoGrafo primero; //primer elemento de la lista

    public ListaNodoGrafo() {
        this.primero = null; //lista vacia
    }
    //Añade un nodo al principio de la lista
    public void addNodo(NodoGrafo nodo) {
        ElementoGrafo nuevo = new ElementoGrafo(nodo); //crea un nuevo nodo
        nuevo.siguiente = primero; //el nuevo apunta al viejo nodo
        primero = nuevo; //el nuevo nodo es el primero
    }
    public ElementoGrafo getPrimero() {
        return primero;
    }
    //Comprueba si un nodo esta en la lista
    public boolean contiene(NodoGrafo nodo) {
        ElementoGrafo aux = primero;
        while (aux != null) {
            if (aux.nodo == nodo) return true; //comparacion por referencia
            aux = aux.siguiente;
        }
        return false;
    }
}
