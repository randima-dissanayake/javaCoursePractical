import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter command:");

        Scanner scanner=new Scanner(System.in);
        String line = scanner.nextLine();

        String[] tokens= line.split(" ");

        if ("connect".equalsIgnoreCase(tokens[0])){
            String name = line.substring(line.indexOf("as ")+1);
            URL url=new URL("http://localhost:8000/register?name="+name);
            HttpURLConnection connection=(HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line1;
            while ((line1=reader.readLine())!=null){
                System.out.println(line1);
            }

            reader.close();
        }




    }
}
