package com.ingaamira.modules.lambda.items.aritmetica;

/**
 * Interfaz funcional que define una operación aritmética entre dos números de tipo {@code double}.
 * <p>
 * Esta interfaz está diseñada para ser utilizada con expresiones lambda o referencias a métodos
 * que realicen operaciones aritméticas básicas, como suma, resta, multiplicación o división.
 * </p>
 * <p>
 * La anotación {@link FunctionalInterface} indica que esta interfaz es funcional, lo que significa
 * que solo puede tener un método abstracto.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
@FunctionalInterface
public interface Aritmetica {

    /**
     * Realiza una operación aritmética entre dos números.
     *
     * @param a El primer número de la operación.
     * @param b El segundo número de la operación.
     * @return El resultado de la operación aritmética.
     */
    double operacion(double a, double b);
}