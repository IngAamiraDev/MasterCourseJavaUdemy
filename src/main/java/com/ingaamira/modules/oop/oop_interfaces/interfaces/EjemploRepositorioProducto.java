package com.ingaamira.modules.oop.oop_interfaces.interfaces;

import com.ingaamira.modules.oop.oop_interfaces.interfaces.model.Producto;
import com.ingaamira.modules.oop.oop_interfaces.interfaces.repository.*;
import com.ingaamira.modules.oop.oop_interfaces.interfaces.repository.exception.AccesoDatoException;
import com.ingaamira.modules.oop.oop_interfaces.interfaces.repository.list.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) throws AccesoDatoException {

        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("mesa", 50.52));
        repo.crear(new Producto("silla", 18));
        repo.crear(new Producto("lampara", 15.5));
        repo.crear(new Producto("notebook", 400.89));

        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Producto> paginable = repo.listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.ASC);
        for(Producto c: productosOrdenAsc){
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Producto lamparaActualizar = new Producto("lampara escritorio", 23);
        lamparaActualizar.setId(3);
        repo.editar(lamparaActualizar);
        Producto lampara = repo.porId(3);
        System.out.println(lampara);
        System.out.println(" ============= ");
        repo.listar("precio", Direccion.ASC).forEach(System.out::println);
        System.out.println("===== eliminar ======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("===== total ===== ");
        System.out.println("Total registros: " + repo.total());
    }
}
