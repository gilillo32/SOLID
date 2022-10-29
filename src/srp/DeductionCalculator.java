package srp;

public class DeductionCalculator{

    public DeductionCalculator(){

    }

    public float calculateDeduction(float pAmount, float percentage) {
        if(pAmount > 50000) {
            return (pAmount * percentage + 5) / 100;
        }else {
            return (pAmount * percentage) / 100;
        }
    }

}
