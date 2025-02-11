package co.edu.unicauca.figures;

import co.edu.unicauca.figures.domain.entities.Circle;
import co.edu.unicauca.figures.domain.entities.Figure;
import co.edu.unicauca.figures.domain.entities.Square;
import co.edu.unicauca.figures.domain.entities.Triangle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan David Vela, Cristian Camilo Unas 
 */
public class Main {

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        try{
            Figure fig1 = new Circle(2);
            Figure fig2 = new Square(10);
            Figure fig3 = new Triangle(3,3,3,4);

            figures.add(fig1);
            figures.add(fig2);
            figures.add(fig3);
        }
        catch(Exception e){
            System.out.println("Error: " + e.toString());
        }


        for (Figure fig : figures) {
            System.out.println("\nEl area es: " + fig.calculateArea());
            System.out.println("El perimetro es: " + fig.calculatePerimeter());
            
        }
    }
}
