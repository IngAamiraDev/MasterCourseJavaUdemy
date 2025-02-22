package com.ingaamira.modules.oop.oop_interfaces.interfaces.repository;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
