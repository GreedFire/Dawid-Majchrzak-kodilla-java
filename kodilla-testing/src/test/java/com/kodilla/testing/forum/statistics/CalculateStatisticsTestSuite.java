package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute forum statistics test #" + testCounter);
    }
    @Test
    public void testPosts0(){
        CalculateStatistics calculator = new CalculateStatistics();
        Statistics statsMock = mock(Statistics.class);
        calculator.calculateAdvStatistics(statsMock);

        Assert.assertEquals(0, calculator.getPostsCount());
    }
    @Test
    public void testPosts1000(){
        CalculateStatistics calculator = new CalculateStatistics();
        Statistics statsMock = mock(Statistics.class);

        when(statsMock.postsCount()).thenReturn(1000);
        calculator.calculateAdvStatistics(statsMock);

        Assert.assertEquals(1000, calculator.getPostsCount());
    }
    @Test
    public void testComments0(){
        CalculateStatistics calculator = new CalculateStatistics();
        Statistics statsmock = mock(Statistics.class);
        calculator.calculateAdvStatistics(statsmock);

        Assert.assertEquals(0, calculator.getCommentsCount());
    }
    @Test
    public void testLessCommentsThanPosts(){
        CalculateStatistics calculator = new CalculateStatistics();
        Statistics statsMock = mock(Statistics.class);

        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(500);
        calculator.calculateAdvStatistics(statsMock);

        Assert.assertEquals(0, calculator.getAvgCommentsPerPost());
    }
    @Test
    public void testLessPostsThanComments(){
        CalculateStatistics calculator = new CalculateStatistics();
        Statistics statsMock = mock(Statistics.class);

        when(statsMock.postsCount()).thenReturn(500);
        when(statsMock.commentsCount()).thenReturn(1000);
        calculator.calculateAdvStatistics(statsMock);

        Assert.assertEquals(2, calculator.getAvgCommentsPerPost());
    }
    @Test
    public void testUsers0(){
        CalculateStatistics calculator = new CalculateStatistics();
        Statistics statsMock = mock(Statistics.class);

        calculator.calculateAdvStatistics(statsMock);

        Assert.assertEquals(0, calculator.getUsersCount());
    }
    @Test
    public void testUsers100(){
        CalculateStatistics calculator = new CalculateStatistics();
        Statistics statsMock = mock(Statistics.class);

        ArrayList<String> exampleList = new ArrayList<String>();
        for(int i = 0; i < 100; i++){
            exampleList.add("x" + i);
        }

        when(statsMock.usersNames()).thenReturn(exampleList);
        calculator.calculateAdvStatistics(statsMock);

        Assert.assertEquals(100, calculator.getUsersCount());
    }

    @Test
    public void testZero(){
        CalculateStatistics calculator = new CalculateStatistics();
        Statistics statsMock = mock(Statistics.class);

        when(statsMock.postsCount()).thenReturn(0);
        when(statsMock.commentsCount()).thenReturn(100);
        calculator.calculateAdvStatistics(statsMock);

        System.out.println(calculator.getAvgCommentsPerPost());

        Assert.assertEquals(0, calculator.getAvgCommentsPerPost());
    }
}
