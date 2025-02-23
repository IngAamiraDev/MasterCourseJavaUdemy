package com.ingaamira.modules.collections.intro.main.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Ejemplo de uso de HashSet para clasificar elementos únicos y duplicados en un array.
 *
 * <p>Este programa utiliza dos {@link HashSet} para almacenar:
 * <ul>
 *   <li>Elementos únicos (sin repetición).</li>
 *   <li>Elementos duplicados detectados.</li>
 * </ul>
 * </p>
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

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {

        // Definición del array con algunos elementos repetidos
        String[] peces = {"Corvina", "Atún", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado"};

        // Conjunto para almacenar elementos únicos
        Set<String> unicos = new HashSet<>();
        // Conjunto para almacenar elementos duplicados
        Set<String> duplicados = new HashSet<>();

        // Itera sobre el array para clasificar los elementos
        for(String pez : peces){
            if(!unicos.add(pez)){ // Si el elemento ya existe en "unicos", es un duplicado
                duplicados.add(pez);
            }
        }

        // Elimina los elementos duplicados del conjunto de únicos
        unicos.removeAll(duplicados);

        // Imprime los resultados
        System.out.println("Unicos: " + unicos);
        System.out.println("Duplicados: " + duplicados);
    }
}