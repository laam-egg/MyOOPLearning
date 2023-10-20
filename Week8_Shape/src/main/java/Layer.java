import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Layer {
    private final List<Shape> shapes;

    /**
     * Constructs a new Layer.
     */
    public Layer() {
        shapes = new ArrayList<Shape>();
    }

    /**
     * Adds a shape to the layer.
     *
     * @param shape - A Shape object to be added.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Reports information of the shapes currently
     * present in this layer. Shapes added first are
     * displayed first.
     *
     * @return the information, as a string.
     */
    public String getInfo() {
        StringBuilder infoBuilder = new StringBuilder(
                "Layer of crazy shapes:\n"
        );

        for (Shape shape : this.shapes) {
            infoBuilder.append(shape.toString()).append("\n");
        }

        return infoBuilder.toString();
    }

    /**
     * Removes all circles in the layer.
     */
    public void removeCircles() {
        this.shapes.removeIf((Shape shape) -> shape instanceof Circle);
    }

    /**
     * Removes shapes in the layer that are duplicates.
     * Keeps the original ones.
     */
    public void removeDuplicates() {
        HashSet<Shape> hs = new HashSet<Shape>(this.shapes);
        this.shapes.removeIf((Shape shape) -> {
            if (hs.contains(shape)) {
                hs.remove(shape);
                return false;
            }
            return true;
        });
    }
}
