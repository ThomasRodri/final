
public class ClienteService {
    private ClienteDAO clienteDAO;

    public ClienteService() {
        this.clienteDAO = new ClienteDAOImpl();
    }

    public void adicionarCliente(Cliente cliente) throws Exception {
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new Exception("Nome do cliente é obrigatório.");
        }
        clienteDAO.adicionarCliente(cliente);
    }

    public boolean register(Cliente cliente) throws Exception {
        if (cliente.getEmail() == null || cliente.getPassword() == null || 
            cliente.getEmail().isEmpty() || cliente.getPassword().isEmpty()) {
            throw new Exception("Email and password are required for registration.");
        }
        // Attempt to add the client; return false if email/CPF exists
        return clienteDAO.adicionarCliente(cliente);
    }

    public boolean login(String email, String password) {
        Cliente cliente = clienteDAO.buscarClientePorEmail(email);
        return cliente != null && cliente.getPassword().equals(password);
    }

    public Cliente buscarClientePorId(int id) {
        return clienteDAO.buscarClientePorId(id);
    }

    public List<Cliente> listarClientes() {
        return clienteDAO.listarClientes();
    }

    public void atualizarCliente(Cliente cliente) throws Exception {
        if (cliente.getId() <= 0) {
            throw new Exception("ID do cliente inválido.");
        }
        clienteDAO.atualizarCliente(cliente);
    }

    public void deletarCliente(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("ID do cliente inválido.");
        }
        clienteDAO.excluirCliente(id);
    }
}
