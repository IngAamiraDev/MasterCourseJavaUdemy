package com.ingaamira.modules.collections.intro.main.set;

import com.ingaamira.modules.collections.intro.model.Alumno;

import java.util.*;

/**
 * Clase que demuestra el uso de {@link HashSet} para garantizar la unicidad de los elementos.
 * <p>
 * Se agregan objetos de la clase {@code Alumno} y se muestran diferentes formas de iterar sobre la colección.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        // Crear un HashSet para almacenar objetos Alumno y garantizar unicidad
        Set<Alumno> sa = new HashSet<>();

        //Set<Alumno> sa = new TreeSet<>();

        //List<Alumno> sa = new ArrayList<>();

        // Agregar objetos Alumno al conjunto
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));

        // Imprimir el contenido del conjunto (los duplicados son eliminados automáticamente)
        System.out.println(sa);

        // Iteración usando foreach
        System.out.println("Iterando usando un foreach");
        for (Alumno a : sa) {
            System.out.println(a.getNombre());
        }

        // Iteración usando while y iterator
        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        // Iteración usando Stream forEach
        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);
    }
}
