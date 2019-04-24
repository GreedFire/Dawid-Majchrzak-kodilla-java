package com.kodilla.good.patterns.challenges.miniAllegro.interfaces;

import com.kodilla.good.patterns.challenges.miniAllegro.products.Product;
import com.kodilla.good.patterns.challenges.miniAllegro.User;

public interface BuyService {
    boolean buy(User user, Product product);

}
