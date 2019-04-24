package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder {

    public BigDecimal getCost(){
        return new BigDecimal(10.00);
    }

    public String getDescription(){
        return "Pizza with: cheese, tomato sauce";
    }
}
