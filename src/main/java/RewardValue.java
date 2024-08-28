class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double conversionRate = 0.0035;
    RewardValue(double cashvalue) {
        this.cashValue = cashvalue;
        this.milesValue = (int) (cashvalue / conversionRate);
    }
    RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * conversionRate;
    }
    double getCashValue(){
        return cashValue;
    }
    double getMilesValue(){
        return milesValue;
    }
}