import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private final String serverName;
    private final int port;
    private OutputStream serverOut;
    private InputStream serverIn;
    private BufferedReader bufferedIn;

    public Client(String serverName, int port) {
        this.serverName = serverName;
        this.port = port;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("enter command : ");
        Scanner scanner = new Scanner(System.in);
        String connectionDetails = scanner.nextLine();
        Client client=new Client("localhost", 8818);
        if (!client.connect()){
            System.err.println("Connect failed");
        } else {
            if (client.login(connectionDetails)){
                System.out.println("Connected successful");
            } else {
                System.err.println("Connect fails");
            }
        }
    }

    private boolean login(String connectionDetails) throws IOException {
        System.out.println("iiiiiiiiii");
        serverOut.write(connectionDetails.getBytes());
        String response=bufferedIn.readLine();
        System.out.println("response " + response);
        if ("login".equalsIgnoreCase(response)){
            System.out.println("aaaaaaaaa");
            return true;
        } else {
            return false;
        }
    }

    private boolean connect() {
        try {
            Socket socket=new Socket(serverName,port);
            this.serverOut=socket.getOutputStream();
            this.serverIn=socket.getInputStream();
            this.bufferedIn = new BufferedReader(new InputStreamReader(serverIn));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
