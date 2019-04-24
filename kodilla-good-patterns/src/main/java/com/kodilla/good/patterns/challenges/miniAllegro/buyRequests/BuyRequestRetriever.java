package com.kodilla.good.patterns.challenges.miniAllegro.buyRequests;

import com.kodilla.good.patterns.challenges.miniAllegro.User;
import com.kodilla.good.patterns.challenges.miniAllegro.products.Laptop;
import com.kodilla.good.patterns.challenges.miniAllegro.products.Product;

import java.time.LocalDate;

public class BuyRequestRetriever {
    public BuyRequest retrieve(){
        User user = new User("Dawid", "Majchrzak");
        Product product = new Laptop("Acer F15", "electrical goods", 1500.00, true, "Acer","Best Acer product in the world");

        return new BuyRequest(user, product, LocalDate.now());
    }

}
