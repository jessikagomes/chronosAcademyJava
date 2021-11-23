package com.chronosacademy.logica;

public class HelloWorld {
	
	private String hello;
	private int numero;
	
	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HelloWorld(String hello, int numero) {
		this.hello = hello;
		this.numero = numero;
	}
	
	public HelloWorld(int numero) {
		this.numero = numero;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
