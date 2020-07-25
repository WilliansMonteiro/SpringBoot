package br.com.brb.treinamentogw;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pessoa {
   
	private String nome;
	private String sobrenome;
	private Long idade;
	private String sexo;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String sobrenome, Long idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
    public Pessoa(String nome) {
		this.nome = nome;
	}
    public Pessoa(Long idade) {
    	this.idade = idade;
    }
}
