package com.ingaamira.modules.collections.intro.main.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Clase que demuestra el uso de {@link HashSet} para almacenar y manipular un conjunto de elementos.
 * <p>
 * Se realizan operaciones como agregar elementos, verificar duplicados y convertir el conjunto
 * en una lista ordenada. También se destacan las características principales de los conjuntos (Set).
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploHashSetAgregar {

    /**
     * Método principal que ejecuta las operaciones sobre un {@link HashSet}.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // Crear un HashSet para almacenar elementos únicos
        Set<String> hs = new HashSet<>();

        // Agregar elementos al HashSet y mostrar el resultado de cada operación
        System.out.println(hs.add("uno"));   // true, se agregó "uno"
        System.out.println(hs.add("dos"));   // true, se agregó "dos"
        System.out.println(hs.add("tres"));  // true, se agregó "tres"
        System.out.println(hs.add("cuatro")); // true, se agregó "cuatro"
        System.out.println(hs.add("cinco")); // true, se agregó "cinco"

        // Imprimir el contenido del HashSet
        System.out.println(hs);

        /* Ordenando ArrayList a partir del Set */
        // Convertir el HashSet en una lista para ordenarla
        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista); // Ordenar la lista alfabéticamente
        System.out.println(lista);

        // Intentar agregar un elemento duplicado al HashSet
        boolean b = hs.add("tres");
        System.out.println("permite elementos duplicados = " + b); // false, no se permite duplicados
        System.out.println(hs);

        /* Características de los Set:
         * - No permite elementos duplicados.
         * - No mantiene un orden específico al almacenar los datos.
         * - Cada operación add retorna un boolean (true si se agregó, false si ya existía).
         * - Los "Set" como las "Listas" comparten la misma interfaz "Collection".
         * - No se requiere declarar el tamaño del array.
         */
    }
}