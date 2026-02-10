import Service.MyHandler;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;


public class Main {
    public static void main(String[] args) {
       try{
           HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
           server.createContext("/", new MyHandler());
           server.setExecutor(null);
           server.start();
           System.out.println("server started on port 8080");

       }catch(IOException e){
           System.out.println("Erreur Le serveur n'est pas demarre"+e);

       }




    }
}