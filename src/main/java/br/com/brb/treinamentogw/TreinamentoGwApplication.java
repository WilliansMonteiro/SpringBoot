package br.com.brb.treinamentogw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TreinamentoGwApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreinamentoGwApplication.class, args);
	}
	 @GetMapping("/ola")
	   public String helloWorld() {
		Pessoa pessoa = new Pessoa("Willians");
		pessoa.setSexo("Masculino");
		pessoa.setSobrenome("Monteiro");
        return pessoa.toString();
}

    
}