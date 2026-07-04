package model;

public class Cuidador extends Funcionario{

    private String setorResponsavel;
    private String turno;

    public Cuidador(String nome, int idade, String telefone, String CPF, double salario, double beneficios, String setorResponsavel, String turno) {
        super(nome, idade, telefone, CPF, salario, beneficios);
        this.setorResponsavel = setorResponsavel;
        this.turno = turno;
    }

    @Override
    public double calcularCustoMensal() {
        return getSalario() + getBeneficios();
    }
    
}
