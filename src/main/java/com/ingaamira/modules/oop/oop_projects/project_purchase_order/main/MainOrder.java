package com.ingaamira.modules.oop.oop_projects.project_purchase_order.main;

import com.ingaamira.modules.oop.oop_projects.project_purchase_order.model.Customer;
import com.ingaamira.modules.oop.oop_projects.project_purchase_order.model.Product;
import com.ingaamira.modules.oop.oop_projects.project_purchase_order.model.PurchaseOrder;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainOrder {

    public static void main(String[] args) {

        // Crear clientes
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Leonardo", "Gómez"));
        customers.add(new Customer("Valeria", "Hernández"));
        customers.add(new Customer("Ricardo", "Fernández"));

        // Crear productos
        List<Product> products = new ArrayList<>();
        products.add(new Product("Samsung", "SSD NVMe 1TB", new BigDecimal("150.99")));
        products.add(new Product("Corsair", "Memoria RAM 32GB", new BigDecimal("120.50")));
        products.add(new Product("Asus", "Tarjeta Madre Z690", new BigDecimal("300.00")));
        products.add(new Product("Nvidia", "RTX 4080", new BigDecimal("1200.00")));

        // Crear órdenes de compra
        List<PurchaseOrder> orders = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < customers.size(); i++) {
            PurchaseOrder order = new PurchaseOrder("Orden #" + (i + 1));
            order.setCustomer(customers.get(i)); // Asigna un cliente único

            // Agregar entre 1 y 3 productos aleatorios a la orden
            int numProducts = rand.nextInt(3) + 1;
            for (int j = 0; j < numProducts; j++) {
                Product randomProduct = products.get(rand.nextInt(products.size()));
                order.addProduct(randomProduct);
            }

            orders.add(order);
        }

        // Imprimir detalles de las órdenes
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        for (PurchaseOrder order : orders) {
            System.out.println("Folio: " + order.getId());
            System.out.println("Customer: " + order.getCustomer());
            System.out.println("Description: " + order.getDescription());
            System.out.println("Date: " + order.getDate().format(formatter));
            System.out.println("Total: $" + order.getTotal());
            System.out.println("------------------------- Next Product -------------------------");
        }

    }
}
