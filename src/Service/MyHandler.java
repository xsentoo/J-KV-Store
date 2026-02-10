package Service;

import Entity.Tache;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class MyHandler implements HttpHandler {
    TacheServcice service = new TacheServcice();

    public void handle(HttpExchange exchange) throws IOException {
        Tache tache = new Tache("Fix bug" , "Senthooran" , "thayaparan" , "27/07/2027");
        String json = service.TacheToJson(tache);
        exchange.getResponseHeaders().set("Content-Type", "application/json");
        exchange.sendResponseHeaders(200, json.getBytes(StandardCharsets.UTF_8).length);

        OutputStream os = exchange.getResponseBody();
        os.write(json.getBytes(StandardCharsets.UTF_8));
        os.close();
    }
}
