public abstract class BinaryExpression extends Expression {
    protected Expression left;

    protected Expression right;

    /**
     * Constructs the binary expression.
     * Every subclass must call this method.
     *
     * @param left - The left expression operand.
     * @param right - The right expression operand.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
