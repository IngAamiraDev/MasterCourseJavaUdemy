package com.ingaamira.modules.collections.intro.main.list;

import com.ingaamira.modules.collections.intro.model.Alumno;

import java.util.*;
import static java.util.Comparator.comparing;

/**
 * Clase que demuestra el uso de {@link LinkedList} con objetos de tipo {@code Alumno},
 * aplicando ordenaciones mediante {@link Comparator}.
 * <p>
 * Se utiliza {@code comparing} para ordenar la lista en orden inverso basado en el nombre del alumno.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploListComparableComparator {
    public static void main(String[] args) {

        // Crear una lista enlazada de alumnos
        List<Alumno> sa = new LinkedList<>();

        // Agregar alumnos a la lista
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));

        // Ordenar la lista en orden inverso basado en el nombre del alumno
        sa.sort(comparing(Alumno::getNombre).reversed());

        // Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));
        //sa.sort((a, b) -> a.getNota().compareTo(b.getNota()));

        // Imprimir la lista ordenada
        System.out.println(sa);

        // Iterar usando Stream forEach
        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);
    }
}
