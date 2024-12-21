package br.com.institutoafro.exemplos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.institutoafro.exemplos.heranca.Cachorro;
import br.com.institutoafro.exemplos.heranca.Gato;
import br.com.institutoafro.exemplos.interfaces.Execucao;
import br.com.institutoafro.exemplos.polimorfismo.Zoologico;

@SpringBootApplication
public class ExemplosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplosApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(String... strings) throws Exception {
		return args -> {

		/* 	@SuppressWarnings("unused")

			MInhaClasse objeto = null;
			objeto = new MInhaClasse();

			MInhaClasse objeto2 = new MInhaClasse(1, "Isto é um teste"); 

			objeto = null;
			objeto = objeto2; */


			// Execução do exemplo de Interfaces
			/* Cachorro dog = new Cachorro("Niti", 2, "Maltês");
			dog.comer();;

			Execucao exec = new Execucao();
			exec.executar();
			 */


			 // Execução do exemplo de polimorfismo

			 Zoologico zoo = new Zoologico(new Cachorro("Niti", 2, "Maltês"));
			 zoo.alimentarAnimal();

			 zoo = new Zoologico(new Gato("Loki", 6, "Viralata Siamês"));
			 zoo.alimentarAnimal();

			 zoo = new Zoologico(new Gato("Pandora", 6, "Viralata Pretinha"));
			 zoo.alimentarAnimal();



			/*
			 * EstruturasControleAula estuturas = new EstruturasControleAula();
			 * 
			 * estuturas.ocorrenciaDeLetrasNaPalavra("r", "vitor");
			 * 
			 * estuturas.qualNumeroCorreto();
			 */

			
	};

}
}
