package com.ingaamira.modules.oop_inheritance.model;

/**
 * La clase Persona representa a una persona con atributos básicos como nombre, apellido, edad y email.
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    /**
     * Constructor por defecto de Persona.
     */
    public Persona(){
        System.out.println("Persona: inicializando constructor...");
    }

    /**
     * Constructor que inicializa el nombre y el apellido de la persona.
     *
     * @param nombre  Nombre de la persona
     * @param apellido Apellido de la persona
     */
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Constructor que inicializa el nombre, apellido y edad de la persona.
     *
     * @param nombre  Nombre de la persona
     * @param apellido Apellido de la persona
     * @param edad Edad de la persona
     */
    public Persona(String nombre, String apellido, int edad){
        this(nombre, apellido);
        this.edad = edad;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre Nuevo nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return El apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido de la persona.
     *
     * @param apellido Nuevo apellido de la persona
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return La edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param edad Nueva edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el email de la persona.
     *
     * @return El email de la persona
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el email de la persona.
     *
     * @param email Nuevo email de la persona
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método que devuelve un saludo genérico.
     *
     * @return Un mensaje de saludo
     */
    public String saludar(){
        return "Hola que tal!";
    }

    /**
     * Representación en cadena de la información de la persona.
     *
     * @return Una cadena con los datos de la persona
     */
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", saludo=" + this.saludar();
    }
}
