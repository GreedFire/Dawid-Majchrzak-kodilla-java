package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TaskListTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Teacher teacher1 = new Teacher("Mentor1");
        Teacher teacher2 = new Teacher("Mentor2");
        TaskList tasklist1 = new TaskList("User1 tasklist");
        TaskList taskList2 = new TaskList("User2 tasklist");
        Task task1 = new Task("task1");
        Task task2 = new Task("task2");
        Task task3 = new Task("task3");
        tasklist1.registerOvserver(teacher1);
        taskList2.registerOvserver(teacher2);
        //When
        tasklist1.addTask(task1);
        tasklist1.addTask(task2);
        tasklist1.addTask(task3);
        taskList2.addTask(task1);
        taskList2.addTask(task2);

        //Then
        Assert.assertEquals(3, teacher1.getUpdateCount());
        Assert.assertEquals(2, teacher2.getUpdateCount());
    }
}
