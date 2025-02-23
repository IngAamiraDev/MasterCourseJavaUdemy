package com.ingaamira.modules.collections.intro.main.set;

import com.ingaamira.modules.collections.intro.model.Alumno;

import static java.util.Comparator.comparing;
import java.util.Set;
import java.util.TreeSet;

/**
 * Clase de ejemplo que demuestra el uso de {@link TreeSet} con objetos personalizados.
 * <p>
 * En este caso, se utiliza la clase {@code Alumno} y se ordena el conjunto
 * en orden descendente basado en la nota del alumno.
 * </p>
 * <p>
 * Se usa {@code Comparator.comparing} con {@code reversed()} para definir el orden.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        // Crear un TreeSet de Alumno ordenado por nota en orden descendente
        Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNota).reversed());

        // Agregar alumnos al conjunto
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 8)); // Este objeto puede reemplazar al anterior dependiendo de equals/hashCode

        // Imprimir el contenido del TreeSet
        System.out.println(sa);
    }
}
