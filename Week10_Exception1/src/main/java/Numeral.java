public class Numeral extends Expression {
    private final double value;

    /**
     * Constructs a new numeral expression with default value.
     */
    public Numeral() {
        this.value = 0;
    }

    /**
     * Constructs a new numeral expression with given value.
     *
     * @param value - the value of the expression.
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * Stringifies this expression.
     *
     * @return the string representation.
     */
    @Override
    public String toString() {
        double d = this.value;
        int i = (int) d;
        if (i == d) {
            return Integer.toString(i);
        } else {
            return Double.toString(this.value);
        }
    }

    /**
     * Evaluates this expression.
     *
     * @return the result.
     */
    @Override
    public double evaluate() {
        return this.value;
    }
}
