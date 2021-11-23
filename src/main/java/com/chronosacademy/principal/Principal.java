package com.chronosacademy.principal;

import com.chronosacademy.logica.HelloWorld;

public class Principal {

	
	public static void main(String[] args) {
		
		HelloWorld hello = new HelloWorld(); //classe instanciada
		
		hello.setHello("Hello World");
		System.out.println(hello.getHello());
		
		hello = new HelloWorld(15);
		System.out.println(hello.getNumero());
		
	}

	


}
