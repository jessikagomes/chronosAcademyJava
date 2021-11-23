package com.chronosacademy.findMovies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilmeTest {

	@Test
	void testInstanciaFilme() {
		Filme filme = new Filme("Divertidamente", 1.45, "livre");
		assertEquals("Divertidamente", filme.getNome());
	}

}
