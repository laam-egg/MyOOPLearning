public class Multiplication extends BinaryExpression {
    /**
     * Constructs a new multiplication expression.
     *
     * @param left - The left operand of the multiplication.
     * @param right - The right operand of the multiplication.
     */
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Stringifies this expression.
     *
     * @return the string representation.
     */
    @Override
    public String toString() {
        return String.format("(%s * %s)",
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
        return this.left.evaluate() * this.right.evaluate();
    }
}
