package com.chronosacademy.findMovies;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Filme {
	
	private String nome;
	private double duracao;
	private String classificacao;
	
	public Filme(String nome, double duracao, String classificacao) {
		super();
		this.nome = nome;
		this.duracao = duracao;
		this.classificacao = classificacao;
	}

	public Filme() {
		super();
	}


	
	
	
	
	

}
