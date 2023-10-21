import java.util.List;

public class ShapeUtil {
    /**
     * Dumps a string contains detailed information of all shapes
     * in the given list.
     *
     * @param shapes - A list of shapes whose information is to be
     *               retrieved.
     * @return the information string.
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder s = new StringBuilder("Circle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                s.append(shape.getInfo());
                s.append("\n");
            }
        }
        s.append("Triangle:");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                s.append("\n");
                s.append(shape.getInfo());
            }
        }
        return s.toString();
    }
}
