package twu.MathStudent;

//Job: Understands chance of outcome of a rolling event.
public class Dice {
    private double dicePossibilities = 6.0;

    public double getDiceRollingProbability(int rolledNo) {
        if(rolledNo<1||rolledNo>6){
            return 0.0;
        }
        return 1/this.dicePossibilities;
    }
}
