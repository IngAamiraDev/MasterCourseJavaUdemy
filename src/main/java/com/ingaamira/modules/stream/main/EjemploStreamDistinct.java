package com.ingaamira.modules.stream.main;

import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de Streams en Java para eliminar elementos duplicados en un flujo de datos.
 * <p>
 * Se crea un flujo de nombres y se utiliza el método {@code distinct()} para obtener solo valores únicos.
 * Finalmente, se imprimen los nombres distintos en la consola.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamDistinct {
    public static void main(String[] args) {

        // Crear un Stream de nombres con elementos repetidos
        Stream<String> nombres = Stream.of(
                        "Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct(); // Eliminar elementos duplicados del Stream

        // Imprimir los nombres únicos
        nombres.forEach(System.out::println);
    }
}