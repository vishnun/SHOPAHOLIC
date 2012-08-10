package twu.MathStudent;

//Job: Understands chance of outcome of a toss
public class Coin {

    private double coinPossibilities = 2.0;
    public double getChanceOfGettingHeads() {
        return 1/this.coinPossibilities;
    }
}
