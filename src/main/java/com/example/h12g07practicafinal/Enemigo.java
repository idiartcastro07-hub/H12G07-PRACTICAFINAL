package com.example.h12g07practicafinal;

public class Enemigo {
    private int movimiento;
    private int vida;
    private int ataque;
    private int defensa;
    private int posicionEnHabitacion;
    el enemigo siempre tiene equipado aquello con lo que ataca

    public Enemigo(int movimiento, int vida, int ataque, int defensa, int posicionEnHabitacion) {
        this.movimiento = movimiento;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.posicionEnHabitacion = posicionEnHabitacion;
    }

    public int getMovimiento() {
        return movimiento;
    }
    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    // No hay setter del ataque del enemigo porque no puede cambiar

    public int getDefensa() {
        return defensa;
    }

    // No hay setter de defensa porque la defensa del enemigo no puede cambiar,es un valor fijo

    public int  getPosicionEnHabitacion() {
        return posicionEnHabitacion;
    }
    public void setPosicionEnHabitacion(int posicionEnHabitacion) {
        this.posicionEnHabitacion = posicionEnHabitacion;
    }

    public String toString(){
        return;
    }
}