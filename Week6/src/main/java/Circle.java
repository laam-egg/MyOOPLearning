public class Circle {
    private double radius;

    private String color;

    protected static final double PI = Math.PI;

    /**
     * Initializes a Circle with given radius and color.
     *
     * @param radius - The radius of the circle.
     * @param color - The name of the color of the circle.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Initializes a Circle with given radius and a default color.
     * @param radius - The radius of the circle.
     */
    public Circle(double radius) {
        this(radius, "black");
    }

    /**
     * Initializes a Circle with default radius and color.
     */
    public Circle() {
        this(1, "black");
    }

    /**
     * Getter method for the `radius` property.
     *
     * @return the current radius of the circle.
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Setter method for the `radius` property.
     *
     * @param newRadius - The new radius of the circle.
     */
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    /**
     * Getter method for the `color` property.
     *
     * @return the current color of the circle.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Setter method for the `color` property.
     *
     * @param newColor - The new color of the circle.
     */
    public void setColor(String newColor) {
        this.color = newColor;
    }

    /**
     * Calculates the area of this circle.
     *
     * @return the area of this circle.
     */
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    /**
     * Dumps a string representation of the circle.
     *
     * @return the string representation.
     */
    public String toString() {
        return String.format("Circle[radius=%f,color=%s]", this.radius, this.color);
    }
}
