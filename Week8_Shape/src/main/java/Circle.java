public class Circle extends Shape {
    protected double radius;

    protected Point center;

    public static final double PI = Math.PI;

    /**
     * Constructs a Circle with default properties.
     */
    public Circle() {
        super();
        this.radius = 1;
    }

    /**
     * Constructs a Circle with given radius.
     *
     * @param radius - The radius of the circle.
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Constructs a Circle with given properties.
     *
     * @param radius - The radius of the circle.
     * @param color - The color of the circle.
     * @param filled - Whether the circle is filled.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Constructs a Circle with given properties.
     *
     * @param center - The center point of the circle.
     * @param radius - The radius of the circle.
     * @param color - The color of the circle.
     * @param filled - Whether the circle is filled.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    /**
     * Getter method for the `radius` property of the Circle object.
     *
     * @return the current radius of the circle.
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Setter method for the `radius` property of the Circle object.
     *
     * @param newRadius - The new radius of the circle.
     */
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    /**
     * Calculates the area of the circle.
     *
     * @return the area of the circle.
     */
    @Override
    public double getArea() {
        return Circle.PI * this.radius * this.radius;
    }

    /**
     * Calclates the perimeter of the circle.
     *
     * @return the perimeter of the circle.
     */
    @Override
    public double getPerimeter() {
        return Circle.PI * this.radius * 2;
    }

    /**
     * Dumps a string representation of the Circle object.
     *
     * @return the string representation.
     */
    @Override
    public String toString() {
        return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%b]",
                this.center.toString(),
                this.radius,
                this.getColor(),
                this.isFilled()
        );
    }

    /**
     * Getter method for the center property of the Circle object.
     *
     * @return the current center point of the circle.
     */
    public Point getCenter() {
        return this.center;
    }

    /**
     * Setter method for the center property of the Circle object.
     *
     * @param newCenter - the new center point of the circle.
     */
    public void setCenter(Point newCenter) {
        this.center = newCenter;
    }

    /**
     * Detects equality.
     *
     * @param obj - Another Object.
     * @return whether this Circle instance equals the given Object.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return (
                    this.center.equals(other.center)
                    && (this.radius - other.radius < 0.001)
            );
        }
        return false;
    }

    /**
     * Generates hash code for this Circle object.
     *
     * @return the generated hash code.
     */
    public int hashCode() {
        return (this.center.hashCode() + (int) (radius * 11)) % 61;
    }
}
