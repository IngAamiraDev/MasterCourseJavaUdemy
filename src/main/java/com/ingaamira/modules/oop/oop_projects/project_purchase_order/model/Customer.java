package com.ingaamira.modules.oop.oop_projects.project_purchase_order.model;

public class Customer {
    private int id;
    private String name;
    private String lastName;
    private static int nextId = 1;

    public Customer(String name, String lastName) {
        this.id = nextId++;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return name + " " + lastName;
    }

    @Override
    public String toString() {
        return "ID: " + id + " - " + getFullName();
    }
}
