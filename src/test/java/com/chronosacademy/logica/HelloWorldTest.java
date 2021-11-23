package com.chronosacademy.logica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void testSetHello() {
		HelloWorld hello = new HelloWorld();
		hello.setHello("Hello World");
		assertEquals("Hello World", hello.getHello());
	}

}
