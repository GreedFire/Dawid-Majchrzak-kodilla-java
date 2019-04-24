package com.kodilla.calculator;

import static com.kodilla.calculator.Calculator.isNumeric;

public class Application {
    public static void main(String[] args){

        System.out.print("Give number: ");
        double a = isNumeric();

        double b = isNumeric();

        double result = Calculator.divide(a, b);
        System.out.println(result);

    }
}
