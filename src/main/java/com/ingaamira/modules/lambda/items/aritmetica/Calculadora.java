package com.ingaamira.modules.lambda.items.aritmetica;

import java.util.function.BiFunction;

/**
 * Clase que proporciona métodos para realizar operaciones aritméticas utilizando
 * tanto la interfaz funcional personalizada {@link Aritmetica} como la interfaz
 * estándar {@link BiFunction}.
 * <p>
 * Esta clase es útil para demostrar cómo se pueden utilizar expresiones lambda
 * y referencias a métodos para realizar cálculos aritméticos.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class Calculadora {

    /**
     * Realiza una operación aritmética utilizando la interfaz funcional {@link Aritmetica}.
     *
     * @param a      El primer número de la operación.
     * @param b      El segundo número de la operación.
     * @param lambda La implementación de la interfaz {@link Aritmetica} que define la operación.
     * @return El resultado de la operación aritmética.
     */
    public double computar(double a, double b, Aritmetica lambda) {
        return lambda.operacion(a, b);
    }

    /**
     * Realiza una operación aritmética utilizando la interfaz funcional estándar {@link BiFunction}.
     *
     * @param a      El primer número de la operación.
     * @param b      El segundo número de la operación.
     * @param lambda La implementación de la interfaz {@link BiFunction} que define la operación.
     * @return El resultado de la operación aritmética.
     */
    public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda) {
        return lambda.apply(a, b);
    }
}