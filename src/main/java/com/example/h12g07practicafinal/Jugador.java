package com.example.h12g07practicafinal;

public class Jugador {
    // Atributos privados de la clase que el jugador debe tener obligatoriamente
    private int vida;
    private int ataque;
    private int defensa;
    private int capacidadMovimiento;
    private int inventarioDeObjetos;
    private int posicionEnHabitacion;

    public Jugador(int vida, int ataque, int defensa, int capacidadMovimiento, int inventarioDeObjetos, int posicionEnHabitacion) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.capacidadMovimiento = capacidadMovimiento;
        this.inventarioDeObjetos = inventarioDeObjetos;
        this.posicionEnHabitacion = posicionEnHabitacion;
    }

    // Getters y setters de los atributos
    /* A diferencia del enemigo el jugador si que tiene setters de la defensa y el ataque porque existiran pociones
    que aumentaran el numero de estos atributos */
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int  getCapacidadMovimiento() {
        return capacidadMovimiento;
    }
    public void setCapacidadMoviemiento(int capacidadMoviemiento) {
        this.capacidadMovimiento = capacidadMoviemiento;
    }

    public int getInventarioDeObjetos() {
        return inventarioDeObjetos;
    }
    public void setInventarioDeObjetos(int inventarioDeObjetos) {
        this.inventarioDeObjetos = inventarioDeObjetos;
    }

    public int getPosicionEnHabitacion() {
        return posicionEnHabitacion;
    }
    public void setPosicionEnHabitacion(int posicionEnHabitacion) {
        this.posicionEnHabitacion = posicionEnHabitacion;
    }

    public String toString(){
        return
    }
}