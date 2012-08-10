package twu.MathStudent;

// Job: Understands the chance of getting a particular outcome
// given a certain number of possible outcomes

import java.math.BigDecimal;
import java.math.MathContext;

public class Probability {

    private double value;

    public Probability(double outcomes, double totalOutcomes ){
        value = ((double)outcomes)/((double)totalOutcomes);
    }

    public Probability(double value) {
        this.value=value;
    }

    @Override
    public int hashCode() {
        long temp = value != +0.0d ? Double.doubleToLongBits(value) : 0L;
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Probability{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        BigDecimal thisValue=new BigDecimal(value).round(MathContext.DECIMAL32);
        BigDecimal otherValue=new BigDecimal(that.value).round(MathContext.DECIMAL32);
        return thisValue.equals(otherValue);

    }

    public Probability complement() {
        return new Probability(1-this.value);

    }

    public  Probability combineProbabilityWithAND(Probability other) {
        return new Probability(value * other.value);
    }

    public Probability combineProbabilityWithOR(Probability other) {
        Probability complementThis = this.complement();
        Probability complementOther = other.complement();
        Probability ANDedProbabilities = complementThis.combineProbabilityWithAND(complementOther);
        return ANDedProbabilities.complement();
        //return new Probability(other.value+this.value - this.value*other.value);
    }
}
