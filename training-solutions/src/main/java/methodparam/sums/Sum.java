package methodparam.sums;

public class Sum {

    private double positiveSum;
    private double negativeSum;

    public Sum(double positiveSum, double negativeSum) {
        this.positiveSum = positiveSum;
        this.negativeSum = negativeSum;
    }

    public double getPositiveSum() {
        return positiveSum;
    }

    public double getNegativeSum() {
        return negativeSum;
    }
}