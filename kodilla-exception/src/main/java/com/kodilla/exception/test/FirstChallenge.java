package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     *  ...
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double a = 3;
        double b = 0;
        double result = 0;

        try{
            result = firstChallenge.divide(a, b);
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong. " + e);
        }
        finally{
            if(b == 0)
                result = 0;
            else
                System.out.println("Everything is ok");
        }

        System.out.println(result);

    }
}