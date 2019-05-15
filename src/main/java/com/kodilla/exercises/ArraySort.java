package com.kodilla.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static int[] sortOddNumbers(int[] array) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for(int number : array){
            if(number % 2 != 0)
                oddNumbers.add(number);
        }
        Collections.sort(oddNumbers);
        int i = 0;
        for(int number = 0; number < array.length; number++){
            if(array[number] % 2 != 0){
                array[number] = oddNumbers.get(i);
                i++;
            }
        }
        return array;
    }

    public static int[] sortOddNumbers2(final int[] array) {
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }
        return array;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        sortOddNumbers(new int[]{ 5, 3, 2, 8, 1, 4 });
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start));

        start = System.nanoTime();
        sortOddNumbers2(new int[]{ 5, 3, 2, 8, 1, 4 });
        end = System.nanoTime();
        System.out.println("Time: " + (end - start));
    }
}

