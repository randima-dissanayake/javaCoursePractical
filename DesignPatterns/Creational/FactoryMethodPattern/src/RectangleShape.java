public class RectangleShape implements Shape{
    @Override
    public Shape drow() {
        System.out.println("Rectangle shape created");
        return new RectangleShape();
    }
}
