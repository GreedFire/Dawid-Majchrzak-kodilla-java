package com.kodilla.exercises;

public class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired){
        double money = principal;
        double earnedDifference = 0;
        int years = 0;
        while(principal < desired) {
            money += money * interest;
            System.out.println("Money after interest: " + money);

            earnedDifference = money - principal;
            System.out.println("Difference after interest: " + earnedDifference);

            money -= earnedDifference * tax;
            System.out.println("Money after paid tax: " + money);

            principal = money;
            years++;
        }
        return years;
    }

    public static int calculateYears2(double principal, double interest, double tax, double desired) {
        int years = 0;
        while (principal < desired) {
            principal += principal * interest * (1 - tax);
            years++;
        }
        return years;
    }

    public static void main(String[] args){
        long start = System.nanoTime();
        System.out.println("1. Years: " + calculateYears(1000,0.05,0.18,1100));
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start));

        start = System.nanoTime();
        System.out.println("2. Years: " + calculateYears2(1000,0.05,0.18,1100));
        end = System.nanoTime();
        System.out.println("Time: " + (end - start));
    }
}
