package model;

public class Cuidador extends Funcionario{

    public Cuidador(String nome, int idade, String telefone, String CPF, double salario, double beneficios) {
        super(nome, idade, telefone, CPF, salario, beneficios);
    }

    @Override
    public double calcularCustoMensal() {
        return getSalario() + getBeneficios();
    }
    
}
