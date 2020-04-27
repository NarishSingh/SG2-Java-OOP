package ExRefactor.LuckySevens;

import java.util.Random;

public class LSGame {

    /*fields*/
    public static final double WIN = 4.0;
    public static final double LOSS = 1.0;
    private double bank;
    private int rollCt;
    private int peakRoll;
    private double peakPot;

    /*ctors*/
    public LSGame(double buyIn) {
        setBank(buyIn);
        this.rollCt = 0;
        this.peakRoll = 0;
        this.peakPot = 0;
    }

    /*getter/setter*/
    public double getBank() {
        return bank;
    }

    public void setBank(double bank) {
        if (bank > 0) {
            this.bank = bank;
        } else {
            throw new IllegalArgumentException("Invalid bet amount.");
        }
    }

    public int getRollCt() {
        return rollCt;
    }

    public void setRollCt(int rollCt) {
        this.rollCt = rollCt;
    }

    public int getPeakRoll() {
        return peakRoll;
    }

    public void setPeakRoll(int peakRoll) {
        this.peakRoll = peakRoll;
    }

    public double getPeakPot() {
        return peakPot;
    }

    public void setPeakPot(double peakPot) {
        this.peakPot = peakPot;
    }

    /*behaviors*/
    /**
     * Roll 2 6-sided dice and return sum
     *
     * @return {int} 2-12
     */
    public int roll() {
        Random dice = new Random();

        int dice1 = dice.nextInt(6) + 1;
        int dice2 = dice.nextInt(6) + 1;

        return dice1 + dice2;
    }

    /**
     * Watch rolls and log the highest earning and the roll it was achieved
     */
    public void trackPeak() {
        if (this.bank > getPeakPot()) {
            setPeakPot(this.bank);
            setPeakRoll(this.rollCt);
        }
    }

    /**
     * Evaluate a roll - add $4 to winning roll of 7, else take $1 for loss
     *
     * @param playerRoll {int} 2-12, sum of 2 dice
     */
    public void evaluateRoll(int playerRoll) {
        //FIXME Prof Palm's prescribed way not working
        switch (playerRoll) {
            case 7: {
                /*
                setBank(this.bank + WIN);
                setRollCt(this.rollCt++);
                 */
                this.bank += WIN;
                this.rollCt++;
                break;
            }
            default: {
                /*
                setBank(this.bank - LOSS);
                setRollCt(this.rollCt++);
                 */
                this.bank -= LOSS;
                this.rollCt++;
                break;
            }
        }
    }
}
