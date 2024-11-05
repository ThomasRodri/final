
package challenge2.test;

import challenge2.model.Cliente;
import challenge2.dao.ClienteDAO;

import java.util.regex.Pattern;

public class ClienteDAOTest {

    public static void main(String[] args) {
        // Instancia o DAO para realizar as operações no banco de dados
        ClienteDAO clienteDAO = new ClienteDAO();

        // Cria e insere um novo cliente no banco de dados, passando o CPF como padrão regex
        Cliente cliente = new Cliente("Pedro", Pattern.compile("[0-9]{11}"), Pattern.compile("[0-9]{9}"), 30, Pattern.compile("[0-9]{10}"), "Rua das Flores");
        clienteDAO.insertCliente(cliente);
        System.out.println("Cliente inserido com sucesso!");

        // Recupera e exibe todos os clientes do banco de dados
        for (Cliente c : clienteDAO.getAllClientes()) {
            System.out.println(c.getNome() + " - " + c.getCpf().pattern() + " - " + c.getRg().pattern() + " - " + c.getIdade() + " - " + c.getNumeroDeContato().pattern() + " - " + c.getInfoEnderecoCliente());
        }

        // Atualiza as informações de um cliente
        cliente.setInfoEnderecoCliente("Avenida Brasil");
        clienteDAO.updateCliente(cliente);
        System.out.println("Cliente atualizado com sucesso!");

        // Deleta o cliente do banco de dados pelo CPF (usando pattern regex)
        clienteDAO.deleteCliente(cliente.getCpf());
        System.out.println("Cliente deletado com sucesso!");
    }
}
