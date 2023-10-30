public abstract class Expression {
    /**
     * Stringifies this expression.
     *
     * @return the string representation.
     */
    public abstract String toString();

    /**
     * Evaluates this expression.
     *
     * @return the value of the expression.
     */
    public abstract double evaluate();
}
