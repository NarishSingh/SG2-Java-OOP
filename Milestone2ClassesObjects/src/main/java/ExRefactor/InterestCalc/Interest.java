package ExRefactor.InterestCalc;

public class Interest {

    /*fields*/
    private double investment;
    private double annual;
    private int term;

    /*ctor*/
    public Interest() {
        //default ctor
    }

    public Interest(double investment, double annual, int term) {
        this.investment = investment;
        this.annual = annual;
        this.term = term;
    }

    /*getter/setter*/
    public double getInvestment() {
        return investment;
    }

    public double getAnnual() {
        return annual;
    }

    public int getTerm() {
        return term;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    /*behaviors*/
    /**
     * calculate yearly interest
     *
     * @return {double} interest earned per year
     */
    public double calcYearlyIntr() {
        double annualRate = getAnnual() / 100;
        return getInvestment() * annualRate;
    }

    /**
     * calculate quarterly interest
     *
     * @return {double} interest earned every 3 months/quarter
     */
    public double calcQuarterlyIntr() {
        double quarterlyRate = (getAnnual() / 4) / 100;
        return getInvestment() * quarterlyRate;
    }

    /**
     * calculate monthly interest
     *
     * @return {double} interest earned per month
     */
    public double calcMonthlyIntr() {
        double monthlyRate = (getAnnual() / 12) / 100;
        return getInvestment() * monthlyRate;
    }

    /**
     * calculate daily interest
     *
     * @return {double} interest earned daily
     */
    public double calcDailyIntr() {
        double dailyRate = (getAnnual() / 365) / 100;
        return getInvestment() * dailyRate;
    }

    public double yearEndPrinciple() {
        double yearEndPrinciple = getInvestment() + this.calcYearlyIntr();
        this.setInvestment(yearEndPrinciple);
        return yearEndPrinciple;
    }
}
