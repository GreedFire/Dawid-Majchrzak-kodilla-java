package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(2)
                .ingredient("cheese")
                .ingredient("cucumber")
                .sauce("standard")
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        System.out.println(bigmac);

        //Then
        Assert.assertEquals(2, howManyIngredients);


    }
}
