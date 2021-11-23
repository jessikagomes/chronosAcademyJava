package com.chronosacademy.findMovies;

public class Plataforma {
	
	private String nome;
	private String url;
	private boolean ativo = true;
	private double valor;
	private int qtdAssinantes;
	
	
	public Plataforma(String nome, String url, double valor, int qtdAssinantes) {
		super();
		this.nome = nome;
		this.url = url;
		this.valor = valor;
		this.qtdAssinantes = qtdAssinantes;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getQtdAssinantes() {
		return qtdAssinantes;
	}


	public void setQtdAssinantes(int qtdAssinantes) {
		this.qtdAssinantes = qtdAssinantes;
	}
	
	
	
	

}
