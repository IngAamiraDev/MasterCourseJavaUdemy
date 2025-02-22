package com.ingaamira.modules.oop.oop_interfaces.interfaces.repository;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}
