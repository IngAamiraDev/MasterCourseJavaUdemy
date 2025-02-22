package com.ingaamira.modules.oop.oop_interfaces.interfaces.repository;

import com.ingaamira.modules.oop.oop_interfaces.interfaces.repository.exception.AccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    T porId(Integer id) throws AccesoDatoException;
    void crear(T t) throws AccesoDatoException;
    void editar(T t) throws AccesoDatoException;
    void eliminar(Integer id) throws AccesoDatoException;
}
