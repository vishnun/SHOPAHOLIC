/**
 * Created with IntelliJ IDEA.
 * User: vishnun
 * Date: 8/8/12
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    public double addition(double amount1, double amount2) {
        return amount1+amount2;
    }

    public double addition(double... amounts) {
        double total=0.0;
        for (double amount : amounts) {
            total+=amount;
        }
        return total;
    }

    public double subtraction(double total, double amount) {
        total -= amount;
        return total;
    }

    public double subtraction(double total, double... amounts) {
        for (double amount : amounts) {
            total-=amount;
        }
        return total;
    }
}
