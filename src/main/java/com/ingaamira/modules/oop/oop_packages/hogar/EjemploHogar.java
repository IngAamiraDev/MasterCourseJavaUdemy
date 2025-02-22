package com.ingaamira.modules.oop.oop_packages.hogar;

import com.ingaamira.modules.oop.oop_packages.jardin.Perro;

import static com.ingaamira.modules.oop.oop_packages.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
