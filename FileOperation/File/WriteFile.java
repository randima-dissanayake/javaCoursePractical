import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile{
    public void writeFile(File file, String body){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(body);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e){
            System.out.print("Error");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter file path:");
        Scanner scanner =new Scanner(System.in);
        File file = new File(scanner.nextLine());
        System.out.println("Enter a text:");
        WriteFile writeFile = new WriteFile();
        writeFile.writeFile(file, scanner.nextLine());
    }
}