package com.br.challenge.literalura.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;

public record LivroInfo(
		@JsonAlias("title") String titulo,
		@JsonAlias("authors") List<Autores> autores,
		@JsonAlias("languages") List<String> languages,
		@JsonAlias("download_count") Double downloads) {
}
