public class CircleShape implements Shape{

    @Override
    public Shape drow() {
        System.out.println("Circle shape created");
        return new CircleShape();
    }
}
