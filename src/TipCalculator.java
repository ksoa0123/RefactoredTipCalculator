public class TipCalculator {
    int numPeople;
    int tipPercentage;
    double totalBillBeforeTip;


    TipCalculator(int numPeople, int tipPercentage){
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;

        totalBillBeforeTip = 0;

    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost){
        totalBillBeforeTip += cost;
    }

    public double tipAmount(){
        return (totalBillBeforeTip * (tipPercentage / 100.0));
    }

    public double totalBill(){
        return (totalBillBeforeTip + this.tipAmount());
    }
    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount(){
        return (this.tipAmount() / numPeople);


    }

    public double perPersonTotalCost(){
        return this.totalBill() / numPeople;
    }
}
