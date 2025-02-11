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
public class SquareTest {
    
    public SquareTest() {
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
    void testSquareWithZeroSideThrowsException() {
        // Assert
        Exception exception = assertThrows(Exception.class, () -> {
            new Square(0);
        });
    }
    /**
     * Test of calculateArea method on small value, of class Square.
     */
    @Test
    public void testCalculateAreaMin() throws Exception{
        System.out.println("calculateArea");
        double side = 0.0001;
        Figure test = new Square(side);
        double expResult = side*side;
        double result = test.calculateArea();
        assertEquals(expResult, result, 0.0001);
    }
    /**
    * Test of calculateArea method on big value, of class Square.
    */
    @Test
    public void testCalculateAreaMax() throws Exception{
        System.out.println("calculateArea");
        double side = 99999.9;
        Figure test = new Square(side);
        double expResult = side*side;
        double result = test.calculateArea();
        assertEquals(expResult, result, 0.0001);
    }
    /**
    * Test of calculateArea method on average value, of class Square.
    */
    @Test
    public void testCalculateAreaAv() throws Exception{
        System.out.println("calculateArea");
        double side = 0.0001;
        Figure test = new Square(side);
        double expResult = side*side;
        double result = test.calculateArea();
        assertEquals(expResult, result, 0.0001);
    }
    /**
     * Test of calculatePerimeter method on small value, of class Square.
     */
    @Test
    public void testCalculatePerimeterMin() throws Exception{
        System.out.println("calculatePerimeter");
        double side = 0.0001;
        Figure test = new Square(side);
        double expResult = 4.0*side;
        double result = test.calculatePerimeter();
        assertEquals(expResult, result, 0.0001);
    }
    /**
    * Test of calculatePerimeter method on big value, of class Square.
    */
    @Test
    public void testCalculatePerimeterMax() throws Exception{
        System.out.println("calculatePerimeter");
        double side = 999999.9;
        Figure test = new Square(side);
        double expResult = 4.0*side;
        double result = test.calculatePerimeter();
        assertEquals(expResult, result, 0.0001);
    }
    /**
    * Test of calculatePerimeter method on average value, of class Square.
    */
    @Test
    public void testCalculatePerimeterAv() throws Exception{
        System.out.println("calculatePerimeter");
        double side = 5.0;
        Figure test = new Square(side);
        double expResult = 4.0*side;
        double result = test.calculatePerimeter();
        assertEquals(expResult, result, 0.0001);
    }
}
