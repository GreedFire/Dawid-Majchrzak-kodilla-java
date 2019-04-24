package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testTaskFactory(){

        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);

        System.out.println(shoppingTask.getTaskName());
        System.out.println(paintingTask.getTaskName());
        System.out.println(drivingTask.getTaskName());

        //Then
        Assert.assertEquals("Milk buy task", shoppingTask.getTaskName());
        Assert.assertEquals("Paint Car", paintingTask.getTaskName());
        Assert.assertEquals("Taxi", drivingTask.getTaskName());



    }
}
