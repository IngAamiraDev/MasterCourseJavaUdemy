package com.ingaamira.modules.collections.intro.main.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Ejemplo de uso de HashSet para detectar elementos duplicados en un array.
 *
 * <p>Este programa utiliza un {@link HashSet} para almacenar elementos únicos
 * y detectar los valores repetidos en un array de nombres de peces.</p>
 *
 * <p>Características de HashSet:
 * <ul>
 *   <li>No permite elementos duplicados.</li>
 *   <li>No mantiene un orden específico.</li>
 *   <li>Permite operaciones eficientes de búsqueda y almacenamiento.</li>
 * </ul>
 * </p>
 *
 *  * @author IngAamira
 *  * @version 1.0
 */
public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        // Array de nombres de peces con un duplicado
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado"};

        // Conjunto para almacenar elementos únicos
        Set<String> unicos = new HashSet<>();

        // Recorrer el array e intentar agregar los elementos al HashSet
        for (String pez : peces) {
            if (!unicos.add(pez)) { // Si el elemento ya existe, add() devuelve false
                System.out.println("Elemento Duplicado: " + pez);
            }
        }

        // Mostrar los elementos únicos almacenados en el HashSet
        System.out.println(unicos.size() + " elementos no duplicados: " + unicos);
    }
}
