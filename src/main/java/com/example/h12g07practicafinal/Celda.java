package com.example.h12g07practicafinal;

public class Celda {
    private EstadoCelda estado;

    public Celda (EstadoCelda estado) {
        this.estado = estado;
    }

    public EstadoCelda getEstado() {
        return estado;
    }

    public void setEstado(EstadoCelda estado) {
        this.estado = estado;
    }
}