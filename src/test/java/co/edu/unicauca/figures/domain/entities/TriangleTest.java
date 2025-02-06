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
 * @author spart
 */
public class TriangleTest {
    
    public TriangleTest() {
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
     * Test of invalid radius, of class Square.
     */
    @Test
    void testTriangleWithZeroBaseThrowsException() {
        // Assert
        Exception exception = assertThrows(Exception.class, () -> {
            new Triangle(0,1,1,1);
        });
    }
    @Test
    void testTriangleWithZeroRightSideThrowsException() {
        // Assert
        Exception exception = assertThrows(Exception.class, () -> {
            new Triangle(1,0,1,1);
        });
    }
    @Test
    void testTriangleWithZeroLeftSideThrowsException() {
        // Assert
        Exception exception = assertThrows(Exception.class, () -> {
            new Triangle(1,1,0,1);
        });
    }
    @Test
    void testTriangleWithZeroHigthThrowsException() {
        // Assert
        Exception exception = assertThrows(Exception.class, () -> {
            new Triangle(1,1,1,0);
        });
    }
    /**
     * Test of calculateArea method with small values, of class Triangle.
     */
    @Test
    public void testCalculateAreaMin() throws Exception{
        System.out.println("calculateArea");
        double base=0.02,side1=0.02,side2=0.01, h=0.02;
        Figure test = new Triangle(base,side1,side2,h);
        double expResult = base*h/2;
        double result = test.calculateArea();
        assertEquals(expResult, result, 0);
    }
    /**
     * Test of calculateArea method with small values, of class Triangle.
     */
    @Test
    public void testCalculateAreaMax() throws Exception{
        System.out.println("calculateArea");
        double base=20000000.0,side1=20000000.0,side2=10000000.0, h=20000000.0;
        Figure test = new Triangle(base,side1,side2,h);
        double expResult = base*h/2;
        double result = test.calculateArea();
        assertEquals(expResult, result, 0);
    }
    /**
     * Test of calculateArea method with small values, of class Triangle.
     */
    @Test
    public void testCalculateAreaAv() throws Exception{
        System.out.println("calculateArea");
        double base=20.0,side1=20.0,side2=10.0, h=20.0;
        Figure test = new Triangle(base,side1,side2,h);
        double expResult = base*h/2;
        double result = test.calculateArea();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of calculatePerimeter method with big values, of class Triangle.
     */
    @Test
    public void testCalculatePerimeterMax() throws Exception{
        System.out.println("calculatePerimeter");
        double base=2000000.0,side1=2000000.0,side2=1000000.0, h=2000000.0;
        Figure test = new Triangle(base,side1,side2,h);
        double expResult = base+side1+side2;
        double result = test.calculatePerimeter();
        assertEquals(expResult, result, 0);
    }
        /**
     * Test of calculatePerimeter method with small values, of class Triangle.
     */
    @Test
    public void testCalculatePerimeterMin() throws Exception{
        System.out.println("calculatePerimeter");
        double base=0.0002,side1=0.0002,side2=0.0001, h=0.0002;
        Figure test = new Triangle(base,side1,side2,h);
        double expResult = base+side1+side2;
        double result = test.calculatePerimeter();
        assertEquals(expResult, result, 0);
    }
    /**
     * Test of calculatePerimeter method with average values, of class Triangle.
     */
    @Test
    public void testCalculatePerimeterAv() throws Exception{
        System.out.println("calculatePerimeter");
        double base=20.0,side1=20.0,side2=10.0, h=20.0;
        Figure test = new Triangle(base,side1,side2,h);
        double expResult = base+side1+side2;
        double result = test.calculatePerimeter();
        assertEquals(expResult, result, 0);
    }
}
