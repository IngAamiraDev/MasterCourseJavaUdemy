package com.ingaamira.modules.oop.oop_projects.project_purchase_order.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {
    private int id;
    private String description;
    private LocalDateTime date;
    private Customer customer;
    private List<Product> products;
    private static int nextId = 1;

    public PurchaseOrder(String description) {
        this.id = nextId++;
        this.description = description;
        this.date = LocalDateTime.now();
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public BigDecimal getTotal() {
        return products.stream()
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
