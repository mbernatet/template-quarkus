package net.atos.labbordeaux;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Path("/hello")
public class GreetingResource {

    private static DateFormat format = SimpleDateFormat.getInstance();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println(format.format(new Date()));
        // throw new RuntimeException("msldkfmsdfl");
        return "Hello from RESTEasy Reactive";
    }
}