package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("ToDo", "Lists issues to do");
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        int id = taskList.getId();
        //When
        List<TaskList> readLists = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readLists.size());

        //CleanUp
        taskListDao.deleteById(id);
    }

}
