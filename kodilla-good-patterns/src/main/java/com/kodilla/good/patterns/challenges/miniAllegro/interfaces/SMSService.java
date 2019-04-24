package com.kodilla.good.patterns.challenges.miniAllegro.interfaces;

import com.kodilla.good.patterns.challenges.miniAllegro.products.Product;

import java.time.LocalDate;

public class SMSService implements InformationService {
    public void inform(Product product, LocalDate boughtDate){
        System.out.println("You bought new product: "  + product.getName()  + " in our service " + boughtDate.getDayOfMonth() + "." + boughtDate.getMonthValue() + "." + boughtDate.getYear() +
                ". Check your account for more information. If you do not want us to inform you by SMS change your settings");
    }
}
