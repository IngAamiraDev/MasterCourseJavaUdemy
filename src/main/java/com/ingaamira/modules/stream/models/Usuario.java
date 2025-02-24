package com.ingaamira.modules.stream.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Clase que representa un usuario con nombre, apellido e identificador único.
 * <p>
 * Cada usuario tiene una lista de facturas asociadas y proporciona métodos
 * para agregar nuevas facturas y obtener información relevante.
 * </p>
 *
 * @author IngAamira
 * @version 1.0
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private Integer id;
    private static int ultimoId; // Variable estática para gestionar el ID autoincremental

    private List<Factura> facturas; // Lista de facturas asociadas al usuario

    /**
     * Constructor que inicializa un usuario con nombre y apellido.
     * El ID se asigna automáticamente de forma incremental.
     *
     * @param nombre  Nombre del usuario.
     * @param apellido Apellido del usuario.
     */
    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++ultimoId; // Asigna un ID único incrementando el último ID
        this.facturas = new ArrayList<>(); // Inicializa la lista de facturas
    }

    /**
     * Obtiene la lista de facturas asociadas al usuario.
     *
     * @return Lista de facturas del usuario.
     */
    public List<Factura> getFacturas() {
        return facturas;
    }

    /**
     * Agrega una factura a la lista del usuario y establece la relación bidireccional.
     *
     * @param factura Factura a agregar.
     */
    public void addFactura(Factura factura) {
        this.facturas.add(factura);
        factura.setUsuario(this); // Establece el usuario en la factura
    }

    /**
     * Obtiene el ID del usuario.
     *
     * @return ID del usuario.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el ID del usuario.
     *
     * @param id Nuevo ID del usuario.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre Nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del usuario.
     *
     * @return Apellido del usuario.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del usuario.
     *
     * @param apellido Nuevo apellido del usuario.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Representación en cadena del usuario en formato "nombre apellido".
     *
     * @return Cadena con el nombre y apellido del usuario.
     */
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

    /**
     * Compara dos usuarios en función de su nombre y apellido.
     *
     * @param o Objeto a comparar.
     * @return {@code true} si los usuarios tienen el mismo nombre y apellido, {@code false} en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) &&
                Objects.equals(apellido, usuario.apellido);
    }

    /**
     * Genera un código hash basado en el nombre y el apellido.
     *
     * @return Código hash del usuario.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
