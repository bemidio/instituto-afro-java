package br.com.institutoafro.exemplos.heranca;

public class Gato extends Animal{
    String raca;

    public Gato(String nome, int idade, String raca) {
        super(nome, idade); // Chama o construtor da superclasse
        this.raca = raca;
    }

    public void miar() {
        System.out.println(nome + " está miando: Miau Miau!");
    }
}
