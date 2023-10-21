public interface GeometricObject {
    /**
     * Classes that implement this interface must
     * define this method to calculate the
     * appropriate shape's area.
     *
     * @return the calculated area.
     */
    public double getArea();

    /**
     * Classes that implement this interface must
     * define this method to calculate the
     * appropriate shape's perimeter.
     *
     * @return the calculated perimeter.
     */
    public double getPerimeter();

    /**
     * Classes that implement this interface must
     * define this method to dump a string
     * representation of the appropriate shape.
     *
     * @return the string representation.
     */
    public String getInfo();
}
