import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import javax.swing.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    public static ConcurrentHashMap<String,String> userList=new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException {
        HttpServer httpServer=HttpServer.create(new InetSocketAddress(8000),0);
        HttpContext register=httpServer.createContext("/register");
        register.setHandler(httpExchange -> register(httpExchange));

        HttpContext list=httpServer.createContext("/list");
        list.setHandler(httpExchange -> list(httpExchange));

        httpServer.start();
    }

    private static void list(HttpExchange httpExchange) throws IOException {
        String response = "User list" + userList;

        httpExchange.sendResponseHeaders(200,response.getBytes().length);
        OutputStream outputStream= httpExchange.getResponseBody();
        outputStream.write(response.getBytes());
        outputStream.close();

    }

    private static void register(HttpExchange httpExchange) throws IOException {
        URI registeredURI=httpExchange.getRequestURI();
        String query=registeredURI.getRawQuery();
        String clientName = query.substring(query.indexOf("=") +1 ,query.length());
        String response= "registered successfully";
        userList.put(clientName,"Default message");

        httpExchange.sendResponseHeaders(200,response.getBytes().length);
        OutputStream outputStream= httpExchange.getResponseBody();
        outputStream.write(response.getBytes());
        outputStream.close();

    }


}
