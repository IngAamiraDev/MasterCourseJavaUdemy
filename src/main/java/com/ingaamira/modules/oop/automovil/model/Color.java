package com.ingaamira.modules.oop.automovil.model;

/**
 * Enumeración que representa diferentes colores disponibles para un automóvil.
 */
public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris Oscuro"),
    NARANJO("Naranja");

    /** Nombre del color en formato legible. */
    private final String color;

    /**
     * Constructor del enumerado Color.
     * @param color Nombre legible del color.
     */
    Color(String color) {
        this.color = color;
    }

    /**
     * Obtiene el nombre del color.
     * @return Nombre del color como cadena de texto.
     */
    public String getColor() {
        return color;
    }

    /**
     * Representación en cadena del color.
     * @return Nombre del color como cadena de texto.
     */
    @Override
    public String toString() {
        return this.color;
    }

}
