package com.kodilla.good.patterns.challenges.miniAllegro.products;

public class Laptop extends Product {
    private String brand;
    private String description;

    public Laptop(String name, String productType, double price, boolean available, String brand, String description) {
        super(name, productType, price, available);
        this.brand = brand;
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }
}
