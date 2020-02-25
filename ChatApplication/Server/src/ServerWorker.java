
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;


public class ServerWorker extends Thread {
    private Socket clientSocket;
    private OutputStream outputStream;
    private String userName;
    private ArrayList<ServerWorker> workers;

    public ServerWorker(Socket clientSocket){
        this.clientSocket=clientSocket;
    }

    @Override
    public void run(){
        try {
            System.out.println("klklklk");
            handleClientSocket();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleClientSocket() throws IOException{
        System.out.println("tytytytyt");
        InputStream inputStream = clientSocket.getInputStream();
        System.out.println("t" + inputStream);
        this.outputStream = clientSocket.getOutputStream();
        System.out.println("eee" + this.outputStream.toString());
        InputStreamReader reader = new InputStreamReader(inputStream);

//        DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
//        DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());

//        System.out.println("t" + inputStream.toString());


        String line = new BufferedReader(reader).readLine();
        System.out.println("jhjhjhjhjh" + line);
        while ((line)!=null){
//            line = "connect as randima";
            String[] token = line.split(" ");
            if (token !=null && token.length>0){
                String cmd = token[0];
                System.out.println("wwqwqww" + cmd);
                if ("quit".equalsIgnoreCase(cmd)){
                    handleLogout();
                    break;
                } else if("connect".equalsIgnoreCase(cmd)){
                    System.out.println("inside connect ");
//                    outputStream.write(token[2].getBytes());
                    handleLogin(token);
//                    outputStream.write("connect".getBytes());
                } else if ("send".equalsIgnoreCase(cmd)){
                    handleMessages(token);
//                    outputStream.write("send".getBytes());
                } else {
                    String msg = "unknown command " + cmd +"\n";
                    outputStream.write(msg.getBytes());
                }
            }


        }
        clientSocket.close();
    }

    private void handleMessages(String[] token) throws IOException {
        String sentTo = token[3];
        String body= token[2];

        for (ServerWorker worker:workers){
            if (sentTo.equalsIgnoreCase(worker.getLogin())){
                String msg= "msg " + userName+ " " + body + "\n";
                worker.send(msg);
            }
        }
    }

    private void send(String msg) throws IOException {
        if (userName !=null){
            outputStream.write(msg.getBytes());
        }
    }

    private String getLogin() {
        return this.userName;
    }

    private void handleLogout() throws IOException {
//        List<ServerWorker> workerList=server.getWorkerList();
        clientSocket.close();
    }

    //connect as username
    private void handleLogin(String[] token) {
//        InputStream inputStream = clientSocket.getInputStream();
//        BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
//        System.out.println("ioioioioi" + reader.readLine());
        if (token.length == 3){
//            String serverCredentials = token[1];
            String userName = token[2];
            System.out.println(userName + "username");
            try {
                outputStream.write("login".getBytes());
                this.userName=userName;
            } catch (IOException e) {
                e.printStackTrace();
            }
//            this.workers=server.getWorkerList();
//            for (ServerWorker worker : workers){
//                System.out.println("kkkk"+worker.getLogin());
//            }

        }
    }

    public void removeWorker(ServerWorker serverWorker){
        workers.remove(serverWorker);
    }
}
