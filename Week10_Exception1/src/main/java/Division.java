public class Division extends BinaryExpression {
    /**
     * Constructs a new division expression.
     *
     * @param left - The dividend.
     * @param right - The divisor.
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Stringifies this expression.
     *
     * @return the string representation.
     */
    @Override
    public String toString() {
        return String.format("(%s / %s)",
                this.left.toString(),
                this.right.toString()
        );
    }

    /**
     * Evaluates this expression.
     *
     * @return the result.
     */
    @Override
    public double evaluate() {
        double dividend = this.left.evaluate();
        double divisor = this.right.evaluate();
        if (divisor == 0) {
            throw new java.lang.ArithmeticException("Lỗi chia cho 0");
        }
        return dividend / divisor;
    }
}
