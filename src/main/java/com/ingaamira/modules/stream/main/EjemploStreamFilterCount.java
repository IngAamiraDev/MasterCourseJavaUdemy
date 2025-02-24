package com.ingaamira.modules.stream.main;

import com.ingaamira.modules.stream.models.Usuario;

import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de Streams en Java para contar elementos en un flujo de datos.
 * <p>
 * Se crea un flujo de nombres, se convierten en objetos {@code Usuario},
 * y se utiliza el método {@code count()} para obtener la cantidad total de elementos en el Stream.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamFilterCount {
    public static void main(String[] args) {

        // Contar la cantidad de usuarios generados a partir del Stream de nombres
        long count = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) // Separar nombre y apellido
                .peek(System.out::println) // Imprimir cada usuario generado
                .count(); // Contar la cantidad de elementos en el Stream

        System.out.println("Cantidad de usuarios en el Stream: " + count);
    }
}