
package challenge2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import challenge2.model.Cliente;

public class ClienteDAO {
    // Definindo as credenciais do banco de dados
    private String jdbcURL = "jdbc:mysql://localhost:3306/porto_challenge_db";
    private String jdbcEmail = "user";  // Atualize com o nome de usuário correto
    private String jdbcPassword = "password";  // Atualize com a senha correta

    // Variável de conexão com o banco de dados
    private Connection connection;

    // Construtor que realiza a conexão com o banco de dados
    public ClienteDAO() {
        try {
            connection = DriverManager.getConnection(jdbcURL, jdbcEmail, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace(); // Mostra o erro de conexão, se houver
        }
    }

    // Método para inserir um novo cliente no banco de dados
    public void insertCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, cpf, rg, idade, numeroDeContato, endereco) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            // Definindo os valores nos parâmetros da consulta SQL
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpf().pattern());  // Usa o pattern regex do CPF
            statement.setString(3, cliente.getRg().pattern());   // Usa o pattern regex do RG
            statement.setInt(4, cliente.getIdade());
            statement.setString(5, cliente.getNumeroDeContato().pattern());  // Usa o pattern regex do telefone
            statement.setString(6, cliente.getInfoEnderecoCliente());
            statement.executeUpdate(); // Executa a inserção
        } catch (SQLException e) {
            e.printStackTrace(); // Mostra o erro de inserção, se houver
        }
    }

    // Método para recuperar todos os clientes do banco de dados
    public List<Cliente> getAllClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery(); // Executa a consulta

            // Itera sobre o resultado da consulta e cria objetos Cliente
            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setNome(resultSet.getString("nome"));
                cliente.setCpf(Pattern.compile(resultSet.getString("cpf")));  // Converte o CPF para pattern regex
                cliente.setRg(Pattern.compile(resultSet.getString("rg")));    // Converte o RG para pattern regex
                cliente.setIdade(resultSet.getInt("idade"));
                cliente.setNumeroDeContato(Pattern.compile(resultSet.getString("numeroDeContato"))); // Converte telefone
                cliente.setInfoEnderecoCliente(resultSet.getString("endereco"));
                clientes.add(cliente); // Adiciona o cliente à lista
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Mostra o erro de consulta, se houver
        }
        return clientes; // Retorna a lista de clientes
    }

    // Método para atualizar as informações de um cliente no banco de dados
    public void updateCliente(Cliente cliente) {
        String sql = "UPDATE clientes SET nome = ?, rg = ?, idade = ?, numeroDeContato = ?, endereco = ? WHERE cpf = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            // Define os novos valores nos parâmetros da consulta
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getRg().pattern());   // Usa o pattern regex do RG
            statement.setInt(3, cliente.getIdade());
            statement.setString(4, cliente.getNumeroDeContato().pattern()); // Usa o pattern regex do telefone
            statement.setString(5, cliente.getInfoEnderecoCliente());
            statement.setString(6, cliente.getCpf().pattern());  // Usa o pattern regex do CPF
            statement.executeUpdate(); // Executa a atualização
        } catch (SQLException e) {
            e.printStackTrace(); // Mostra o erro de atualização, se houver
        }
    }

    // Método para deletar um cliente do banco de dados pelo CPF
    public void deleteCliente(Pattern cpf) {
        String sql = "DELETE FROM clientes WHERE cpf = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            // Define o CPF do cliente a ser deletado
            statement.setString(1, cpf.pattern());  // Usa o pattern regex do CPF
            statement.executeUpdate(); // Executa a exclusão
        } catch (SQLException e) {
            e.printStackTrace(); // Mostra o erro de exclusão, se houver
        }
    }
}
