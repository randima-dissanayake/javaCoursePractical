import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private final String serverName;
    private final int port;
    private OutputStream serverOut;
    private InputStream serverIn;
    private BufferedReader bufferedIn;
//    private ArrayList<UserStatusListner> userStatusListners=new ArrayList<>();

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
            boolean u = client.login(connectionDetails);
            System.out.println("oioooi"+u);
            if (u){
                System.out.println("Connected successful");
            } else {
                System.err.println("Connect fails");
            }
        }
    }

    private boolean login(String connectionDetails) throws IOException {
        System.out.println("iiiiiiiiii");
        String msg = "connect as randima" ;
        serverOut.write(msg.getBytes());
        String response=new BufferedReader(new InputStreamReader(serverIn)).readLine();
        System.out.println("response " + response);
        if ("login".equalsIgnoreCase(response)){
            System.out.println("aaaaaaaaa");
            startMsgReader();
            return true;
        } else {
            return false;
        }
    }

    private void startMsgReader() {
        Thread thread=new Thread(){
            @Override
            public void run(){
                readMsgLoop();
            }
        };
        thread.start();
    }

    private void readMsgLoop(){
        try {
            String line;
            while ((line=bufferedIn.readLine())!=null){
                String[] token = line.split(" ");
                if (token !=null && token.length>0) {
                    String cmd = token[0];
                }
            }
        } catch (Exception e){
            e.printStackTrace();
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
