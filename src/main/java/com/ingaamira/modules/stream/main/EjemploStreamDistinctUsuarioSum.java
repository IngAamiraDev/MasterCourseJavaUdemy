package com.ingaamira.modules.stream.main;

import com.ingaamira.modules.stream.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Clase que demuestra el uso de Streams en Java para calcular estadísticas sobre la longitud de los nombres de usuarios únicos.
 * <p>
 * Se genera un flujo de nombres, se mapea a objetos {@code Usuario}, se eliminan duplicados con {@code distinct()},
 * y se obtiene la longitud de sus nombres convertidos en {@code String}. Finalmente, se calculan estadísticas como
 * la suma total, el valor máximo, mínimo y el promedio de las longitudes.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploStreamDistinctUsuarioSum {
    public static void main(String[] args) {

        // Generar un IntStream con la longitud de los nombres únicos
        IntStream largoNombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Guzman", "Pato Guzman") // Algunos nombres están repetidos
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) // Convertir a Usuario
                .distinct() // Eliminar duplicados basándose en equals() y hashCode()
                .mapToInt(u -> u.toString().length()) // Obtener la longitud del nombre completo
                .peek(System.out::println); // Imprimir cada longitud antes del cálculo

        // Obtener estadísticas sobre la longitud de los nombres
        IntSummaryStatistics stats = largoNombres.summaryStatistics();

        // Imprimir las estadísticas obtenidas
        System.out.println("Suma total de caracteres: " + stats.getSum());
        System.out.println("Longitud máxima: " + stats.getMax());
        System.out.println("Longitud mínima: " + stats.getMin());
        System.out.println("Promedio de longitudes: " + stats.getAverage());
    }
}