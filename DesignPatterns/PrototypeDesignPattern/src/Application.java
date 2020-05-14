public class Application {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Admin admin = (Admin) registry.getUser("ADMIN");
        System.out.println(admin);

        Student student = (Student) registry.getUser("STUDENT");
        student.setName("deshani dissanayake");
        System.out.println(student);
    }
}
