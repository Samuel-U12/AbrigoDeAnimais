package model;

public class Adotante extends Pessoa {
    private String endereco;

    public Adotante(String nome, int idade, String telefone, String CPF, String endereco) {
        super(nome, idade, telefone, CPF);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
    
}
