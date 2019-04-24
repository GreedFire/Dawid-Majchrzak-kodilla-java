package com.kodilla.calculator;

import java.util.*;

public class Calculator {

    public static double divide(double a, double b){
        if(b == 0){
            System.out.print("Wrong Value");
            return 0;
        }
        else
            return a / b;
    }
// checking if string is numeric and return this value as double
    public static double isNumeric(){

        String text = write();

        while(!text.matches("-?\\d+(\\.\\d+)?")){
            System.out.print("Wrong");
            text = write();
        }

        return Double.parseDouble(text);
    }

    private static String write(){

        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
