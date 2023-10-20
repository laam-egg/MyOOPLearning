public class Point {
    /**
     * Calculates the square of a real number.
     *
     * @param d - The number.
     * @return its square.
     */
    public static double square(double d) {
        return d * d;
    }

    private double pointX;

    private double pointY;

    /**
     * Constructs a new Point with given coordinates.
     *
     * @param pointX - The x position.
     * @param pointY - The y position.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Getter method for the x position of the Point.
     *
     * @return the current x position of the Point.
     */
    public double getPointX() {
        return this.pointX;
    }

    /**
     * Setter method for the x position of the Point.
     *
     * @param pointX - the new x position of the Point.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Getter method for the y position of the Point.
     *
     * @return the current y position of the Point.
     */
    public double getPointY() {
        return this.pointY;
    }

    /**
     * Setter method for the y position of the Point.
     *
     * @param pointY - the new y position of the Point.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Calculates the distance between this point and another specified point.
     *
     * @param other - The another point.
     * @return the distance between the two.
     */
    public double distance(Point other) {
        return Math.sqrt(
                Point.square(this.pointX - other.pointX)
                        + Point.square(this.pointY - other.pointY)
        );
    }

    /**
     * Dumps a string representation of this Point object.
     *
     * @return the string representation.
     */
    public String toString() {
        return String.format("(%.1f,%.1f)", this.pointX, this.pointY);
    }

    /**
     * Detects equality.
     *
     * @param obj - Another Object.
     * @return whether this Circle instance equals the given Object.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return (
                    (this.pointX - other.pointX < 0.001)
                    && (this.pointY - other.pointY < 0.001)
            );
        }
        return false;
    }

    /**
     * Generates hash code for this Point object.
     *
     * @return the generated hash code.
     */
    public int hashCode() {
        return (int) ((this.pointX + this.pointY) * 13) % 59;
    }
}
