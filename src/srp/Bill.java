package srp;

import java.util.Date;

public class Bill {
    public String code;
    public Date billDate;
    public float billAmount;
    public float VAT;
    public float billDeduction;
    public float billTotal;
    public int deductionPercentage;

    private TotalCalculator totalCalc = new TotalCalculator();
    private DeductionCalculator deduCalc = new DeductionCalculator();
    private VATCalculator vatCalc = new VATCalculator((float) 0.16);

    // Fakturaren totala kalkulatzen duen metodoa.
    public void totalCalc() {
        billDeduction = deduCalc.calculateDeduction(billAmount, deductionPercentage);
        VAT = vatCalc.calculateVAT(billAmount);
        billTotal = totalCalc.calculateTotal(billAmount, VAT, billDeduction, code);
    }
}
