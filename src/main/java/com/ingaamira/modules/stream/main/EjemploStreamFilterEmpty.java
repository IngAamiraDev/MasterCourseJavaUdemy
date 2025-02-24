package com.ingaamira.modules.stream.main;

import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de Streams en Java para filtrar y contar elementos vacíos en un flujo de datos.
 * <p>
 * Se crea un flujo de nombres, se filtran los elementos vacíos utilizando {@code filter(String::isEmpty)},
 * y se cuenta la cantidad de elementos vacíos en el Stream.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        // Contar la cantidad de cadenas vacías en el Stream
        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "", "Pepe Mena", "") // Stream con algunos valores vacíos
                .filter(String::isEmpty) // Filtrar solo las cadenas vacías
                .peek(System.out::println) // Imprimir los elementos filtrados (cadenas vacías)
                .count(); // Contar la cantidad de elementos vacíos

        System.out.println("Cantidad de elementos vacíos en el Stream: " + count);
    }
}