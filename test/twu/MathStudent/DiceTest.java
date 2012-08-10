package twu.MathStudent;

import junit.framework.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void shouldReturnChanceOfGettingANumber(){
        Dice dice=new Dice();
        double chanceOfGetting3= dice.getDiceRollingProbability(3);
        Assert.assertEquals((1 / 6.0), chanceOfGetting3);
    }
    @Test
    public void shouldReturnSameChanceForGettingThreeAndSix(){
        Dice dice =new Dice();
        double chanceOfGettingThree= dice.getDiceRollingProbability(3);
        double chanceOfGettingSix= dice.getDiceRollingProbability(6);
        Assert.assertEquals(chanceOfGettingSix,chanceOfGettingThree);
    }
}
