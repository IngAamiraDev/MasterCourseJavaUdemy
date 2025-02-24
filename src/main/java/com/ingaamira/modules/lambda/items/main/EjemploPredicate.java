package com.ingaamira.modules.lambda.items.main;

import com.ingaamira.modules.lambda.items.model.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Clase que demuestra el uso de interfaces funcionales como {@link Predicate} y {@link BiPredicate}
 * en combinación con expresiones lambda.
 * <p>
 * Se realizan operaciones como la evaluación de condiciones sobre números, cadenas y objetos
 * utilizando predicados y bipredicados.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploPredicate {

    /**
     * Método principal que ejecuta las operaciones con interfaces funcionales.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // Predicate para evaluar si un número es mayor que 10
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(11); // Evalúa si 11 es mayor que 10
        System.out.println("r = " + r); // Imprime: true

        // Predicate para evaluar si un rol es igual a "ROLE_ADMIN"
        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN")); // Evalúa si "ROLE_ADMIN" es igual a "ROLE_ADMIN", imprime: true

        // BiPredicate para comparar si dos cadenas son iguales usando una referencia a método
        BiPredicate<String, String> t3 = String::equals; // Equivalente a (a, b) -> a.equals(b)
        System.out.println(t3.test("andres", "andres")); // Compara "andres" con "andres", imprime: true

        // BiPredicate para evaluar si el segundo número es mayor que el primero
        BiPredicate<Integer, Integer> t4 = (i, j) -> j > i;
        boolean r2 = t4.test(5, 10); // Evalúa si 10 es mayor que 5
        System.out.println(r2); // Imprime: true

        // Crear dos objetos Usuario y asignarles nombres
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("maria");
        b.setNombre("cata");

        // BiPredicate para comparar si los nombres de dos usuarios son iguales
        BiPredicate<Usuario, Usuario> t5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(t5.test(a, b)); // Compara los nombres de los usuarios, imprime: false
    }
}