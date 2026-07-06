package model.funcionarios;

public class Veterinario extends Funcionario{

    private final String crm;

    public Veterinario(String nome, int idade, String telefone, String CPF, double salario, double beneficios, String crm) {
        super(nome, idade, telefone, CPF, salario, beneficios);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    @Override
    public double calcularCustoMensal() {
        return getSalario() + getBeneficios();
    }

}
