import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Application{
	public static void main(String args[]) throws IOException {
	    System.out.println("Enter file path:");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        LettersToCapital reader = new LettersToCapital(new File(filePath));
            int i;
            while ((i = reader.read()) != -1)
                System.out.print((char) i);
            reader.close();
    }
}