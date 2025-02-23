package com.ingaamira.modules.collections.intro.model;

import java.util.Objects;

/**
 * Clase que representa un Alumno con nombre y nota.
 * <p>
 * Implementa {@link Comparable} para permitir ordenación por nombre.
 * También sobrescribe los métodos {@code equals} y {@code hashCode} para garantizar
 * la comparación adecuada de los objetos.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer nota;

    /**
     * Constructor por defecto.
     */
    public Alumno() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del alumno.
     * @param nota Nota del alumno.
     */
    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota=" + nota;
    }

    /**
     * Implementación de la comparación natural basada en el nombre del alumno.
     * Si el nombre es nulo, se considera igual.
     *
     * @param a El alumno con el que se compara.
     * @return Valor negativo si es menor, positivo si es mayor, y 0 si son iguales.
     */
    @Override
    public int compareTo(Alumno a) {
        if (this.nombre == null) {
            return 0;
        }
        return this.nombre.compareTo(a.nombre);
    }

    /**
     * Sobrescribe el método equals para comparar correctamente los objetos Alumno.
     *
     * @param o Objeto a comparar.
     * @return true si son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(nota, alumno.nota);
    }

    /**
     * Sobrescribe el método hashCode para generar un código hash basado en nombre y nota.
     *
     * @return Código hash del objeto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
