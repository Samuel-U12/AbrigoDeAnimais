package model;

import java.util.List;
import model.animal.Animal;

public class Adotante extends Pessoa {
    private String endereco;
    private List<String> animaisAdotados;

    public Adotante(String nome, int idade, String telefone, String CPF, String endereco) {
        super(nome, idade, telefone, CPF);
        this.endereco = endereco;
        this.animaisAdotados = new java.util.ArrayList<>();
    }

    public void adicionarAnimalAdotado(Animal pet) {
        this.animaisAdotados.add(pet.getId() + " - " + pet.getNome());
    }

    public String getEndereco() {
        return endereco;
    }

    public List<String> getAnimaisAdotados() {
        return animaisAdotados;
    }
}
