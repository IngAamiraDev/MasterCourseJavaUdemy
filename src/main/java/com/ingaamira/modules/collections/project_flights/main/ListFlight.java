package com.ingaamira.modules.collections.project_flights.main;

import com.ingaamira.modules.collections.project_flights.model.Flight;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * Clase que demuestra el uso de una lista de vuelos ({@link Flight}) para realizar operaciones
 * como ordenar, obtener el primer y último vuelo, y encontrar el vuelo con el menor número de pasajeros.
 * <p>
 * Se utiliza una lista enlazada ({@link LinkedList}) para almacenar los vuelos y se realizan
 * operaciones de ordenación y filtrado utilizando comparadores.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class ListFlight {

    /**
     * Método principal que ejecuta las operaciones sobre la lista de vuelos.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     * @throws ParseException Si ocurre un error al parsear las fechas.
     */
    public static void main(String[] args) throws ParseException {

        // Formato de fecha para parsear las fechas de los vuelos
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        // Crear una lista enlazada para almacenar los vuelos
        LinkedList<Flight> arrives = new LinkedList<>();

        // Agregar vuelos a la lista
        arrives.add(new Flight("AAL 933", "New York", "Santiago", df.parse("2021-08-29 05:39"), 62));
        arrives.add(new Flight("LAT 755", "Sao Paulo", "Santiago", df.parse("2021-08-31 04:45"), 47));
        arrives.add(new Flight("SKU 621", "Rio De Janeiro", "Santiago", df.parse("2021-08-30 16:00"), 52));
        arrives.add(new Flight("DAL 147", "Atlanta", "Santiago", df.parse("2021-08-29 13:22"), 59));
        arrives.add(new Flight("AVA 241", "Bogota", "Santiago", df.parse("2021-08-31 14:05"), 25));
        arrives.add(new Flight("AMX 10", "Mexico City", "Santiago", df.parse("2021-08-31 05:20"), 29));
        arrives.add(new Flight("IBE 6833", "Londres", "Santiago", df.parse("2021-08-30 08:45"), 55));
        arrives.add(new Flight("LAT 2479", "Frankfurt", "Santiago", df.parse("2021-08-29 07:41"), 51));
        arrives.add(new Flight("SKU 803", "Lima", "Santiago", df.parse("2021-08-30 10:35"), 48));
        arrives.add(new Flight("LAT 533", "Los Angeles", "Santiago", df.parse("2021-08-29 09:14"), 59));
        arrives.add(new Flight("LAT 1447", "Guayaquil", "Santiago", df.parse("2021-08-31 08:33"), 31));
        arrives.add(new Flight("CMP 111", "Panama City", "Santiago", df.parse("2021-08-31 15:15"), 29));
        arrives.add(new Flight("LAT 705", "Madrid", "Santiago", df.parse("2021-08-30 08:14"), 47));
        arrives.add(new Flight("AAL 957", "Miami", "Santiago", df.parse("2021-08-29 22:53"), 60));
        arrives.add(new Flight("ARG 5091", "Buenos Aires", "Santiago", df.parse("2021-08-31 09:57"), 32));
        arrives.add(new Flight("LAT 1283", "Cancún", "Santiago", df.parse("2021-08-31 04:00"), 35));
        arrives.add(new Flight("LAT 579", "Barcelona", "Santiago", df.parse("2021-08-29 07:45"), 61));
        arrives.add(new Flight("AAL 945", "Dallas-Fort Worth", "Santiago", df.parse("2021-08-30 07:12"), 58));
        arrives.add(new Flight("LAT 501", "París", "Santiago", df.parse("2021-08-29 18:29"), 49));
        arrives.add(new Flight("LAT 405", "Montevideo", "Santiago", df.parse("2021-08-30 15:45"), 39));

        // Ordenar la lista por fecha de llegada y obtener el primer vuelo (el más temprano)
        arrives.sort(comparing(Flight::getDateArrive));
        Flight firstFlight = arrives.getFirst();
        System.out.println("\nThe first flight is: "
                + firstFlight.getName()
                + "\nFrom: "
                + firstFlight.getFrom()
                + "\nDate Arrives: "
                + firstFlight.getDateArrive()
        );

        // Ordenar la lista por fecha de llegada en orden descendente y obtener el último vuelo (el más tardío)
        arrives.sort(comparing(Flight::getDateArrive).reversed());
        Flight lastFlight = arrives.getFirst();
        System.out.println("\nThe last flight is: "
                + lastFlight.getName()
                + "\nFrom: "
                + lastFlight.getFrom()
                + "\nDate Arrives: "
                + lastFlight.getDateArrive()
        );

        // Ordenar la lista por fecha de llegada en orden descendente y obtener el vuelo con el menor número de pasajeros
        arrives.sort(comparing(Flight::getDateArrive).reversed());
        Flight minPass = arrives.getFirst();
        System.out.println("\nThe smallest number of passengers is: "
                + minPass.getName()
                + "\nFrom: "
                + minPass.getFrom()
                + "\nDate Arrives: "
                + minPass.getDateArrive()
        );

        // Imprimir todos los vuelos en la lista
        System.out.println("\nDataSet:");
        arrives.forEach(System.out::println);
    }
}