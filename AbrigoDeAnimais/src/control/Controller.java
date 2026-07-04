package control;

import java.util.HashMap;
import java.util.Map;
import model.*;

public class Controller {
    private Map<String, Funcionario> funcionarioMap = new HashMap<>();
    private Map<Integer, Animal> animaisMap = new HashMap<>();
    private Map<String, Adotante> adotanteMap = new HashMap<>();

    public void cadastrarCachorro(String nome, int idade, String raca, double precoKgRacao, double gastosVeterinarios, double peso) {
        Animal cachorro = new Cachorro(nome, idade, raca, precoKgRacao, gastosVeterinarios, peso);
        animaisMap.put(cachorro.getId(), cachorro);
    }

    public void cadastrarGato(String nome, int idade, String raca, double precoKgRacao, double gastosVeterinarios, double peso) {
        Animal gato = new Gato(nome, idade, raca, precoKgRacao, gastosVeterinarios, peso);
        animaisMap.put(gato.getId(), gato);
    }

    public void cadastrarVeterinario(String nome, int idade, String telefone, String CPF, double salario, double beneficios, String crm) {
        Funcionario v = new Veterinario(nome, idade, telefone, CPF, salario, beneficios, crm);
        funcionarioMap.put(v.getCPF(), v);
    }

    public void cadastrarCuidador(String nome, int idade, String telefone, String CPF, double salario, double beneficios) {
        Funcionario c = new Cuidador(nome, idade, telefone, CPF, salario, beneficios);
        funcionarioMap.put(c.getCPF(), c);
    }

    public void cadastrarAdotante(String nome, int idade, String telefone, String CPF, String endereco) {
        Adotante adotante = new Adotante(nome, idade, telefone, CPF, endereco);
        adotanteMap.put(adotante.getCPF(), adotante);
    }

    public void exibirFuncionarios() {
        System.out.println("Funcionários cadastrados:");
        for (Funcionario funcionario : funcionarioMap.values()) {
            System.out.println("Nome: " + funcionario.getNome() + ", CPF: " + funcionario.getCPF() + ", Salário: " + funcionario.getSalario() + ", Benefícios: " + funcionario.getBeneficios() + ", Custo Mensal: " + funcionario.calcularCustoMensal());
        }
    }

    public void exibirFuncionariosCuidadores() {
        System.out.println("Cuidadores cadastrados:");
        for (Funcionario funcionario : funcionarioMap.values()) {
            if (funcionario instanceof Cuidador) {
                Cuidador cuidador = (Cuidador) funcionario;
                System.out.println("Nome: " + cuidador.getNome() + ", CPF: " + cuidador.getCPF() + ", Salário: " + cuidador.getSalario() + ", Benefícios: " + cuidador.getBeneficios() + ", Custo Mensal: " + cuidador.calcularCustoMensal());
            }
        }
    }

    public void exibirFuncionariosVeterinarios() {
        System.out.println("Veterinários cadastrados:");
        for (Funcionario funcionario : funcionarioMap.values()) {
            if (funcionario instanceof Veterinario) {
                Veterinario veterinario = (Veterinario) funcionario;
                System.out.println("Nome: " + veterinario.getNome() + ", CPF: " + veterinario.getCPF() + ", Salário: " + veterinario.getSalario() + ", Benefícios: " + veterinario.getBeneficios() + ", CRM: " + veterinario.getCrm() + ", Custo Mensal: " + veterinario.calcularCustoMensal());
            }
        }
    }

    public void exibirAnimais() {
        System.out.println("Animais cadastrados:");
        for (Animal animal : animaisMap.values()) {
            System.out.println("ID: " + animal.getId() + ", Nome: " + animal.getNome() + ", Idade: " + animal.getIdade() + ", Raça: " + animal.getraca() + ", Peso: " + animal.getPeso() + ", Status de Adoção: " + animal.getStatusAdocao() + ", Ração Diária: " + animal.calcularRacaoDiaria() + ", Custo Mensal: " + animal.calcularCustoMensal() + ", Ficha Médica: " + animal.getFichaMedica());
        }
    }

    public void exibirAdotantes() {
        System.out.println("Adotantes cadastrados:");
        for (Adotante adotante : adotanteMap.values()) {
            System.out.println("Nome: " + adotante.getNome() + ", Idade: " + adotante.getIdade() + ", Telefone: " + adotante.getTelefone() + ", CPF: " + adotante.getCPF() + ", Endereço: " + adotante.getEndereco());
        }
    }
}