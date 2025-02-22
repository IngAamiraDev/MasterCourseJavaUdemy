package com.ingaamira.modules.oop.oop_projects.project_form.validador;

abstract public class Validador {
    protected String mensaje;
    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();
    abstract public boolean esValido(String valor);
}
