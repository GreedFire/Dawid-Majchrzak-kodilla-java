package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("kolacja");
        board.getInProgressList().addTask("obiad");
        board.getDoneList().addTask("śniadanie");
        //Then
        System.out.print("\n To do: ");
        board.getToDoList().getTasks().forEach(System.out::print);
        System.out.print("\n In progress: ");
        board.getInProgressList().getTasks().forEach(System.out::print);
        System.out.print("\n Done: ");
        board.getDoneList().getTasks().forEach(System.out::print);

        Assert.assertEquals("kolacja", board.getToDoList().getTasks().get(0));
        Assert.assertEquals(1, board.getInProgressList().getTasks().size());
        Assert.assertEquals("śniadanie", board.getDoneList().getTasks().get(0));

    }
}
