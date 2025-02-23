package com.ingaamira.modules.collections.intro.main.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Clase que demuestra el uso de {@link HashMap} para almacenar y manipular información
 * de una persona, incluyendo su dirección.
 * <p>
 * Se realizan operaciones como agregar, modificar, eliminar y verificar la existencia
 * de elementos en el mapa. También se muestra cómo iterar sobre las claves, valores
 * y entradas del mapa.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploHashMap {

    /**
     * Método principal que ejecuta las operaciones sobre un {@link HashMap}.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // Crear un HashMap para almacenar información de una persona
        Map<String, Object> persona = new HashMap<>();

        // Verificar si el mapa está vacío
        System.out.println("contiene elementos=" + !persona.isEmpty());

        // Agregar elementos al mapa, incluyendo un valor nulo como clave
        persona.put(null, "1234");
        persona.put(null, "12345"); // Sobrescribe el valor anterior asociado a la clave nula
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", 30);

        // Crear un HashMap para almacenar la dirección de la persona
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        // Agregar el mapa de dirección al mapa de la persona
        persona.put("direccion", direccion);

        // Imprimir el mapa completo de la persona
        System.out.println("persona = " + persona);

        // Obtener y mostrar el nombre y apellido de la persona
        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        // Obtener el mapa de dirección y mostrar algunos valores
        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "La playa"); // Valor por defecto si la clave no existe
        System.out.println("El pais de " + nombre + " es: " + pais);
        System.out.println("La ciudad de " + nombre + " es: " + ciudad);
        System.out.println("El barrio de " + nombre + " es: " + barrio);

        // Eliminar un elemento del mapa por clave y valor
        boolean b = persona.remove("apellidoPaterno", "Doe");
        System.out.println("eliminado " + b);
        System.out.println("persona = " + persona);

        // Verificar si el mapa contiene una clave específica
        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("b2 = " + b2);

        // Verificar si el mapa contiene un valor específico
        b2 = persona.containsValue("john.doe@email.co");
        System.out.println("b2 = " + b2);

        // Iterar sobre los valores del mapa
        System.out.println("========================== values");
        Collection<Object> valores = persona.values();
        for (Object v : valores) {
            System.out.println("v = " + v);
        }

        // Iterar sobre las claves del mapa
        System.out.println("========================= keySet");
        Set<String> llaves = persona.keySet();
        for (String k : llaves) {
            System.out.println("k = " + k);
        }

        // Iterar sobre las entradas del mapa
        System.out.println("========================== entrySet");
        for (Map.Entry<String, Object> par : persona.entrySet()) {
            Object valor = par.getValue();
            if (valor instanceof Map) { // Si el valor es un mapa (dirección)
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                for (Map.Entry<String, String> parDir : direccionMap.entrySet()) {
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            } else {
                System.out.println(par.getKey() + " => " + valor);
            }
        }

        // Iterar sobre las claves y obtener los valores asociados
        System.out.println("========================== keySet");
        for (String llave : persona.keySet()) {
            Object valor = persona.get(llave);
            if (valor instanceof Map) { // Si el valor es un mapa (dirección)
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El país de " + nom + ": " + direccionMap.get("pais"));
                System.out.println("El estado de " + nom + ": " + direccionMap.get("estado"));
                System.out.println("La ciudad de " + nom + ": " + direccionMap.get("ciudad"));
            } else {
                System.out.println(llave + " => " + valor);
            }
        }

        // Iterar sobre el mapa usando forEach (Java 8)
        System.out.println("========================== java 8 forEach");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        // Mostrar el tamaño del mapa y si está vacío
        System.out.println("total: " + persona.size());
        System.out.println("contiene elementos=" + !persona.isEmpty());

        // Reemplazar un valor en el mapa si la clave y el valor actual coinciden
        boolean b3 = persona.replace("nombre", "John", "Andrés");
        System.out.println("b3 = " + b3);
        System.out.println("persona = " + persona);
    }
}