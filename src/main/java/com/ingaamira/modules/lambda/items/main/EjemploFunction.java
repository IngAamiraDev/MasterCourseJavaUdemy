package com.ingaamira.modules.lambda.items.main;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Clase que demuestra el uso de interfaces funcionales como {@link Function} y {@link BiFunction}
 * en combinación con expresiones lambda.
 * <p>
 * Se realizan operaciones como la concatenación de cadenas, la conversión a mayúsculas
 * y la comparación de cadenas utilizando funciones y bifunciones.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploFunction {

    /**
     * Método principal que ejecuta las operaciones con interfaces funcionales.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // Function para concatenar un saludo con un nombre
        Function<String, String> f1 = param -> "Hola que tal! " + param;
        String resultado = f1.apply("andres"); // Aplica la función al parámetro "andres"
        System.out.println(resultado); // Imprime: "Hola que tal! andres"

        // Function para convertir una cadena a mayúsculas usando una referencia a método
        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("andres")); // Imprime: "ANDRES"

        // BiFunction para concatenar dos cadenas en mayúsculas
        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("andres", "jose"); // Concatena "ANDRES" y "JOSE"
        System.out.println(r2); // Imprime: "ANDRESJOSE"

        // BiFunction para comparar dos cadenas usando una referencia a método
        BiFunction<String, String, Integer> f4 = String::compareTo; // Equivalente a (a, b) -> a.compareTo(b)
        System.out.println(f4.apply("andres", "andres")); // Compara "andres" con "andres", imprime: 0

        // BiFunction para concatenar dos cadenas usando una referencia a método
        BiFunction<String, String, String> f5 = String::concat; // Equivalente a (a, b) -> a.concat(b)
        System.out.println(f5.apply("andres", "jose")); // Concatena "andres" y "jose", imprime: "andresjose"
    }
}