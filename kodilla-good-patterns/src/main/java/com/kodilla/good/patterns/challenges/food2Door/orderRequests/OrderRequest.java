package com.kodilla.good.patterns.challenges.food2Door.orderRequests;

import com.kodilla.good.patterns.challenges.food2Door.things.Order;
import com.kodilla.good.patterns.challenges.food2Door.things.OrderDto;
import com.kodilla.good.patterns.challenges.food2Door.things.Product;
import com.kodilla.good.patterns.challenges.food2Door.suppliers.Supplier;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class OrderRequest {

    public OrderDto newOrder1(){
        ArrayList<Product> productsList = new ArrayList<>();
        productsList.add(new Product("Tomatoe", 100));
        productsList.add(new Product("Cucumber", 75));
        LocalDate date = LocalDate.now();
        Order order = new Order(111111, productsList, date);

        Supplier supplier = new Supplier("ExtraFoodShop", "Fresh vegetables", "999888777", "999999999");

        return new OrderDto(supplier, order);
    }

    public OrderDto newOrder2(){
        ArrayList<Product> productsList = new ArrayList<>();
        productsList.add(new Product("Milk", 100));
        LocalDate date = LocalDate.of(2019, Month.FEBRUARY, 10);
        Order order = new Order(222222, productsList, date);

        Supplier supplier = new Supplier("GlutenFreeShop", "Fresh Milk", "111222777", "888888888");
        return new OrderDto(supplier, order);
    }


}
