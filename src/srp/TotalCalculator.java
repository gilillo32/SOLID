package srp;

public class TotalCalculator{

    public TotalCalculator(){
    }

    public float calculateTotal(float pAmount, float pVAT, float pDeduction, String pKodea) {
        if(pKodea.equals("0")) {
            return (pAmount - pDeduction);
        }else {
            return (pAmount - pDeduction) + pVAT;
        }
    }
}
