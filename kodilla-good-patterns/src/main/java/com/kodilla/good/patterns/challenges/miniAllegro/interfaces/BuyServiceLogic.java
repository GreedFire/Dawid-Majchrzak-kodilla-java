package com.kodilla.good.patterns.challenges.miniAllegro.interfaces;

import com.kodilla.good.patterns.challenges.miniAllegro.User;
import com.kodilla.good.patterns.challenges.miniAllegro.products.Product;

public class BuyServiceLogic implements BuyService {

    public boolean buy(User user, Product product) {
        if (product.isAvailable()) {
            System.out.println("User " + user.getName() + " " + user.getSurname() + " bought product for " + product.getPrice());
            product.setAvailable(false);
            return true;
        } else {
            System.out.println("User " + user.getName() + " " + user.getSurname() + " didn't buy product");
            return false;
        }
    }

}
