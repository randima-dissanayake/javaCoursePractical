import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamWriter{
    public void streamWriter(File file, String content){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] contentInBytes = content.getBytes();
            fileOutputStream.write(contentInBytes);
            fileOutputStream.close();
        } catch (IOException e){
            System.out.print("Error");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter file path:");
        Scanner scanner =new Scanner(System.in);
        File file = new File(scanner.nextLine());
        System.out.println("Enter a text:");
        StreamWriter streamWriter = new StreamWriter();
        streamWriter.streamWriter(file, scanner.nextLine());
    }
}