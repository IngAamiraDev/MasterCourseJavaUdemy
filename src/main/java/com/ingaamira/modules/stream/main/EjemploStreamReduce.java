package com.ingaamira.modules.stream.main;

import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de Streams en Java para combinar elementos utilizando el método {@code reduce()}.
 * <p>
 * Se crea un flujo de nombres, se eliminan duplicados con {@code distinct()},
 * y luego se concatenan los nombres en una sola cadena usando {@code reduce()}.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamReduce {
    public static void main(String[] args) {

        // Crear un Stream de nombres con elementos repetidos y eliminar duplicados
        Stream<String> nombres = Stream.of(
                        "Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct(); // Eliminar nombres duplicados

        // Reducir el Stream a una única cadena concatenando los nombres
        String resultado = nombres.reduce("resultado concatenación", (a, b) -> a + " # " + b);

        // Imprimir la cadena resultante
        System.out.println(resultado);
    }
}