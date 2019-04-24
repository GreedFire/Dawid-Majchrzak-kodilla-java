package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        Country poland = new Country( "40000000000");
        Country germany = new Country("10000000000");
        Country russia = new Country( "20000000000");
        Country china = new Country(  "20000000000");

        Continent europa = new Continent();
        Continent asia = new Continent();

        World world = new World();

        europa.addCountry(poland);
        europa.addCountry(germany);

        asia.addCountry(russia);
        asia.addCountry(china);

        world.addContinent(europa);
        world.addContinent(asia);

        Assert.assertEquals(new BigDecimal("90000000000"), world.getPeopleQuantity());

    }
}
