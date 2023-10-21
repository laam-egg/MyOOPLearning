public class Point {
    private double pointX;

    private double pointY;

    /**
     * Constructs a new Point with given coordinates.
     *
     * @param x - The x coordinate of the point.
     * @param y - The y coordinate of the point.
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    /**
     * Use this function to retrieve the x coordinate of the point.
     *
     * @return the x coordinate of the point.
     */
    public double getPointX() {
        return this.pointX;
    }

    /**
     * Changes the x coordinate of the point.
     *
     * @param x - The new x coordinate.
     */
    public void setPointX(double x) {
        this.pointX = x;
    }

    /**
     * Use this function to retrieve the y coordinate of the point.
     *
     * @return the y coordinate of the point.
     */
    public double getPointY() {
        return this.pointY;
    }

    /**
     * Changes the y coordinate of the point.
     *
     * @param y - The new y coordinate.
     */
    public void setPointY(double y) {
        this.pointY = y;
    }

    /**
     * Calculates the distance between this point and another point.
     *
     * @param other - The another point.
     * @return the distance between the two.
     */
    public double distance(Point other) {
        return Math.sqrt(
                Point.sqr(this.pointX - other.pointX)
                + Point.sqr(this.pointY - other.pointY)
        );
    }

    /**
     * Squares a double number.
     *
     * @param x - the double number to be squared.
     * @return the squared number.
     */
    public static double sqr(double x) {
        return x * x;
    }

    /**
     * Returns coordinates of the point as a string of this format:
     * "(x, y)".
     * NOTE: 2023-10-21: This method is not required by OASIS, but
     * aims to aid Circle.getInfo() and Triangle.getInfo().
     * @return the coordinate-string.
     */
    public String formatCoordinates() {
        return String.format("(%.2f,%.2f)", this.pointX, this.pointY);
    }
}
