package com.ingaamira.modules.collections.intro.main.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Clase de ejemplo que demuestra el uso de la colección {@link TreeSet} en Java.
 * <p>
 * Un {@code TreeSet} es una implementación de la interfaz {@code Set} basada en un árbol binario de búsqueda,
 * que mantiene los elementos ordenados de forma natural o mediante un comparador personalizado.
 * </p>
 * <p>
 * En este ejemplo:
 * <ul>
 *     <li>Se crea un {@code TreeSet} de cadenas con orden descendente.</li>
 *     <li>Se crea un {@code TreeSet} de números enteros con orden descendente utilizando {@link Comparator#reverseOrder()}.</li>
 * </ul>
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploTreeSet {
    public static void main(String[] args) {
        // Crear un TreeSet de cadenas con orden descendente (inverso al orden natural)
        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));

        // Agregar elementos al conjunto
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres"); // Este duplicado será ignorado
        ts.add("cuatro");
        ts.add("cinco");

        // Imprimir el contenido del TreeSet (ordenado en reversa)
        System.out.println("ts = " + ts);

        // Crear un TreeSet de números enteros con orden inverso al natural
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());

        // Agregar elementos al conjunto
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);

        // Imprimir el contenido del TreeSet (ordenado en reversa)
        System.out.println("numeros = " + numeros);
    }
}
