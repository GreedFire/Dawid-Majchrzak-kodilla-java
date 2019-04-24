package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

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
        System.out.println("Preparing to execute shapes test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Circle(5));
        collector.addFigure(new Circle(3));
        collector.addFigure(new Square(1));

        Assert.assertTrue(collector.getShapeList().size() == 3);
    }
    @Test
    public void testRemoveFigure(){
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Circle(5));
        collector.addFigure(new Circle(3));
        collector.addFigure(new Square(1));

        collector.removeFigure(new Circle(5));

        Assert.assertTrue(collector.getShapeList().size() == 2);
    }
    @Test
    public void testGetFigure1(){
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Circle(5));
        collector.addFigure(new Square(2));
        collector.addFigure(new Triangle(2, 3));

        Shape expectedSquare = new Square(2);

       Assert.assertEquals(expectedSquare, collector.getFigure(1));
    }
    @Test
    public void testGetFigure2(){
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Circle(5));
        collector.addFigure(new Square(2));
        collector.addFigure(new Triangle(2, 3));

        Assert.assertEquals(null, collector.getFigure(3));
    }
    @Test
    public void testGetFigure3(){
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Circle(5));
        collector.addFigure(new Square(2));
        collector.addFigure(new Triangle(2, 3));

        Assert.assertEquals(null, collector.getFigure(-5));
    }

    public void testGetFigure4(){
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Circle(5));
        collector.addFigure(new Square(2));
        collector.addFigure(new Triangle(2, 3));

        Assert.assertEquals(null, collector.getFigure(10000));
    }
}
