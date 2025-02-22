package com.ingaamira.modules.oop.oop_inheritance.model;

/**
 * La clase AlumnoInternacional representa a un alumno extranjero que hereda de la clase Alumno.
 * Incluye información adicional como el país de origen y la nota de idiomas.
 */
public final class AlumnoInternacional extends Alumno {
    private String pais;
    private double notaIdiomas;

    /**
     * Constructor por defecto de AlumnoInternacional.
     */
    public AlumnoInternacional(){
        System.out.println("AlumnoInternacional: inicializando constructor...");
    }

    /**
     * Constructor que inicializa el nombre y el apellido del alumno internacional.
     *
     * @param nombre  Nombre del alumno
     * @param apellido Apellido del alumno
     */
    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }

    /**
     * Constructor que inicializa el nombre, apellido y país de origen del alumno internacional.
     *
     * @param nombre  Nombre del alumno
     * @param apellido Apellido del alumno
     * @param pais País de origen del alumno
     */
    public AlumnoInternacional(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais = pais;
    }

    /**
     * Obtiene el país de origen del alumno internacional.
     *
     * @return El país de origen
     */
    public String getPais() {
        return pais;
    }

    /**
     * Establece el país de origen del alumno internacional.
     *
     * @param pais Nuevo país de origen
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Obtiene la nota en idiomas del alumno internacional.
     *
     * @return La nota en idiomas
     */
    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    /**
     * Establece la nota en idiomas del alumno internacional.
     *
     * @param notaIdiomas Nueva nota en idiomas
     */
    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    /**
     * Método que devuelve un saludo personalizado incluyendo el país de origen.
     *
     * @return Un mensaje de saludo
     */
    @Override
    public String saludar() {
        return super.saludar() + ", soy extranjero del país " + getPais();
    }

    /**
     * Calcula el promedio de notas del alumno internacional, incluyendo la nota de idiomas.
     *
     * @return El promedio de las notas del alumno
     */
    @Override
    public double calcularPromedio() {
        return ((super.calcularPromedio()*3) + notaIdiomas)/4;
    }

    /**
     * Representación en cadena de la información del alumno internacional.
     *
     * @return Una cadena con los datos del alumno internacional
     */
    @Override
    public String toString() {
        return super.toString() +
                "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
