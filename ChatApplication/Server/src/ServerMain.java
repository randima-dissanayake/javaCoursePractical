import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

    public static void main(String[] args){

        int port = 8818;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true){
                System.out.println("hhhhhhhhhhhhhh");
                Socket clientSocket = serverSocket.accept();
                ServerWorker serverWorker = new ServerWorker(clientSocket);
                serverWorker.start();
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}
