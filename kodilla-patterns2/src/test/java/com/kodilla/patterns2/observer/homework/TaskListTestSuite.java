package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TaskListTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Teacher teacher = new Teacher("Mentor");
        TaskList tasklist = new TaskList("User1 tasklist");
        Task task1 = new Task("task1");
        Task task2 = new Task("task2");
        Task task3 = new Task("task3");
        tasklist.registerOvserver(teacher);
        //When
        tasklist.addTask(task1);
        tasklist.addTask(task2);
        tasklist.addTask(task3);
        //Then
        Assert.assertEquals(3, teacher.getUpdateCount());
    }
}
