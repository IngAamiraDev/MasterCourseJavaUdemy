package com.ingaamira.modules.collections.project_flights.model;

import java.util.Date;

/**
 * Clase que representa un vuelo con información como nombre, origen, destino,
 * fecha de llegada y número de pasajeros.
 * <p>
 * Esta clase es utilizada para modelar los datos de un vuelo y proporciona métodos
 * para acceder a sus atributos. También incluye una implementación de {@code toString}
 * para facilitar la impresión de los detalles del vuelo.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class Flight {

    // Atributos de la clase
    private String name;        // Nombre del vuelo
    private String from;        // Ciudad de origen
    private String to;          // Ciudad de destino
    private Date dateArrive;    // Fecha de llegada
    private int numPassenger;   // Número de pasajeros

    /**
     * Constructor para crear un objeto {@code Flight} con todos sus atributos.
     *
     * @param name         Nombre del vuelo.
     * @param from         Ciudad de origen.
     * @param to           Ciudad de destino.
     * @param dateArrive   Fecha de llegada.
     * @param numPassenger Número de pasajeros.
     */
    public Flight(String name, String from, String to, Date dateArrive, int numPassenger) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.dateArrive = dateArrive;
        this.numPassenger = numPassenger;
    }

    /**
     * Obtiene el nombre del vuelo.
     *
     * @return El nombre del vuelo.
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene la ciudad de origen del vuelo.
     *
     * @return La ciudad de origen.
     */
    public String getFrom() {
        return from;
    }

    /**
     * Obtiene la ciudad de destino del vuelo.
     *
     * @return La ciudad de destino.
     */
    public String getTo() {
        return to;
    }

    /**
     * Obtiene la fecha de llegada del vuelo.
     *
     * @return La fecha de llegada.
     */
    public Date getDateArrive() {
        return dateArrive;
    }

    /**
     * Obtiene el número de pasajeros del vuelo.
     *
     * @return El número de pasajeros.
     */
    public int getNumPassenger() {
        return numPassenger;
    }

    /**
     * Devuelve una representación en formato de cadena del objeto {@code Flight}.
     *
     * @return Una cadena que contiene los detalles del vuelo.
     */
    @Override
    public String toString() {
        return "Flight{" +
                "name='" + name + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", dateArrive=" + dateArrive +
                ", numPassenger=" + numPassenger +
                '}';
    }
}