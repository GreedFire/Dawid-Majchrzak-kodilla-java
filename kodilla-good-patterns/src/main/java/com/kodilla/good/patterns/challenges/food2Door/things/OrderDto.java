package com.kodilla.good.patterns.challenges.food2Door.things;

import com.kodilla.good.patterns.challenges.food2Door.suppliers.Supplier;

public class OrderDto {
    private Supplier supplier;
    private Order order;

    public OrderDto(Supplier supplier, Order order) {
        this.supplier = supplier;
        this.order = order;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Order getOrder() {
        return order;
    }
}
