package com.ingaamira.modules.stream.main;

import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de Streams en Java para realizar una reducción numérica con {@code reduce()}.
 * <p>
 * Se crea un flujo de números enteros y se utiliza {@code reduce()} con {@code Integer::sum}
 * para calcular la suma total de los elementos.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamReduceInt {
    public static void main(String[] args) {

        // Crear un Stream de números enteros
        Stream<Integer> numeros = Stream.of(5, 10, 15, 20);

        // Reducir el Stream sumando todos los valores, con un valor inicial de 0
        int resultado = numeros.reduce(0, Integer::sum);

        // Imprimir la suma total de los números en el Stream
        System.out.println("Suma total: " + resultado);
    }
}