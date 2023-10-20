public class Cylinder extends Circle {
    private double height;

    /**
     * Initializes a Cylinder with given radius, height and color.
     *
     * @param radius - The radius of the cylinder.
     * @param height - The height of the cylinder.
     * @param color - The color of the cylinder.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Initializes a Cylinder with given radius, height and a default color.
     *
     * @param radius - The radius of the cylinder.
     * @param height - The height of the cylinder.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Initializes a Cylinder with given height, a default radius and a default color.
     *
     * @param height - The height of the cylinder.
     */
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    /**
     * Initializes a Cylinder with a default height, radius and color.
     */
    public Cylinder() {
        this(1);
    }

    /**
     * Getter method for the `height` property of the cylinder.
     *
     * @return the current height of the cylinder.
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Setter method for the `height` property of the cylinder.
     *
     * @param newHeight - The new height of the cylinder.
     */
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    /**
     * Calculates the volume of the cylinder.
     *
     * @return the volume of the cylinder.
     */
    public double getVolume() {
        return super.getArea() * this.height;
    }

    /**
     * Dumps a string representation of the cylinder.
     *
     * @return the string representation.
     */
    public String toString() {
        return String.format("Cylinder[%s,height=%f]", super.toString(), this.height);
    }

    /**
     * Calculates the whole area of the cylinder
     * (sum of areas of all sides of the cylinder).
     *
     * @return the whole area of the cylinder.
     */
    public double getArea() {
        double surroundingArea = (super.getRadius() * 2 * PI) * this.height;

        return surroundingArea + 2 * super.getArea();
    }
}
