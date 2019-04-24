package com.kodilla.good.patterns.challenges.food2Door.things;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int numberOfOrder;
    private ArrayList<Product> productsList;
    private LocalDate date;

    public Order(int numberOfOrder, ArrayList<Product> productsList, LocalDate date) {
        this.numberOfOrder = numberOfOrder;
        this.productsList = productsList;
        this.date = date;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public LocalDate getDate() {
        return date;
    }
}
