package com.ingaamira.modules.collections.intro.main.list;

import com.ingaamira.modules.collections.intro.model.Alumno;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Clase que demuestra el uso de {@link LinkedList} con objetos de tipo {@code Alumno}.
 * <p>
 * Se realizan operaciones como agregar, modificar, eliminar, obtener elementos y recorrer la lista
 * con un {@link ListIterator}.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class EjemploLinkedList {
    public static void main(String[] args) {

        // Crear una lista enlazada de alumnos
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Está vacía = " + enlazada.isEmpty());

        // Agregar elementos a la lista
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        // Agregar elementos al inicio y al final
        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Atenea", 6));
        System.out.println(enlazada + ", size = " + enlazada.size());

        // Obtener elementos específicos
        System.out.println("Primero = " + enlazada.getFirst());
        System.out.println("Último = " + enlazada.getLast());
        System.out.println("Índice 2 = " + enlazada.get(2));

        //Alumno zeus = enlazada.pop();
        //enlazada.pollLast();

        // Eliminar elementos de la lista
        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.remove(new Alumno("Jano", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        // Agregar un nuevo alumno y obtener su índice
        Alumno a = new Alumno("Lucas", 5);
        enlazada.addLast(a);
        System.out.println("Índice de Lucas = " + enlazada.indexOf(a));

        // Eliminar un elemento por índice y verificar índice de Lucas
        enlazada.remove(2);
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Índice de Lucas = " + enlazada.indexOf(a));

        // Reemplazar un elemento en la lista
        enlazada.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        // Iterar la lista en orden ascendente
        ListIterator<Alumno> li = enlazada.listIterator();
        while (li.hasNext()) {
            Alumno alumno = li.next();
            System.out.println(alumno);
        }

        // Iterar la lista en orden descendente
        System.out.println("=================== Previous");
        while (li.hasPrevious()) {
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }

    }
}
