package com.kodilla.patterns;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLogger1(){
        Logger.getInstance().log("anything");
        Logger.getInstance().log("something");

        String lastLog = Logger.getInstance().getLastLog();

        Assert.assertEquals("something", lastLog);

    }

    @Test
    public void testLogger2(){
        Logger.getInstance().log("anything");

        String lastLog = Logger.getInstance().getLastLog();

        Assert.assertEquals("anything", lastLog);

    }
}
