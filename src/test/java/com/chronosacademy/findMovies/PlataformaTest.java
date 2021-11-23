package com.chronosacademy.findMovies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlataformaTest {

	@Test
	void testConstrutorAtivo() {
		Plataforma plataforma = new Plataforma("Netflix","netflix.com.br", 45.90, 30);
		assertTrue(plataforma.isAtivo());
	}
	
	@Test
	void testAtivo() {
		Plataforma plataforma = new Plataforma();
		plataforma.setAtivo(false);
		assertFalse(plataforma.isAtivo());
		
	}
	
	@Test
	void testNome() {
		Plataforma plataforma = new Plataforma();
		plataforma.setNome("disney");
		assertEquals("disney", plataforma.getNome());
				
	}
	
	@Test
	void testQtdAssinantes() {
		Plataforma plataforma = new Plataforma();
		plataforma.setQtdAssinantes(40);
		assertEquals(40, plataforma.getQtdAssinantes());
	}
	
	@Test
	void testUrl() {
		Plataforma plataforma = new Plataforma();
		plataforma.setUrl("disney.com");
		assertEquals("disney.com", plataforma.getUrl());
		
	}
	
	@Test
	void testValor() {
		Plataforma plataforma = new Plataforma();
		plataforma.setValor(30.50);
		assertEquals(30.50, plataforma.getValor());
	}
		
		
}
