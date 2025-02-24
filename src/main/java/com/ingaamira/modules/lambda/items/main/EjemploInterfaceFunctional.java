package com.ingaamira.modules.lambda.items.main;

import com.ingaamira.modules.lambda.items.aritmetica.Aritmetica;
import com.ingaamira.modules.lambda.items.aritmetica.Calculadora;

/**
 * Clase que demuestra el uso de interfaces funcionales personalizadas y estándar
 * para realizar operaciones aritméticas utilizando expresiones lambda.
 * <p>
 * En este ejemplo, se utiliza la interfaz funcional {@link Aritmetica} y la clase
 * {@link Calculadora} para realizar operaciones como suma, resta y multiplicación.
 * También se muestra cómo utilizar la interfaz estándar {@link java.util.function.BiFunction}.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploInterfaceFunctional {

    /**
     * Método principal que ejecuta las operaciones aritméticas utilizando interfaces funcionales.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // Definir una suma usando una referencia a método (Double::sum)
        Aritmetica suma = Double::sum;

        // Definir una resta usando una expresión lambda
        Aritmetica resta = (a, b) -> a - b;

        // Crear una instancia de la clase Calculadora
        Calculadora cal = new Calculadora();

        // Realizar una suma utilizando la interfaz Aritmetica
        System.out.println(cal.computar(10, 5, suma)); // Imprime: 15.0

        // Realizar una resta utilizando la interfaz Aritmetica
        System.out.println(cal.computar(10, 5, resta)); // Imprime: 5.0

        // Realizar una multiplicación utilizando una expresión lambda directamente
        System.out.println(cal.computar(10, 5, (a, b) -> a * b)); // Imprime: 50.0

        // Realizar una suma utilizando la interfaz BiFunction
        System.out.println(cal.computarConBiFunction(10, 5, (a, b) -> a + b)); // Imprime: 15.0
    }
}