package view;

import control.Controller;
import java.util.Scanner;

public class View {
    private final Controller control;
    private final Scanner teclado;

    public View(Controller control) {
        this.control = control;
        this.teclado = new Scanner(System.in);
    }
    public void iniciarSistema() {
        System.out.println("Bem-vindo ao sistema do abrigo de animais!");
        byte opcao;
        do{
            System.out.print("Pressione enter para continuar. ");
            teclado.nextLine();
            exibirMenu();
            opcao = Byte.parseByte(teclado.nextLine());
            processarOpcao(opcao);
        }while(opcao != 0);
        teclado.close();
    }

    public void processarOpcao(byte opcao) {
        switch (opcao) {
            case 1:
                System.out.println("Nome:");
                String nomeCachorro = teclado.nextLine();
                System.out.println("Idade:");
                int idadeCachorro = Integer.parseInt(teclado.nextLine());
                System.out.println("Raça:");
                String racaCachorro = teclado.nextLine();
                System.out.println("Peso:");
                double pesoCachorro = Double.parseDouble(teclado.nextLine());
                System.out.println("Preço por kg de ração:");
                double precoKgRacaoCachorro = Double.parseDouble(teclado.nextLine());
                System.out.println("Gastos veterinários:");
                double gastosVeterinariosCachorro = Double.parseDouble(teclado.nextLine());
                control.cadastrarCachorro(nomeCachorro, idadeCachorro, racaCachorro, pesoCachorro, precoKgRacaoCachorro, gastosVeterinariosCachorro);
                System.out.println("Animal cadastrado com sucesso!");
                break;
            case 2:
                System.out.println("Nome:");
                String nomeGato = teclado.nextLine();
                System.out.println("Idade:");
                int idadeGato = Integer.parseInt(teclado.nextLine());
                System.out.println("Raça:");
                String racaGato = teclado.nextLine();
                System.out.println("Peso:");
                double pesoGato = Double.parseDouble(teclado.nextLine());
                System.out.println("Preço por kg de ração:");
                double precoKgRacaoGato = Double.parseDouble(teclado.nextLine());
                System.out.println("Gastos veterinários:");
                double gastosVeterinariosGato = Double.parseDouble(teclado.nextLine());
                control.cadastrarGato(nomeGato, idadeGato, racaGato, pesoGato, precoKgRacaoGato, gastosVeterinariosGato);
                System.out.println("Animal cadastrado com sucesso!");
                break;
            case 3:
                System.out.println("Nome:");
                String nomeVeterinario = teclado.nextLine();
                System.out.println("Idade:");
                int idadeVeterinario = Integer.parseInt(teclado.nextLine());
                System.out.println("Telefone:");
                String telefoneVeterinario = teclado.nextLine();
                System.out.println("CPF:");
                String cpfVeterinario = teclado.nextLine();
                System.out.println("Salário:");
                double salarioVeterinario = Double.parseDouble(teclado.nextLine());
                System.out.println("Benefícios:");
                double beneficiosVeterinario = Double.parseDouble(teclado.nextLine());
                System.out.println("CRM:");
                String crmVeterinario = teclado.nextLine();
                control.cadastrarVeterinario(nomeVeterinario, idadeVeterinario, telefoneVeterinario, cpfVeterinario, salarioVeterinario, beneficiosVeterinario, crmVeterinario);
                System.out.println("Veterinário cadastrado com sucesso!");
                break;
            case 4:
                System.out.println("Nome:");
                String nomeCuidador = teclado.nextLine();
                System.out.println("Idade:");
                int idadeCuidador = Integer.parseInt(teclado.nextLine());
                System.out.println("Telefone:");
                String telefoneCuidador = teclado.nextLine();
                System.out.println("CPF:");
                String cpfCuidador = teclado.nextLine();
                System.out.println("Salário:");
                double salarioCuidador = Double.parseDouble(teclado.nextLine());
                System.out.println("Benefícios:");
                double beneficiosCuidador = Double.parseDouble(teclado.nextLine());
                System.out.println("Setor Responsável:");
                String setorResponsavel = teclado.nextLine();
                System.out.println("Turno:");
                String turno = teclado.nextLine();
                control.cadastrarCuidador(nomeCuidador, idadeCuidador, telefoneCuidador, cpfCuidador, salarioCuidador, beneficiosCuidador, setorResponsavel, turno);
                System.out.println("Cuidador cadastrado com sucesso!");
                break;
            case 5:
                System.out.println("Nome:");
                String nomeAdotante = teclado.nextLine();
                System.out.println("Idade:");
                int idadeAdotante = Integer.parseInt(teclado.nextLine());
                System.out.println("Telefone:");
                String telefoneAdotante = teclado.nextLine();
                System.out.println("CPF:");
                String cpfAdotante = teclado.nextLine();
                System.out.println("Endereço:");
                String enderecoAdotante = teclado.nextLine();
                control.cadastrarAdotante(nomeAdotante, idadeAdotante, telefoneAdotante, cpfAdotante, enderecoAdotante);
                System.out.println("Adotante cadastrado com sucesso!");
                break;
            case 6:
                System.out.println("Digite o ID do animal:");
                int idAnimal = Integer.parseInt(teclado.nextLine());
                System.out.println("Digite o nome da vacina:");
                String nomeVacina = teclado.nextLine();

                control.adicionarVacinaAnimal(idAnimal, nomeVacina);
                System.out.println("Vacina adicionada com sucesso!");
                break;
            case 7:
                System.out.println("Digite o CPF do adotante:");
                String cpfAdotanteAdocao = teclado.nextLine();
                System.out.println("Digite o ID do animal:");
                int idAnimalAdocao = Integer.parseInt(teclado.nextLine());

                control.adotarAnimal(cpfAdotanteAdocao, idAnimalAdocao);
                System.out.println("Animal adotado com sucesso!");
                break;
            case 8:
                control.exibirAnimais();
                break;
            case 9:
                control.exibirFuncionarios();
            case 10:
                control.exibirFuncionariosVeterinarios();
                break;
            case 11:
                control.exibirFuncionariosCuidadores();
                break;
            case 12:
                control.exibirAdotantes();
                break;
            case 13:
                control.exibirCachorros();
                break;
            case 14:
                control.exibirGatos();
                break;
            case 15:
                control.exibirAnimaisDisponiveis();
                break;
            case 16:
                System.out.println("Digite o ID do animal:");
                int animalId = Integer.parseInt(teclado.nextLine());
                control.procurarAnimaisPorId(animalId);
                break;
            case 0:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    public void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Cadastrar Cachorro");
        System.out.println("2. Cadastrar Gato");
        System.out.println("3. Cadastrar Veterinário");
        System.out.println("4. Cadastrar Cuidador");
        System.out.println("5. Cadastrar Adotante");
        System.out.println("6. Adicionar vacina a um animal");
        System.out.println("7. Adotar animal");
        System.out.println("8. Listar animais");
        System.out.println("9. Listar funcionários");
        System.out.println("10. Listar Veterinários");
        System.out.println("11. Listar Cuidadores");
        System.out.println("12. Listar Adotantes");
        System.out.println("13. Listar Cachorros");
        System.out.println("14. Listar Gatos");
        System.out.println("15. Listar Animais Disponíveis para Adoção");
        System.out.println("16. Procurar animal por ID");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

}