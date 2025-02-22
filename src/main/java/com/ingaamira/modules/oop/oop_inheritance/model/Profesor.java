package com.ingaamira.modules.oop.oop_inheritance.model;

/**
 * La clase Profesor representa a un docente, que es una subclase de Persona.
 * Contiene información sobre la asignatura que imparte.
 */
public class Profesor extends Persona {
    private String asignatura;

    /**
     * Constructor por defecto de Profesor.
     */
    public Profesor(){
        System.out.println("Profesor: inicializando constructor...");
    }

    /**
     * Constructor que inicializa el nombre y el apellido del profesor.
     *
     * @param nombre  Nombre del profesor
     * @param apellido Apellido del profesor
     */
    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    /**
     * Constructor que inicializa el nombre, apellido y asignatura del profesor.
     *
     * @param nombre  Nombre del profesor
     * @param apellido Apellido del profesor
     * @param asignatura Asignatura que imparte el profesor
     */
    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    /**
     * Obtiene la asignatura del profesor.
     *
     * @return La asignatura del profesor
     */
    public String getAsignatura() {
        return asignatura;
    }

    /**
     * Establece la asignatura del profesor.
     *
     * @param asignatura Nueva asignatura del profesor
     */
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    /**
     * Método que devuelve un saludo personalizado del profesor.
     *
     * @return Un mensaje de saludo
     */
    @Override
    public String saludar() {
        return "Buenos días, soy el profesor de "
                + getAsignatura() + ", mi nombre es "
                + getNombre();
    }

    /**
     * Representación en cadena de la información del profesor.
     *
     * @return Una cadena con los datos del profesor
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura;
    }

}
