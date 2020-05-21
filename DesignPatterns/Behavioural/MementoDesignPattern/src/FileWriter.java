import java.lang.reflect.Modifier;

public class FileWriter {
    private String fileName;
    private StringBuilder content;

    public FileWriter(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    public void write(String string){
        content.append(string);
    }

    public Memento save(){
        return new Memento(this.fileName,this.content);
    }

    public void undo(Memento memento){
        this.fileName = memento.fileName;
        this.content = memento.content;
    }

    static class Memento{
        private String fileName;
        private StringBuilder content;

        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            this.content = new StringBuilder(content);
        }

    }

    @Override
    public String toString() {
        return "FileWriter{" +
                "fileName='" + fileName + '\'' +
                ", content=" + content +
                '}';
    }
}
