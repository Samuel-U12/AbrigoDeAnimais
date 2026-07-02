package Model.Animais;

import Model.Custavel;

public class Cachorro extends Animal implements Custavel {
    private double precoKgRacao;
    private double gastosVeterinarios;
    private String porte;

    public Cachorro(String nome, int idade, String raca, double peso, double gastosVeterinarios, double precoKgRacao) {
        super(nome, idade, raca, peso);
        this.gastosVeterinarios = gastosVeterinarios;
        this.precoKgRacao = precoKgRacao;

        if(getPeso() < 5.0) {
            this.porte = "Mini";
        } else if(getPeso() < 10.0) {
            this.porte = "Pequeno";
        } else if (getPeso() < 25.0) {
            this.porte = "Médio";
        } else if (getPeso() < 45.0) {
            this.porte = "Grande";
        }
        else {
            this.porte = "Gigante";
        }
    }

    public String getPorte() {
        return porte;
    }

    public double getGastosVeterinarios() {
        return gastosVeterinarios;
    }

    public double getPrecoKgRacao() {
        return precoKgRacao;
    }

    public double porcentagemRacaoDiaria(String porte) {
        return switch (porte) {
            case "Mini" -> 0.04;
            case "Pequeno" -> 0.03;
            case "Médio" -> 0.02;
            case "Grande" -> 0.015;
            case "Gigante" -> 0.01;
            default -> 0.0;
        };
    }

    @Override
    public double calcularRacaoDiaria() {
        double porcentagemRacaoDiaria = porcentagemRacaoDiaria(getPorte());
        if (porcentagemRacaoDiaria == 0.0) {
            return 0.0;
        }
        double racaoDiaria = getPeso() * porcentagemRacaoDiaria;
        return racaoDiaria;
    }

    @Override
    public double calcularCustoMensal() {
       double custoRacao = (calcularRacaoDiaria() * 30) * precoKgRacao;
       return custoRacao + gastosVeterinarios;
    }
}
