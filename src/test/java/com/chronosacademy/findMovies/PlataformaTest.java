package com.chronosacademy.findMovies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlataformaTest {

	@Test
	void testConstrutorAtivo() {
		Plataforma plataforma = new Plataforma("Netflix","netflix.com.br", 45.90, 30);
		assertTrue(plataforma.isAtivo());
	}


}
