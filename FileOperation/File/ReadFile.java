import java.io.*;
import java.util.Scanner;

public class ReadFile{
    public void readFile(File file){
        String line;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            while( (line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch ( FileNotFoundException e){
            System.out.println("Unable to fine the file path");
        } catch (IOException e){
            System.out.print("Error");
        }
    }
    public static void main(String args[]){

        System.out.println("Enter file path:");
        Scanner scanner =new Scanner(System.in);
        File file = new File(scanner.nextLine());
        ReadFile readFile = new ReadFile();
        readFile.readFile(file);

    }
}