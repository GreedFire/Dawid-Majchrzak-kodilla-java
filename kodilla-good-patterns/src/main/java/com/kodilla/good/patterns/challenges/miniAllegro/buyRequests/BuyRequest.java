package com.kodilla.good.patterns.challenges.miniAllegro.buyRequests;

import com.kodilla.good.patterns.challenges.miniAllegro.User;
import com.kodilla.good.patterns.challenges.miniAllegro.products.Product;

import java.time.LocalDate;

public class BuyRequest {
    private User user;
    private Product product;
    private LocalDate buyDate;

    public BuyRequest(final User user, final Product product, final LocalDate buyDate) {
        this.user = user;
        this.product = product;
        this.buyDate = buyDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }
}
