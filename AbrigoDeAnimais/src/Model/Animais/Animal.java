package Model.Animais;

public abstract class Animal {
        private String nome;
        private int idade;
        private String raca;
        private double peso;
        private FichaMedica fichaMedica;
        private String statusAdocao = "Disponível";

        public Animal(String nome, int idade, String raca, double peso) {
            this.nome = nome;
            this.idade = idade;
            this.raca = raca;
            this.peso = peso;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public String getraca() {
            return raca;
        }

        public double getPeso() {
            return peso;
        }

        public String getStatusAdocao() {
            return statusAdocao;
        }

        public void setStatusAdocao(String statusAdocao) {
            if (statusAdocao.equalsIgnoreCase("disponível") || statusAdocao.equalsIgnoreCase("indisponível")) {
                this.statusAdocao = statusAdocao;
            } else {
                System.out.println("Status de adoção inválido. Use 'disponível' ou 'indisponível'.");
            }
        }

        public FichaMedica getFichaMedica() {
            return fichaMedica;
        }

        public abstract double calcularRacaoDiaria();
}
