package com.kodilla.exercises;

public class ReverseWords {

    public static String reverseWords(final String original) {
        StringBuilder result = new StringBuilder();
        StringBuilder temporaryStr = new StringBuilder();

        for (int j = 0; j < original.length(); j++) {
            temporaryStr.append(original.charAt(j));
            if ((original.charAt(j) == ' ')) {
                for (int i = temporaryStr.length() - 2; i >= 0; i--) {
                    result.append(temporaryStr.charAt(i));
                }
                result.append(" ");
                temporaryStr = new StringBuilder();
            }
            if (j == original.length() - 1) {
                for (int i = temporaryStr.length() - 1; i >= 0; i--) {
                    result.append(temporaryStr.charAt(i));
                }
                temporaryStr = new StringBuilder();
            }
        }
        return result.toString();
    }

    public static String reverseWords2(final String original) {
        String[] array = original.split(" ");

        if (array.length == 0)
            return original;

        int i = 0;
        for (String string : array) {
            array[i] = new StringBuilder(string).reverse().toString();
            i++;
        }
        return String.join(" ", array);
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        ReverseWords.reverseWords("Dawid jest glupi.");
        long end = System.nanoTime();
        System.out.println(end - start);

        start = System.nanoTime();
        ReverseWords.reverseWords2("Dawid jest glupi.");
        end = System.nanoTime();
        System.out.println(end - start);
    }
}
