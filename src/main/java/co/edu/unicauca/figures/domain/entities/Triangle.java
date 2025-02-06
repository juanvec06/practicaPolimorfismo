/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.figures.domain.entities;

/**
 *
 * @author spart
 */
public class Triangle extends Figure{
    private double baseLength;
    private double rightLength;
    private double leftLength;
    private double hight;
    
    /**
     * Constructor for any type of triangle
     * @param baseLength the first side or the base of it
     * @param rightLength the second side or the right side of it
     * @param leftLength the thrd side or the left side of it
     * @param hight the hight of the triangle, sometimes can be the same as one of the sides
     */
    public Triangle(double baseLength, double rightLength, double leftLength, double hight) throws Exception{
        if (baseLength<=0 || rightLength<=0 || leftLength<=0 || hight<=0)
            throw new Exception("any side or hight of the triangle cannot be less than or equal to 0");
        this.baseLength = baseLength;
        this.rightLength = rightLength;
        this.leftLength = leftLength;
        this.hight = hight;
    }
    @Override
    public double calculateArea() {
        return baseLength*hight/2;
    }

    @Override
    public double calculatePerimeter() {
        return baseLength+rightLength+leftLength;
    }
}
