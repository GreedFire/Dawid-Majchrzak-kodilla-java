package com.kodilla.good.patterns.challenges.miniAllegro.interfaces;

import com.kodilla.good.patterns.challenges.miniAllegro.products.Product;

import java.time.LocalDate;

public interface InformationService {

    void inform(Product product, LocalDate boughtDate);

}
