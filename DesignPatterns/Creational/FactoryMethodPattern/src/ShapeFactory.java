public class ShapeFactory {
    public Shape getShape(String shape){
        switch (shape){
            case "CIRCLE":
                return new CircleShape();
            case "SQUARE":
                return new SquareShape();
            case "RECTANGLE":
                return new RectangleShape();
            default:
                return null;
        }

    }
}
