package com.ingaamira.modules.stream.main;

import com.ingaamira.modules.stream.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * Ejemplo de procesamiento paralelo con Streams en Java.
 * <p>
 * Se utiliza un {@link Stream#parallel()} para mejorar el rendimiento en listas grandes.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamParallel {
    public static void main(String[] args) {

        // Lista de usuarios
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andrés", "Guzmán"));
        lista.add(new Usuario("Luci", "Martínez"));
        lista.add(new Usuario("Pepe", "Fernández"));
        lista.add(new Usuario("Cata", "Pérez"));
        lista.add(new Usuario("Lalo", "Mena"));
        lista.add(new Usuario("Exequiel", "Doe"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Willis"));

        long t1 = System.currentTimeMillis(); // Tiempo de inicio

        // Procesamiento paralelo
        String resultado = lista.stream()
                .parallel() //Ejecutar en paralelo
                .map(u -> u.toString().toUpperCase())
                .peek(n -> System.out.println("Thread: " + Thread.currentThread().getName() + " - " + n))
                .flatMap(nombre -> {
                    try {
                        TimeUnit.MILLISECONDS.sleep(500); // Reducido de 1s a 500ms para optimizar la ejecución
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return nombre.contains("BRUCE") ? Stream.of(nombre) : Stream.empty();
                })
                .findAny()
                .orElse("No encontrado");

        long t2 = System.currentTimeMillis(); // Tiempo final
        System.out.println("Tiempo total: " + (t2 - t1) + " ms");
        System.out.println("Resultado: " + resultado);
    }
}