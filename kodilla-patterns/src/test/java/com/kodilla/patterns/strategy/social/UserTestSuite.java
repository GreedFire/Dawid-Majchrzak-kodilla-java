package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialPublishers.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.users.Millenials;
import com.kodilla.patterns.strategy.social.users.YGeneration;
import com.kodilla.patterns.strategy.social.users.ZGeneration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTestSuite {
    private static int counter = 1;

    @Before
    public void beforeTest(){
        System.out.println();
        System.out.println("Test number: " + counter );
        counter++;
    }

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        Millenials millenial = new Millenials("User M");
        YGeneration yGeneration = new YGeneration("User Y");
        ZGeneration zGeneration = new ZGeneration("User Z");

        //When
        System.out.print(millenial.getUserName() + " " + millenial.shareContent() + "\n");
        System.out.print(millenial.getUserName() + " " + yGeneration.shareContent() + "\n");
        System.out.print(millenial.getUserName() + " " + zGeneration.shareContent() + "\n");

        //Then
        Assert.assertEquals("Shared facebook content", millenial.shareContent());
        Assert.assertEquals("Shared snapchat content", yGeneration.shareContent());
        Assert.assertEquals("shared twitter content", zGeneration.shareContent());
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        Millenials millenial = new Millenials("User M");
        millenial.setSocialPublisher(new SnapchatPublisher());

        //When
        System.out.print(millenial.getUserName() + " " + millenial.shareContent() + "\n");

        //Then
        Assert.assertNotEquals("Shared facebook content", millenial.shareContent());
        Assert.assertEquals("Shared snapchat content", millenial.shareContent());
    }
}
