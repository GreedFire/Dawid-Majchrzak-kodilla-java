package com.kodilla.good.patterns.challenges.food2Door.things;

public class Product {
    private String name;
    private int weightOrQuantity;

    public Product(String name, int weightOrQuantity) {
        this.name = name;
        this.weightOrQuantity = weightOrQuantity;
    }

    public String getName() {
        return name;
    }

    public int getWeightOrQuantity() {
        return weightOrQuantity;
    }

    @Override
    public String toString() {
        return name + ": " + weightOrQuantity;
    }
}
