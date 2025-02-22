package com.ingaamira.modules.oop_inheritance.model;

/**
 * La clase Alumno representa a un estudiante, que es una subclase de Persona.
 * Contiene información sobre la institución en la que estudia y sus notas
 * en distintas materias.
 */
public class Alumno extends Persona {
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    /**
     * Constructor por defecto de Alumno.
     */
    public Alumno() {
        System.out.println("Alumno: inicializando constructor...");
    }

    /**
     * Constructor que inicializa el nombre y el apellido del alumno.
     *
     * @param nombre  Nombre del alumno
     * @param apellido Apellido del alumno
     */
    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    /**
     * Constructor que inicializa el nombre, apellido y edad del alumno.
     *
     * @param nombre  Nombre del alumno
     * @param apellido Apellido del alumno
     * @param edad Edad del alumno
     */
    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    /**
     * Constructor que inicializa el nombre, apellido, edad e institución del alumno.
     *
     * @param nombre  Nombre del alumno
     * @param apellido Apellido del alumno
     * @param edad Edad del alumno
     * @param institucion Institución educativa del alumno
     */
    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    /**
     * Constructor que inicializa todos los atributos del alumno.
     *
     * @param nombre  Nombre del alumno
     * @param apellido Apellido del alumno
     * @param edad Edad del alumno
     * @param institucion Institución educativa del alumno
     * @param notaMatematica Nota en Matemáticas
     * @param notaCastellano Nota en Castellano
     * @param notaHistoria Nota en Historia
     */
    public Alumno(String nombre, String apellido, int edad,
                  String institucion, double notaMatematica, double notaCastellano,
                  double notaHistoria) {
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    /**
     * Método que devuelve un saludo personalizado del alumno.
     *
     * @return Un mensaje de saludo
     */
    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar + " soy un alumno y mi nombre es " + getNombre();
    }

    /**
     * Calcula el promedio de las notas del alumno.
     *
     * @return El promedio de las notas en Matemáticas, Castellano e Historia
     */
    public double calcularPromedio() {
        return (notaHistoria + notaCastellano + notaMatematica) / 3;
    }

    /**
     * Representación en cadena de la información del alumno.
     *
     * @return Una cadena con los datos del alumno y su promedio
     */
    @Override
    public String toString() {
        return super.toString() +
                "\ninstitucion='" + institucion + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria +
                ", promedio=" + this.calcularPromedio();
    }
}
