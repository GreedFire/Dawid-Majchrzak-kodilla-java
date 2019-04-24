package com.kodilla.stream.exercise;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static long getCountEmptyStringUsingJava8(List<String> strings){
        long result = strings.stream()
                .filter(e -> e.isEmpty())
                .count();

        return result;
    }

    public static long getCountLength3UsingJava8(List<String> strings){
        long result = strings.stream()
                .filter(e -> e.length() == 3 )
                .count();
        return result;
    }

    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings){
        return strings.stream()
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toList());
    }

    public static String getMergedStringUsingJava8(List<String>strings, String delimeter){
        return strings.stream()
                .filter(e -> !e.isEmpty())
                .collect(Collectors.joining(delimeter));
    }
    public static List<Integer> getSquaresJava8(List<Integer> numbers){
        return numbers.stream()
                .distinct()
                .map(e -> e*e)
                .collect(Collectors.toList());
    }

    public static Integer getMaxJava8(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(i -> i)
                .max()
                .orElse(0);
    }

    public static Integer getMinJava8(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(i -> i)
                .min()
                .orElse(0);
    }

    public static Integer getSumJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(i -> i)
                .sum();
    }

    public static Integer getAverageJava8(List<Integer> numbers){
        double result = numbers.stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0);
        return (int) result;
    }


}
