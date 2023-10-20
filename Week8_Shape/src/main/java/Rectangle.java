public class Rectangle extends Shape {
    protected double width;

    protected double length;

    protected Point topLeft;

    /**
     * Constructs a new Rectangle with default properties.
     */
    public Rectangle() {
        super();
        this.width = this.length = 1;
    }

    /**
     * Constructs a new Rectangle with given width and length.
     *
     * @param width - The width of the Rectangle.
     * @param length - The length of the Rectangle.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructs a new Rectangle with given properties.
     *
     * @param width - The width of the Rectangle.
     * @param length - The length of the Rectangle.
     * @param color - The color of the Rectangle.
     * @param filled - Whether the Rectangle is filled or not.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Constructs a new Rectangle with given properties.
     *
     * @param topLeft - The top-left point of the Rectangle.
     * @param width - The width of the Rectangle.
     * @param length - The length of the Rectangle.
     * @param color - The color of the Rectangle.
     * @param filled - Whether the Rectangle is filled or not.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    /**
     * Getter method for the `width` property of the rectangle.
     *
     * @return the width of the rectangle.
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Setter nethod for the `width` property of the rectangle.
     *
     * @param newWidth - The new width of the rectangle.
     */
    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    /**
     * Getter method for the `length` property of the rectangle.
     *
     * @return the length of the rectangle.
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Setter nethod for the `length` property of the rectangle.
     *
     * @param newLength - The new length of the rectangle.
     */
    public void setLength(double newLength) {
        this.length = newLength;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return the area of the rectangle.
     */
    @Override
    public double getArea() {
        return this.width * this.length;
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle.
     */
    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    /**
     * Getter method for the topLeft property of the rectangle.
     *
     * @return the top-left point of the rectangle.
     */
    public Point getTopLeft() {
        return this.topLeft;
    }

    /**
     * Setter method for the topLeft property of the rectangle.
     *
     * @param topLeft - The new top-left point of the rectangle.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Dumps a string representation of the Rectangle object.
     *
     * @return the string representation.
     */
    @Override
    public String toString() {
        return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%b]",
                this.topLeft.toString(),
                this.width,
                this.length,
                this.getColor(),
                this.isFilled()
        );
    }

    /**
     * Detects equality.
     *
     * @param obj - Another Object.
     * @return whether this Rectangle instance equals the given Object.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return (
                    this.topLeft.equals(other.topLeft)
                    && (this.width - other.width < 0.001)
                    && (this.length - other.length < 0.001)
            );
        }
        return false;
    }

    /**
     * Generates hash code for this Rectangle object.
     *
     * @return the generated hash code.
     */
    public int hashCode() {
        return (topLeft.hashCode() + (int) (this.width * 17 + this.length * 19)) % 67;
    }
}
