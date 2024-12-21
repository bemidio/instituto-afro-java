package br.com.institutoafro.exemplos.heranca;

public class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade); // Chama o construtor da superclasse
        this.raca = raca;
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }
}
