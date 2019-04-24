package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        int[] tab = new int[20];

        for(int i = 0; i<20; i++){
            tab[i] = i;
        }

        double result = ArrayOperations.getAverage(tab);

        Assert.assertEquals(9.5, result, 0);
    }
}
