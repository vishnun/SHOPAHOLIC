import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest{

    @Test
    public void shouldAddTwoNumbers(){
        Calculator calculator=new Calculator();
        double total = calculator.addition(1, 2);
        Assert.assertEquals(3.0, total);
    }

    @Test
    public void shouldAddNegativeNumbers(){
        Calculator calculator=new Calculator();
        double total = calculator.addition(1,-2);
        Assert.assertEquals(-1.0, total);
    }

    @Test
    public void shouldAddMultipleNumbers(){
        Calculator calculator=new Calculator();
        double total = calculator.addition(2, 3, 4.0, 1.0);
        Assert.assertEquals(10.0, total);
    }

    @Test
    public void shouldSubtractTwoNumbers(){
        Calculator calculator=new Calculator();
        double result = calculator.subtraction(2, 3);
        Assert.assertEquals(-1.0, result);
    }

    @Test
    public void shouldSubtractMultipleNumbersFromOne(){
        Calculator calculator=new Calculator();
        double result = calculator.subtraction(10, 3, 6);
        Assert.assertEquals(1.0, result);
    }
}
