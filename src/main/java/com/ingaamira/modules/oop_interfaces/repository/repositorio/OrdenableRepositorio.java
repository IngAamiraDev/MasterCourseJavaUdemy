package com.ingaamira.modules.oop_interfaces.repository.repositorio;

import com.ingaamira.modules.oop_interfaces.repository.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
