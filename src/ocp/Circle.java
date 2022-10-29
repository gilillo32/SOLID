package ocp;

public class Circle extends Figure{
    float diameter;

    public Circle(float pDiam){
        this.diameter = pDiam;
    }

    @Override
    public void draw(){
        System.out.println("Zirkulua naiz");
    }

    @Override
    public double getArea(){
        return (Math.PI * Math.pow(diameter / 2, 2));
    }
}
