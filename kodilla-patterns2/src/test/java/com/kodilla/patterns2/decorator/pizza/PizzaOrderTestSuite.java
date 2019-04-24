package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.decorators.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.decorators.AdditionalCheeseDecorator;
import com.kodilla.patterns2.decorator.pizza.decorators.HamDecorator;
import com.kodilla.patterns2.decorator.pizza.decorators.PepperoniDecorator;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;


public class PizzaOrderTestSuite {

    @Test
    public void testPizzaDecorator(){
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new AbstractPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        pizzaOrder = new PepperoniDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);

        Assert.assertEquals(new BigDecimal(22.00), pizzaOrder.getCost());
        Assert.assertEquals("Pizza with: cheese, tomato sauce, additional cheese, pepperoni, ham", pizzaOrder.getDescription());
    }

}