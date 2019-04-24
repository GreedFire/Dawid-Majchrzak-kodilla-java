package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {
        SecondChallenge second = new SecondChallenge();
        String result = "nothing";

        try {
            result = second.probablyIWillThrowException(3, 1.5);
        } catch (Exception e) {
            System.out.println("Something went wrong. ");
        } finally {
            System.out.println(result);
        }
    }
}
