import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StreamReader{
    public void streamReader(File file){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int content;
            while ((content = fileInputStream.read())!=-1){
                System.out.print((char) content);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e){
            System.out.print("File not found");
        } catch (IOException e){
            System.out.print("Error");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter file path:");
        Scanner scanner =new Scanner(System.in);
        File file = new File(scanner.nextLine());
        StreamReader streamReader = new StreamReader();
        streamReader.streamReader(file);
    }
}