package com.ingaamira.modules.stream.main;

import com.ingaamira.modules.stream.models.Usuario;

import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de Streams en Java para verificar si algún elemento cumple una condición específica.
 * <p>
 * Se crea un flujo de nombres, se convierten en objetos {@code Usuario},
 * y se utiliza el método {@code anyMatch()} para determinar si existe algún usuario con un ID específico.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        // Verifica si al menos un usuario en el Stream tiene el ID igual a 1
        boolean existe = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) // Separar nombre y apellido
                .peek(System.out::println) // Imprimir cada usuario generado
                .anyMatch(u -> u.getId().equals(1)); // Verificar si algún usuario tiene ID 1

        System.out.println(existe); // Imprimir el resultado de la búsqueda

        /*
        Código alternativo utilizando una lista y un bucle for:

        List<Usuario> lista = Arrays.asList(new Usuario("Pato", "Guzman"),
                new Usuario("Paco", "Gonzalez"),
                new Usuario("Pepa", "Gutierrez"),
                new Usuario("Pepe", "Mena"),
                new Usuario("Pepe", "Garcia"));

        boolean resultado = false;
        for(Usuario u: lista){
            if(u.getId().equals(3)){
                resultado = true;
                break;
            }
        }

        System.out.println(resultado);
        */
    }
}
