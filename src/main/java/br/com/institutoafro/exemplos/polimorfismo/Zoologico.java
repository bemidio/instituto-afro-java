package br.com.institutoafro.exemplos.polimorfismo;

import br.com.institutoafro.exemplos.heranca.Animal;

public class Zoologico {

    Animal animal;

    public Zoologico(Animal animal){
        this.animal = animal;
    }

    public void alimentarAnimal(){
        
        System.out.println("O cuidador está alimentando um " + this.animal.getClass().getSimpleName() + " de nome " + this.animal.getNome());

    }
}
