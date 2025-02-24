package com.ingaamira.modules.stream.main;

import com.ingaamira.modules.stream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de Streams en Java para filtrar y manipular objetos de tipo {@code Usuario}.
 * <p>
 * Se crea un flujo de nombres, se convierten en objetos {@code Usuario},
 * se filtran por nombre y se obtiene el primer resultado disponible.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        // Crear un Stream de nombres y mapearlos a objetos Usuario
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) // Separar nombre y apellido
                .filter(u -> u.getNombre().equals("Pepex")) // Filtrar solo usuarios con nombre "Pepe"
                .peek(System.out::println); // Imprimir los usuarios filtrados

        // Obtener el primer usuario del Stream filtrado
        Optional<Usuario> usuario = nombres.findFirst();

        // Manejo del resultado con Optional
        if(usuario.isPresent()) {
            System.out.println(usuario.get().getNombre()); // Imprimir el nombre si existe
        } else {
            System.out.println("No se encontró el objeto!"); // Mensaje si no se encuentra ningún usuario
        }
    }
}
