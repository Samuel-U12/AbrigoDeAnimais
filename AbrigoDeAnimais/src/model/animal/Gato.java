package model.animal;

public class Gato extends Animal {
    private String porte;
    private double precoKgRacao;
    private double gastosVeterinarios;

    public Gato(String nome, int idade, String raca, double peso, double precoKgRacao, double gastosVeterinarios) {
        super(nome, idade, raca, peso);
        this.precoKgRacao = precoKgRacao;
        this.gastosVeterinarios = gastosVeterinarios;

        if (peso < 4.0) {
            this.porte = "Pequeno";
        } else if (peso < 6.0) {
            this.porte = "Médio";
        } else {
            this.porte = "Grande";
        }
    }

    public String getPorte() {
        return porte;
    }

    public double getPrecoKgRacao() {
        return precoKgRacao;
    }

    public double getGastosVeterinarios() {
        return gastosVeterinarios;
    }

    public double porcentagemRacaoDiaria() {
        return switch (getPorte()) {
            case "Pequeno" -> 0.05;
            case "Médio" -> 0.04;
            case "Grande" -> 0.03;
            default -> 0.0;
        };
    }
    @Override
    public double calcularRacaoDiaria() {
        double porcentagemRacaoDiaria = porcentagemRacaoDiaria();
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
