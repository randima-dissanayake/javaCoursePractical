public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.drow();
        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.drow();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.drow();
    }
}
