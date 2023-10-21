public class Triangle implements GeometricObject {
    private final Point p1;

    private final Point p2;

    private final Point p3;

    /**
     * Constructs a new Triangle with given points.
     *
     * @param p1 - The first point.
     * @param p2 - The second point.
     * @param p3 - The third point.
     */
    public Triangle(Point p1, Point p2, Point p3)
    throws RuntimeException {
        double d1 = p1.distance(p2);
        double d2 = p2.distance(p3);
        double d3 = p3.distance(p1);
        if (d1 > 0 && d2 > 0 && d3 > 0) {
            if (d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1) {
                this.p1 = p1;
                this.p2 = p2;
                this.p3 = p3;
                return;
            }
        }
        throw new RuntimeException("Invalid points");
    }

    /**
     * Use this function to retrieve the first point.
     *
     * @return the first point.
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Use this function to retrieve the second point.
     *
     * @return the second point.
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Use this function to retrieve the third point.
     *
     * @return the third point.
     */
    public Point getP3() {
        return p3;
    }

    /**
     * Calculates the area of this triangle.
     *
     * @return the calculated area.
     */
    @Override
    public double getArea() {
        double p1x = p1.getPointX();
        double p1y = p1.getPointY();
        double p2x = p2.getPointX();
        double p2y = p2.getPointY();
        double p3x = p3.getPointX();
        double p3y = p3.getPointY();

        return Math.abs(
                p1x * (p2y - p3y)
                + p2x * (p3y - p1y)
                + p3x * (p1y - p2y)
        ) / 2;
    }

    /**
     * Calculates the perimeter of this triangle.
     *
     * @return the calculated perimeter.
     */
    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * Dumps a string representation of this Triangle object.
     *
     * @return the string representation.
     */
    @Override
    public String getInfo() {
        return String.format("Triangle[%s,%s,%s]",
                this.p1.formatCoordinates(),
                this.p2.formatCoordinates(),
                this.p3.formatCoordinates()
        );
    }
}
