package com.ingaamira.modules.oop.oop_projects.project_automovil.model;

/**
 * Representa a una persona con nombre y apellido.
 */
public class Persona {

    /**
     * Nombre de la persona.
     */
    private String nombre;

    /**
     * Apellido de la persona.
     */
    private String apellido;

    /**
     * Constructor que inicializa una persona con un nombre y un apellido.
     *
     * @param nombre   Nombre de la persona.
     * @param apellido Apellido de la persona.
     */
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Devuelve una representación en cadena de la persona.
     *
     * @return Nombre y apellido de la persona.
     */
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
