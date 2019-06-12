package com.kodilla.exercises;



import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class exercise2 {

    public static void main(String[] args) {
        int[] lista = new int[] {1, 2, 4, 5};
        int result = solution(lista);
        wyswietlWynik(lista, result);

        int[] lista2 = new int[] {1, 4, 8, 3, 2};
        int result2 = solution(lista2);
        wyswietlWynik(lista2, result2);

        int[] lista3 = new int[] {-3, -1};
        int result3 = solution(lista3);
        wyswietlWynik(lista3, result3);

        int[] lista4 = new int[] {1, 3, 6, 4, 1, 2};
        int result4 = solution(lista4);
        wyswietlWynik(lista4, result4);

        int[] lista5 = new int[] {2, 2, 2, 4};
        int result5 = solution(lista5);
        wyswietlWynik(lista5, result5);
    }

    public static void wyswietlWynik(int[] arr, int result) {
        StringBuilder builder = new StringBuilder();
        builder.append("Wynik dla tablicy: ");
        for (int a : arr) {
            builder.append(a);
            builder.append(" ");
        }
        builder.append("to: ");
        builder.append(result);
        System.out.println(builder.toString());
    }

//    public static int solution(int[] tab){
//        Arrays.sort(tab);
//        int min = tab[0];
//        int result = 0;
//        int previousNumber = 0;
//         for(int counter = 0; counter < tab.length; counter++, min++){
//             if(counter > 0 && tab[counter] == previousNumber) {
//                 min--;
//             }
//             if(tab[counter] != min && min > 0){
//                 result = min;
//                 break;
//             }
//             previousNumber = tab[counter];
//         }
//        return result;
//    }

    public static int solution(int[] tab) {
        int result = 0;
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(tab);
        for(int i : tab){
            set.add(i);
        }

        for(int counter = tab[0]; counter < tab[tab.length-1]; counter++){
            if(tab[tab.length-1] < 1) {
                result = 1;
            }
            if(!set.contains(counter) && counter > 0){
                result = counter;
                break;
            }
        }
        return result;
    }

}
