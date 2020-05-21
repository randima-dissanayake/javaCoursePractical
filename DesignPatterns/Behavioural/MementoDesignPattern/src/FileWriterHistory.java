import java.util.Stack;

public class FileWriterHistory {
    Stack<FileWriter.Memento> history = new Stack<>();

    public void save(FileWriter fileWriter){
        history.push(fileWriter.save());
    }

    public void undo(FileWriter fileWriter){
        if (!history.isEmpty())
            fileWriter.undo(history.pop());
        else System.out.println("Cannot undo");
    }
}
