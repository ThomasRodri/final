
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;
import javax.ws.rs.core.Response.Status;

@Path("/clientes")
public class ClienteController {
    private ClienteService clienteService = new ClienteService();

    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response adicionarCliente(Cliente cliente) {
        try {
            clienteService.adicionarCliente(cliente);
            return Response.status(Status.CREATED).entity("Cliente registrado com sucesso!").build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Erro ao registrar cliente.").build();
        }
    }

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginCliente(Map<String, String> credentials) {
        try {
            boolean isAuthenticated = clienteService.authenticate(credentials.get("email"), credentials.get("senha"));
            if (isAuthenticated) {
                return Response.ok("Login bem-sucedido!").build();
            } else {
                return Response.status(Status.UNAUTHORIZED).entity("Credenciais inválidas.").build();
            }
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Erro ao processar login.").build();
        }
    }

    @OPTIONS
    @Path("{path:.*}")
    public Response handleCORS() {
        return Response.ok().header("Access-Control-Allow-Origin", "*")
                             .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS")
                             .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                             .header("Access-Control-Allow-Credentials", "true")
                             .build();
    }
}
