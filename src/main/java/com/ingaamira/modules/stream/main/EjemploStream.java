package com.ingaamira.modules.stream.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que demuestra el uso básico de {@link java.util.stream.Stream} en Java.
 * <p>
 * En este ejemplo, se muestran diferentes formas de crear un {@code Stream} a partir
 * de una lista y cómo iterar sobre sus elementos utilizando el método {@code forEach}.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStream {

    /**
     * Método principal que ejecuta las operaciones con {@code Stream}.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // Ejemplo de creación de un Stream usando Stream.of (comentado)
        /*
        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        nombres.forEach(System.out::println);
        */

        // Ejemplo de creación de un Stream a partir de un arreglo (comentado)
        /*
        String[] arr = {"Pato", "Paco", "Pepa", "Pepe"};
        Stream<String> nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);
        */

        // Ejemplo de creación de un Stream usando Stream.builder (comentado)
        /*
        Stream<String> nombres = Stream.<String>builder()
                .add("Pato")
                .add("paco")
                .add("pepa")
                .add("pepe")
                .build();
        nombres.forEach(System.out::println);
        */

        // Crear una lista de nombres
        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepe");
        lista.add("Pepa");

        // Ejemplo de creación de un Stream a partir de una lista (comentado)
        /*
        Stream<String> nombres = lista.stream();
        nombres.forEach(System.out::println);
        */

        // Iterar sobre los elementos de la lista usando Stream y forEach
        lista.stream().forEach(System.out::println);
    }

}