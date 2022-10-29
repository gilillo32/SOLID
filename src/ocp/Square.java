package ocp;

public class Square extends Figure{
    float lenght;

    public Square(float pLenght){
        this.lenght = pLenght;
    }

    @Override
    public void draw(){
        System.out.println("Square naiz");
    }

    @Override
    public double getArea(){
        return Math.pow(lenght, 2);
    }
}
