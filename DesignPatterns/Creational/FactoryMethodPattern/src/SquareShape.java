public class SquareShape implements Shape{
    @Override
    public Shape drow() {
        System.out.println("Square shape created");
        return new SquareShape();
    }
}
