package ocp;

public class Diamond extends Figure{
    float shortRadius;
    float longRadius;

    public Diamond(float pShortRadius, float pLongRadius){
        this.shortRadius = pShortRadius;
        this.longRadius = pLongRadius;
    }

    @Override
    public void draw(){
        System.out.println("Diamantea naiz");
    }

    @Override
    public double getArea(){
        return (shortRadius * longRadius) / 2;
    }
}
