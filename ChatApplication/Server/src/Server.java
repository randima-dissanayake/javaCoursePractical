import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server extends Thread{
    private ArrayList<ServerWorker> workerList = new ArrayList<>();

    private final int port;
    public Server(int port){
        this.port = port;
    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true){
                Socket clientSocket = serverSocket.accept();
                ServerWorker serverWorker = new ServerWorker(this,clientSocket);
                serverWorker.start();
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<ServerWorker> getWorkerList(){
        return workerList;
    }


}
