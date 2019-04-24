package com.kodilla.good.patterns.challenges.miniAllegro.interfaces;

import com.kodilla.good.patterns.challenges.miniAllegro.User;
import com.kodilla.good.patterns.challenges.miniAllegro.products.Product;

public interface BoughtRespository {
    void saveToDatabase(User user, Product product);
}
