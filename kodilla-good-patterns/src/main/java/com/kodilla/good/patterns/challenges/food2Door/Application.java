package com.kodilla.good.patterns.challenges.food2Door;

import com.kodilla.good.patterns.challenges.food2Door.orderRequests.OrderRequest;
import com.kodilla.good.patterns.challenges.food2Door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2Door.suppliers.GlutenFreeShop;

public class Application {
    public static void main(String[] args){
        OrderRequest orders = new OrderRequest();

        ExtraFoodShop supplier1 = new ExtraFoodShop();
        supplier1.process(orders.newOrder1());


        GlutenFreeShop supplier2 = new GlutenFreeShop();
        supplier2.process(orders.newOrder2());
    }
}
