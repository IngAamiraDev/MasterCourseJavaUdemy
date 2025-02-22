package com.ingaamira.modules.oop.oop_projects.project_automovil.model;

/**
 * Representa el motor de un automóvil, incluyendo su cilindrada y tipo de combustible.
 */
public class Motor {
    /**
     * Cilindrada del motor en litros.
     */
    private double cilindrada;

    /**
     * Tipo de motor (BENCINA o DIESEL).
     */
    private TipoMotor tipo;

    /**
     * Constructor por defecto.
     */
    public Motor() {
    }

    /**
     * Constructor que inicializa un motor con una cilindrada y un tipo de combustible.
     *
     * @param cilindrada Cilindrada del motor en litros.
     * @param tipo       Tipo de motor (BENCINA o DIESEL).
     */
    public Motor(double cilindrada, TipoMotor tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    /**
     * Obtiene la cilindrada del motor.
     *
     * @return Cilindrada del motor en litros.
     */
    public double getCilindrada() {
        return cilindrada;
    }

    /**
     * Establece la cilindrada del motor.
     *
     * @param cilindrada Cilindrada del motor en litros.
     */
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * Obtiene el tipo de motor.
     *
     * @return Tipo de motor (BENCINA o DIESEL).
     */
    public TipoMotor getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de motor.
     *
     * @param tipo Tipo de motor (BENCINA o DIESEL).
     */
    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
