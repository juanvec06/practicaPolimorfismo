
package co.edu.unicauca.figures.domain.entities;

/**
 *
 * @author Juan David Vela, Cristian Camilo Unas 
 */
public class Circle extends Figure{
    private double radius;
    /**
     * Constructor for a circle
     * @param radius is the radius of the radius
     * @throws java.lang.Exception
     */
    public Circle(double radius) throws Exception{
        if (radius<=0)
            throw new Exception("radius cannot be less than or equal to 0");
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
