package srp;

public class VATCalculator{

    private float percentage = (float)0.16;

    public VATCalculator(float pPercentage){
        this.percentage = pPercentage;
    }

    public float calculateVAT(float pAmount){
        return pAmount * percentage;
    }
}
