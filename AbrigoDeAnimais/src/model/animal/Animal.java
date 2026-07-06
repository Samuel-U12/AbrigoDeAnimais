package model.animal;

import model.Custavel;

public abstract class Animal implements Custavel{
        private static int contadorId = 1;
        private int id;
        private String nome;
        private int idade;
        private String raca;
        private double peso;
        private FichaMedica fichaMedica;
        private String statusAdocao = "Disponível";

        public Animal(String nome, int idade, String raca, double peso) {
            this.id = contadorId;
            contadorId++;
            this.nome = nome;
            this.idade = idade;
            this.raca = raca;
            this.peso = peso;
            this.fichaMedica = new FichaMedica();
        }

        public int getId() {
            return this.id;
        }

        public String getNome() {
            return this.nome;
        }

        public int getIdade() {
            return this.idade;
        }

        public String getraca() {
            return this.raca;
        }

        public double getPeso() {
            return this.peso;
        }

        public String getStatusAdocao() {
            return this.statusAdocao;
        }

        public FichaMedica getFichaMedica() {
            return this.fichaMedica;
        }

        public void adotar() {
            this.statusAdocao = "Adotado";
        }

        public abstract double calcularRacaoDiaria();

        @Override
        public abstract double calcularCustoMensal();
}
