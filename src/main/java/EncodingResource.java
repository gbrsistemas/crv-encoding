import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("test")
public class EncodingResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getResult(){
        throw new WebApplicationException(
                Response.status(Response.Status.BAD_REQUEST).entity("Senha inválida.").build());
    }
}
