package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    ShapeCollector shapeCollector = null;

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
        System.out.println("Preparing to execute test #" + testCounter);
        ShapeCollector shapeCollector  = new ShapeCollector();
    }

    @Test //czy po dodaniu nowej figury wielkość listy wynosi 1
    public void testAddFigure() {
        //Given
        Shape square1 = new Square(3.0);
        //When
        shapeCollector.addFigure(square1);
        //Then
        Assert.assertEquals(1, shapeCollector.getListQuantity());
    }
    @Test // czy próba usunięcia nieistniejącej figury skończy się zwróceniem false
    public void testRemoveFigureNotExisting() {
        //Given
        Shape triangle1 = new Triangle(3.0, 2.0);
        //When
        boolean result = shapeCollector.removeFigure(triangle1);
        //Then
        Assert.assertFalse(result);
    }

    @Test //czy udało się usunąć wybraną figurę z klasy
    public void testRemoveFigure(){
        //Given
        Shape square2 = new Square(2.0);
        shapeCollector.addFigure(square2);
        //When
        boolean result = shapeCollector.removeFigure(square2);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getListQuantity());
    }

    @Test // czy figura pobrana z klasy jest taka sama jak figura wstawiona do klasy
    public void testGetFigure(){
        //Given
        Shape circle1 = new Circle(3.0);
        shapeCollector.addFigure(circle1);
        //When
        Shape retrivedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle1, retrivedFigure);
    }

    @Test // czy poprawnie pobiera wszystkie figury z klasy
    public void testShowFigures(){
        //Given
        Shape circle2 = new Circle(2.5);
        Shape triangle2 = new Triangle(3.0, 3.0);
        Shape square4 = new Square(3.0);

        shapeCollector.addFigure(circle2);
        shapeCollector.addFigure(triangle2);
        shapeCollector.addFigure(square4);

        String expected="shape=Circle, field=7.8500000000000005; shape=Triangle, field=4.5; shape=Square, field=9.0; ";

        //When
        String actual=shapeCollector.showFigures();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
