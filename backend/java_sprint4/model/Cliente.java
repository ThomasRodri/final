
package challenge2.model;

import java.util.regex.Pattern;

public class Cliente {

    private String nome;
    private Pattern cpf;
    private Pattern rg;
    private int idade;
    private Pattern numeroDeContato;
    private String infoEnderecoCliente;

    // Construtor padrão
    public Cliente() {
    }

    // Construtor com parâmetros
    public Cliente(String nome, Pattern cpf, Pattern rg, int idade, Pattern numeroDeContato, String infoEnderecoCliente) {
        this.nome = nome;
        setCpf(cpf);
        setRg(rg);
        setIdade(idade);
        setNumeroDeContato(numeroDeContato);
        this.infoEnderecoCliente = infoEnderecoCliente;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pattern getCpf() {
        return cpf;
    }

    public void setCpf(Pattern cpf) {
        this.cpf = cpf;
    }

    public Pattern getRg() {
        return rg;
    }

    public void setRg(Pattern rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        try {
            if (idade >= 18 && idade <= 100) {
                this.idade = idade;
            } else {
                throw new IllegalArgumentException("Idade inválida. Deve estar entre 18 e 100 anos.");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public Pattern getNumeroDeContato() {
        return numeroDeContato;
    }

    public void setNumeroDeContato(Pattern numeroDeContato) {
        this.numeroDeContato = numeroDeContato;
    }

    public String getInfoEnderecoCliente() {
        return infoEnderecoCliente;
    }

    public void setInfoEnderecoCliente(String infoEnderecoCliente) {
        this.infoEnderecoCliente = infoEnderecoCliente;
    }
}
