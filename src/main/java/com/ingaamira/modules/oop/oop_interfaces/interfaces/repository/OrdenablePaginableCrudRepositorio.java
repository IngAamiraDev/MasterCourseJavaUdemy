package com.ingaamira.modules.oop.oop_interfaces.interfaces.repository;

public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,
                        PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio {
}
