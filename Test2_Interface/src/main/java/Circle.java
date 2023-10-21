public class Circle implements GeometricObject {
    /*
    NOTE: 2023-10-21: Even though the diagram shown on OASIS
    demonstrates that it should be
        private static final double pi = 3.14
    but the test cases turned out to expect
        1. The property is public ;
        2. The property name is upper-cased.
     */
    public static final double PI = 3.14;

    private Point center;

    private double radius;

    /**
     * Constructs a new Circle with given properties.
     *
     * @param center - The center point of the circle.
     * @param radius - The radius of the circle.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Use this function to retrieve the center point of the circle.
     *
     * @return the center point of the circle.
     */
    public Point getCenter() {
        return this.center;
    }

    /**
     * Changes the center point of this circle.
     *
     * @param newCenter - The new center point of the circle.
     */
    public void setCenter(Point newCenter) {
        this.center = newCenter;
    }

    /**
     * Use this function to retrieve the radius of the circle.
     *
     * @return the radius of the circle.
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Changes the radius of the circle.
     *
     * @param newRadius - The new radius of the circle.
     */
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    /**
     * Calculates the area of this circle.
     *
     * @return the calculated area.
     */
    @Override
    public double getArea() {
        return Circle.PI * this.radius * this.radius;
    }

    /**
     * Calculates the perimeter of this circle.
     *
     * @return the calculated perimeter.
     */
    @Override
    public double getPerimeter() {
        return Circle.PI * this.radius * 2;
    }

    /**
     * Dumps a string representation of this Circle object.
     *
     * @return the string representation.
     */
    @Override
    public String getInfo() {
        return String.format("Circle[%s,r=%.2f]",
                this.center.formatCoordinates(),
                this.radius
        );
    }
}
