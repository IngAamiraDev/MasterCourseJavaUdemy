package com.ingaamira.modules.oop.oop_projects.project_automovil.model;

/**
 * Representa el estanque de combustible de un automóvil.
 */
public class Estanque {
    /**
     * Capacidad del estanque en litros.
     */
    private int capacidad;

    /**
     * Constructor por defecto. Establece la capacidad del estanque en 40 litros.
     */
    public Estanque() {
        this.capacidad = 40;
    }

    /**
     * Constructor que permite definir la capacidad del estanque.
     *
     * @param capacidad Capacidad en litros del estanque.
     */
    public Estanque(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Obtiene la capacidad del estanque.
     *
     * @return Capacidad del estanque en litros.
     */
    public int getCapacidad() {
        return capacidad;
    }
}
