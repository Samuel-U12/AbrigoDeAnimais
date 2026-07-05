package model;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String telefone;
    private String CPF;

    public Pessoa(String nome, int idade, String telefone, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCPF() {
        return CPF;
    }
}
