package com.ingaamira.modules.collections.intro.main.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Clase que demuestra el uso de {@link TreeMap} para almacenar y manipular información
 * de una persona, incluyendo su dirección.
 * <p>
 * Se utiliza un {@link TreeMap} para garantizar que las claves estén ordenadas según
 * un criterio específico. En este caso, las claves se ordenan por longitud en orden
 * descendente.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploTreeMap {

    /**
     * Método principal que ejecuta las operaciones sobre un {@link TreeMap}.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // Crear un TreeMap con un comparador personalizado para ordenar las claves por longitud en orden descendente
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());

        // Agregar información de la persona al TreeMap
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", 30);

        // Crear un TreeMap para almacenar la dirección de la persona
        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        // Agregar el mapa de dirección al mapa de la persona
        persona.put("direccion", direccion);

        // Imprimir el mapa completo de la persona
        System.out.println("persona = " + persona);
    }
}