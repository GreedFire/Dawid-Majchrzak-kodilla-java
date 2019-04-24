package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> testList = new ArrayList<>();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> listModifiedByMethod = exterminator.exterminate(testList);

        System.out.println("Testing empty list");
        Assert.assertTrue(listModifiedByMethod.size() == 0);


    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Start List
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);

        //Even List
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> evenNumbers = exterminator.exterminate(testList);

        //Expected List
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);

        //Checking values
        System.out.println("Testing evenList.");
        Assert.assertEquals(evenNumbers.get(0), expectedList.get(0));
        Assert.assertEquals(evenNumbers.get(1), expectedList.get(1));



    }

}
