package ocp;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet{
    Vector<Figure> figurak = new Vector<Figure>();

    public void addFigure(Figure f){
        figurak.add(f);
    }

    public void drawFigures(){
        Enumeration<Figure> eFigures = figurak.elements();
        Figure f;
        while(eFigures.hasMoreElements()){
            f = eFigures.nextElement();
            f.draw();
        }
    }

    public void getAreas(){
        Enumeration<Figure> eFigures = figurak.elements();
        Figure f;
        while(eFigures.hasMoreElements()){
            f = eFigures.nextElement();
            System.out.println(f.getArea());
        }
    }

    public static void main(String[] args){
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(4);

        Square sq1 = new Square(9);

        Diamond d1 = new Diamond(1, 2);

        Sheet sh = new Sheet();

        sh.addFigure(c1);
        sh.addFigure(c2);
        sh.addFigure(sq1);
        sh.addFigure(d1);

        sh.drawFigures();
        sh.getAreas();
    }
}