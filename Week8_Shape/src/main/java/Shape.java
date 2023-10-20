public abstract class Shape {
    protected String color;

    protected boolean filled;

    /**
     * Constructs a new Shape with default properties.
     */
    public Shape() {
        this.color = null;
        this.filled = false;
    }

    /**
     * Constructs a new Shape with given properties.
     *
     * @param color - The color of the shape.
     * @param filled - A boolean value indicates whether the shape is filled or not.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getter method for the `color` property of the Shape object.
     *
     * @return the current color of the shape.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Setter method for the `color` property of the Shape object.
     *
     * @param newColor - The new color of the shape.
     */
    public void setColor(String newColor) {
        this.color = newColor;
    }

    /**
     * Getter method for the `filled` property of the Shape object.
     *
     * @return A boolean value indicates whether the shape is filled or not.
     */
    public boolean isFilled() {
        return this.filled;
    }

    /**
     * Setter method for the `filled` property of the Shape object.
     *
     * @param filled - A boolean value indicates whether the shape is filled or not.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * A subclass must implement this method.
     *
     * @return the area of the shape.
     */
    public abstract double getArea();

    /**
     * A subclass must implement this method.
     *
     * @return the perimeter of the shape.
     */
    public abstract double getPerimeter();

    /**
     * Dumps a string representation of the shape.
     *
     * @return the string representation.
     */
    public String toString() {
        return String.format("Shape[color=%s,filled=%b", this.color, this.filled);
    }
}
