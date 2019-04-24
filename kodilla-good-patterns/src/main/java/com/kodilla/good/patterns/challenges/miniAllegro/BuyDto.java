package com.kodilla.good.patterns.challenges.miniAllegro;

import com.kodilla.good.patterns.challenges.miniAllegro.products.Product;

public class BuyDto {
    private User user;
    private Product product;
    private boolean isBought;

    public BuyDto(User user, Product product, boolean isBought) {
        this.user = user;
        this.product = product;
        this.isBought = isBought;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }
}
