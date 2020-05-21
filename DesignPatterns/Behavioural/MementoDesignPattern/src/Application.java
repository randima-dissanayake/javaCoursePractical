public class Application {
    public static void main(String[] args) {
        FileWriterHistory history = new FileWriterHistory();
        FileWriter fileWriter = new FileWriter("file.txt");
        fileWriter.write("First Line");
        System.out.println(fileWriter);

        history.save(fileWriter);

        fileWriter.write("Second Line");

        history.save(fileWriter);

        System.out.println(fileWriter);

        history.undo(fileWriter);

        System.out.println(fileWriter);

        history.undo(fileWriter);

        System.out.println(fileWriter);

    }
}
