package com.ingaamira.modules.oop.oop_projects.project_imprenta.modelo;

abstract public class Hoja {
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public String imprimir();
}
