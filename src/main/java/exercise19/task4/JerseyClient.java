package exercise19.task4;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation.Builder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class JerseyClient
{
    public static void main(String[] args)
    {
        JerseyClient client = new JerseyClient();
        client.request();
        client.requestChain();
    }

    public void request()
    {
        Client newClient = ClientBuilder.newClient();
        WebTarget target = newClient.target("https://jsonplaceholder.typicode.com");
        target = target.path("posts/1");
        Builder builder = target.request(MediaType.APPLICATION_JSON);
        Response response = builder.get();
        String s = response.readEntity(String.class);
        System.out.println(s);
    }

    public void requestChain()
    {
        Response response = ClientBuilder
                .newClient()
                .target("https://jsonplaceholder.typicode.com")
                .path("posts/1")
                .request(MediaType.APPLICATION_JSON)
                .get();
        String s = response.readEntity(String.class);
        System.out.println(s);
    }
}