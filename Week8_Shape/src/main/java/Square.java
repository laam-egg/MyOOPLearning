public class Square extends Rectangle {
    /**
     * Constructs a new Square with default properties.
     */
    public Square() {
        super();
    }

    /**
     * Constructs a new Square with given side.
     *
     * @param side - The side of the square.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructs a new Square with given properties.
     *
     * @param side - The side of the square.
     * @param color - The color of the square.
     * @param filled - Whether the square is filled.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Constructs a new Square with given properties.
     *
     * @param topLeft - The top-left point of the square.
     * @param side - The side of the square.
     * @param color - The color of the square.
     * @param filled - Whether the square is filled.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * Yields the side of the square.
     *
     * @return the side of the square.
     */
    public double getSide() {
        return this.getWidth();
    }

    /**
     * Sets the new side of the square.
     *
     * @param newSide - the new side of the square.
     */
    public void setSide(double newSide) {
        super.setWidth(newSide);
        super.setLength(newSide);
    }

    /**
     * Sets the new side of the square.
     *
     * @param newSide - the new side of the square.
     */
    @Override
    public void setWidth(double newSide) {
        setSide(newSide);
    }

    /**
     * Sets the new side of the square.
     *
     * @param newSide - the new side of the square.
     */
    @Override
    public void setLength(double newSide) {
        setSide(newSide);
    }

    @Override
    public String toString() {
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%s]",
                this.topLeft.toString(),
                getSide(),
                getColor(),
                isFilled()
        );
    }

    /**
     * Detects equality.
     *
     * @param obj - Another Object.
     * @return whether this Square instance equals the given Object.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square other = (Square) obj;
            return (
                    this.topLeft.equals(other.topLeft)
                    && (this.getSide() - other.getSide() < 0.001)
            );
        }
        return false;
    }

    /**
     * Generates hash code for this Square object.
     * @return the generated hash code.
     */
    @Override
    public int hashCode() {
        return (this.topLeft.hashCode() + (int) (this.getSide() * 71)) % 101;
    }
}
