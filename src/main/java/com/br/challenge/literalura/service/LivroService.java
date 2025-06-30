package com.br.challenge.literalura.service;

import java.util.*;

public class LivroService {
	private Scanner scanner = new Scanner(System.in);
	private final ConsumoApi consumoApi = new ConsumoApi();
	private final ConverteDados conversor = new ConverteDados();
	private final String ENDERECO = "http://gutendex.com/books/";
	private String livroSelecao;
	

	private String obterNomeDoLivro() {
		System.out.println("Digite o nome do livro que deseja buscar:");
		livroSelecao = scanner.nextLine();
		return livroSelecao;
	}
	
	

}
