package com.ingaamira.modules.stream.models;

/**
 * Clase que representa una factura asociada a un usuario.
 * <p>
 * Contiene una descripción de la factura y una referencia al usuario que la generó.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class Factura {
    private String descripcion;
    private Usuario usuario;

    /**
     * Constructor que inicializa la factura con una descripción.
     *
     * @param descripcion Detalle de la factura.
     */
    public Factura(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la descripción de la factura.
     *
     * @return La descripción de la factura.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece una nueva descripción para la factura.
     *
     * @param descripcion Nueva descripción de la factura.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el usuario asociado a la factura.
     *
     * @return El usuario que generó la factura.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Asigna un usuario a la factura.
     *
     * @param usuario Usuario que generó la factura.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Representación en cadena de la factura.
     *
     * @return Cadena con la descripción y el usuario asociado.
     */
    @Override
    public String toString() {
        return "Factura{" +
                "descripcion='" + descripcion + '\'' +
                ", usuario=" + (usuario != null ? usuario.toString() : "No asignado") +
                '}';
    }
}