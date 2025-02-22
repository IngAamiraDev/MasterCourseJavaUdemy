package com.ingaamira.modules.oop.project_purchase_order.model;

import java.math.BigDecimal;

public class Product {
    private String maker;
    private String name;
    private BigDecimal price;

    public Product(String maker, String name, BigDecimal price) {
        this.maker = maker;
        this.name = name;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + maker + " ($" + price + ")";
    }
}
