class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double conversionRate = 0.0035;
    RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / conversionRate);
    }
    RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * conversionRate;
    }
    double getCashValue(){
        return cashValue;
    }
    int getMilesValue(){
        return milesValue;
    }
}