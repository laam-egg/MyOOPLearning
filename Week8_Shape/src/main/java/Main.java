public class Main {
    public static void main(String[] args) {
        Layer ly = new Layer();
        ly.addShape(new Circle(
                new Point(10, 5),
                8.0,
                "RED",
                true
        ));

        ly.addShape(new Rectangle(
                new Point(10, 5),
                8, 6,
                "RED", true
        ));

        ly.addShape(new Circle(
                new Point(10, 5),
                8, "RED", true
        ));

        ly.addShape(new Rectangle(
                new Point(10.5, 5),
                8, 6, "BLUE", true
        ));

        ly.addShape(new Square(
                new Point(10, 5),
                8,
                "RED", true
        ));

        ly.addShape(new Rectangle(
                new Point(10.5, 5.0),
                8, 6,
                "RED", true
        ));

        System.out.println(ly.getInfo());

        ly.removeDuplicates();

        System.out.println(ly.getInfo());
    }
}
