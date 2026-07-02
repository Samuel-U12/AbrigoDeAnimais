package Model.Funcionarios;

import Model.Pessoa;

/*Herança cascata*/
public abstract class Funcionario extends Pessoa {

    private double salario;
    private double beneficios;

    public Funcionario(String nome, int idade, String telefone, String CPF, double salario, double beneficios) {
        super(nome, idade, telefone, CPF);
        this.salario = salario;
        this.beneficios = beneficios;
    }
    public double getSalario() {
        return salario;
    }

    public double getBeneficios() {
        return beneficios;
    }


}
