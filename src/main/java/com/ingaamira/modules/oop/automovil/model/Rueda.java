package com.ingaamira.modules.oop.automovil.model;

/**
 * Representa una rueda de un automóvil con su fabricante, tamaño del aro y ancho.
 */
public class Rueda {

    /**
     * Nombre del fabricante de la rueda.
     */
    private String fabricante;

    /**
     * Tamaño del aro de la rueda en pulgadas.
     */
    private int aro;

    /**
     * Ancho de la rueda en milímetros.
     */
    private double ancho;

    /**
     * Constructor que inicializa una rueda con sus atributos.
     *
     * @param fabricante Nombre del fabricante de la rueda.
     * @param aro        Tamaño del aro en pulgadas.
     * @param ancho      Ancho de la rueda en milímetros.
     */
    public Rueda(String fabricante, int aro, double ancho) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }

    /**
     * Obtiene el nombre del fabricante de la rueda.
     *
     * @return Nombre del fabricante.
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Obtiene el tamaño del aro de la rueda en pulgadas.
     *
     * @return Tamaño del aro.
     */
    public int getAro() {
        return aro;
    }

    /**
     * Obtiene el ancho de la rueda en milímetros.
     *
     * @return Ancho de la rueda.
     */
    public double getAncho() {
        return ancho;
    }
}
