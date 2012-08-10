package twu.MathStudent;

import junit.framework.Assert;
import org.junit.Test;

public class ProbabilityTest {

    @Test
    public void shouldReturnTrueForEqualProbabilities(){
        Probability probabilityOfRollingAThree = new Probability(1,6);
        Probability probabilityOfRollingASix = new Probability(1,6);
        Assert.assertEquals(probabilityOfRollingAThree,
                probabilityOfRollingASix);
    }

    @Test
    public void shouldReturnFalseForUnequalProbabilities(){
        Probability probabilityOfRollingAThree = new Probability(1,6);
        Probability someProbability = new Probability(2,6);
        Assert.assertFalse(probabilityOfRollingAThree.equals(someProbability));
    }

    @Test
    public void shouldReturnComplementOfProbability(){
        Probability probabilityOfRollingAThree = new Probability(1,6);
        Probability probabilityOfNotGettingThree = new Probability(5,6);
        Assert.assertTrue(probabilityOfNotGettingThree.equals(probabilityOfRollingAThree.complement()));

    }

    @Test
    public void shouldReturnCombinedProbabilityOfANDedProbabilities(){
        Probability probabilityOfRollingOne= new Probability(1,6);
        Probability probabilityOfRollingSix = new Probability(1,6);
        Probability combinedProbabilityOfRollingOneandSix= new Probability((1/36.0));
        Assert.assertTrue(combinedProbabilityOfRollingOneandSix.equals(probabilityOfRollingOne.combineProbabilityWithAND(probabilityOfRollingOne)));
    }

    @Test
    public void shouldReturnCombinedProbabilityOfORedProbabilities(){
        Probability probabilityOfRollingOne= new Probability(1,6);
        Probability probabilityOfRollingSix = new Probability(1,6);
        Probability combinedProbabilityOfRollingOneAndSix= new Probability((1/6.0 + 1/6.0 - 1/36.0));
        Assert.assertTrue(combinedProbabilityOfRollingOneAndSix.equals(probabilityOfRollingOne.combineProbabilityWithOR(probabilityOfRollingSix)));
    }

}
