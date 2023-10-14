import jakarta.xml.ws.Endpoint;
import webservice.BanqueService;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:3000/",new BanqueService());
        System.out.println("Web service deployé sur l'adresse 0.0.0.0");
    }
}
