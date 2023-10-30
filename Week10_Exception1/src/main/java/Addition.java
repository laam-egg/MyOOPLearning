public class Addition extends BinaryExpression {
    /**
     * Constructs a new addition expression.
     *
     * @param left - The left operand of the addition.
     * @param right - The right operand of the addition.
     */
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Stringifies this expression.
     *
     * @return the string representation.
     */
    @Override
    public String toString() {
        return String.format("(%s + %s)",
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
        return this.left.evaluate() + this.right.evaluate();
    }
}
