public class Square extends Expression {
    private final Expression expression;

    /**
     * Constructs a new square expression.
     *
     * @param expression - The base expression.
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * Stringifies this expression.
     *
     * @return the string representation.
     */
    @Override
    public String toString() {
        return String.format("(%s) ^ 2",
                this.expression.toString()
        );
    }

    /**
     * Evaluates this expression.
     *
     * @return the result.
     */
    @Override
    public double evaluate() {
        double d = this.expression.evaluate();
        return d * d;
    }
}
