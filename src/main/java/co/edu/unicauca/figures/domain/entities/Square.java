/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.figures.domain.entities;

/**
 *
 * @author Juan David Vela, Cristian Camilo Unas 
 */
public class Square extends Figure {

    private double side;/* Lado  */
    /**
     * Constructor of Square
     * @param side is the length of the side of the triangle
     * @throws Exception 
     */
    public Square(double side) throws Exception{
        if (side<=0)
            throw new Exception("side cannot be less than or equal to 0");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}
