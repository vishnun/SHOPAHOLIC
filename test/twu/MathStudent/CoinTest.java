package twu.MathStudent;

import junit.framework.Assert;
import org.junit.Test;

public class CoinTest{
    @Test
    public void chanceOfGettingHeads(){
        Coin coin=new Coin();
        double chanceOfGettingHeads = coin.getChanceOfGettingHeads();
        Assert.assertEquals((1 / 2.0), chanceOfGettingHeads);
    }
}
