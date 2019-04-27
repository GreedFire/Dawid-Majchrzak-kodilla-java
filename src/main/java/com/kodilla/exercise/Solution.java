package com.kodilla.exercise;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        int pair1 = numberOfPairs(new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        int pair2 = numberOfPairs(new int[]{20, 20});
        int pair3 = numberOfPairs(new int[]{10, 20, 30, 40, 50});
        if(pair1 == 3 && pair2 == 1 && pair3 == 0) {
            System.out.println("Znaleziono poprawną liczbę par");
        } else {
            System.out.println("Znaleziono błędną liczbę par");
        }
    }

    private static Integer numberOfPairs(int[] array) {

        //w argumencie metoda przyjmuje tablicę liczb
        //wyświetl/zwróć liczbę par znajduje się w tablicy
        //przykład 1: tablica zawiera: 10, 10, 20, wynik: w tablicy znajduje się jedna para
        //przykład 2: tablica zawiera: 10, 20, 30, wynik: w tablicy nie znajduje się żadna para
        //przykład 3: tablica zawiera: 20, 20, 30, 40, 20, wynik: w tablicy znajduje się jedna para

        return 0;

    }
}