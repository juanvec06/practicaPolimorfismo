/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.edu.unicauca.figures.domain.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Juan David Vela, Cristian Camilo Unas 
 */
public class CircleTest {
    
    public CircleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    /**
     * Test of invalid radius, of class Circle.
     */
    @Test
    void testCircleWithZeroRadiusThrowsException() {
        // Assert
        Exception exception = assertThrows(Exception.class, () -> {
            new Circle(0);
        });
    }
    /**
     * Test of calculateArea method on small radius, of class Circle.
     */
    @Test
    public void testCalculateAreaMin() throws Exception {
        System.out.println("calculateArea");
        double radius = 0.00001;
        Figure circleTest = new Circle(radius);
        double expResult = Math.PI*radius*radius;
        double result = circleTest.calculateArea();
        assertEquals(expResult, result, 0.0001);
    }
    /**
    * Test of calculateArea method on big radius, of class Circle.
    */
    @Test
    public void testCalculateAreaMax() throws Exception {
        System.out.println("calculateArea");
        double radius = 999999999.9;
        Figure circleTest = new Circle(radius);
        double expResult = Math.PI*radius*radius;
        double result = circleTest.calculateArea();
        assertEquals(expResult, result, 0.0001);
    }
    /**
    * Test of calculateArea method on average radius, of class Circle.
    */
    @Test
    public void testCalculateAreaAv() throws Exception {
        System.out.println("calculateArea");
        double radius = 5.0;
        Figure circleTest = new Circle(radius);
        double expResult = Math.PI*radius*radius;
        double result = circleTest.calculateArea();
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of calculatePerimeter method on big value, of class Circle.
     */
    @Test
    public void testCalculatePerimeterMax() throws Exception {
        System.out.println("calculatePerimeter");
        double radius = 999999.9;
        Figure circleTest = new Circle(radius);
        double expResult = 2*Math.PI*radius;
        double result = circleTest.calculatePerimeter();
        assertEquals(expResult, result, 0.0001);
    }
    /**
     * Test of calculatePerimeter method on small value, of class Circle.
     */
    @Test
    public void testCalculatePerimeterMin() throws Exception {
        System.out.println("calculatePerimeter");
        double radius = 0.000001;
        Figure circleTest = new Circle(radius);
        double expResult = 2*Math.PI*radius;
        double result = circleTest.calculatePerimeter();
        assertEquals(expResult, result, 0.0001);
    }
    /**
     * Test of calculatePerimeter method on average value, of class Circle.
     */
    @Test
    public void testCalculatePerimeterAv() throws Exception {
        System.out.println("calculatePerimeter");
        double radius = 5.0;
        Figure circleTest = new Circle(radius);
        double expResult = 2*Math.PI*radius;
        double result = circleTest.calculatePerimeter();
        assertEquals(expResult, result, 0.0001);
    }
}
