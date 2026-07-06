package model.animal;

import java.util.ArrayList;
import java.util.List;

public class FichaMedica {
    private List<String> vacinas;
    private String observacoes;

    public FichaMedica() {
        this.vacinas = new ArrayList<>(); // Começa com uma lista vazia
        this.observacoes = "Nenhuma observação inicial.";
    }

    public void adicionarVacina(String vacina) {
        this.vacinas.add(vacina);
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    public String getFicha() {
        return "Vacinas: " + vacinas.toString() + " | Obs: " + observacoes;
    }
}