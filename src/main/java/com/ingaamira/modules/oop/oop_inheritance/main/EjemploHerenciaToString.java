package com.ingaamira.modules.oop.oop_inheritance.main;

import com.ingaamira.modules.oop.oop_inheritance.model.*;

/**
 * Clase principal para demostrar el uso de la herencia en Java.
 * Se crean instancias de Alumno, AlumnoInternacional y Profesor
 * y se imprimen sus detalles utilizando el método toString().
 */
public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("======== Creando la instancia de la clase Alumno ========");
        Alumno alumno = new Alumno("Andres", "Guzman", 13, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("andres@correo.com");

        System.out.println("======= Creando la instancia de la clase AlumnoInternacional ======= ");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@correo.com");

        System.out.println("======= Creando la instancia de la clase de Profesor =======");
        Profesor profesor = new Profesor("Luci", "Pérez", "Matemáticas");
        profesor.setEdad(37);
        profesor.setEmail("profesor.luci@colegio.com");

        System.out.println(" ======== - =======");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    /**
     * Método para imprimir la representación en cadena de un objeto Persona.
     * @param persona Objeto de tipo Persona o una de sus subclases.
     */
    public static void imprimir(Persona persona){
        System.out.println(" ==================================");
        System.out.println(persona);
    }
}
