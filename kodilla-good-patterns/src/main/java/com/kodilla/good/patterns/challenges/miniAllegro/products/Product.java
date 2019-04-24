package com.kodilla.good.patterns.challenges.miniAllegro.products;

public abstract class Product {
    private String name;
    private String productType;
    private double price;
    private boolean available;

    public Product(String name, String productType, double price, boolean available) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public String getProductType() {
        return productType;
    }

    public double getPrice() {
        return price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
}
