package com.chronosacademy.principal;

import java.util.ArrayList;
import java.util.List;

import com.chronosacademy.findMovies.Filme;
import com.chronosacademy.findMovies.Plataforma;

public class ExecFilmes {

	public static void main(String[] args) {
		
		Plataforma netflix = new Plataforma("Netflix", "netflix.com", 45.90, 300);
		Filme oPoco = new Filme("O Poço", 1.30, "+16");
		Filme birdBox = new Filme("Bird Box", 2.0, "+16");
		List<Filme> filmes = new ArrayList<Filme>();
		
		filmes.add(birdBox);
		filmes.add(oPoco);
		
		netflix.setFilmes(filmes);
		
		for(int i = 0; i < netflix.getFilmes().size(); i++) {
			String nomeFilme = filmes.get(i).toString();
			System.out.println(nomeFilme);
		}
		
		for (Filme filme : netflix.getFilmes()) {
			String nomeFilme = filme.getNome();
			System.out.println(nomeFilme);
		}
		
	}

}
