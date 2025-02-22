package com.ingaamira.modules.oop.oop_packages.jardin;

import com.ingaamira.modules.oop.oop_packages.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
