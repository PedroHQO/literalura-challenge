package com.br.challenge.literalura.model;

public enum Languages {
	ENGLISH("en"),
	SPANISH("es"),
	FRENCH("fr"),
	ITALIAN("it"),
	PORTUGUESE("pt");
	
	private String idiomas;
	
	Languages (String idiomas){
		this.idiomas = idiomas;
	}
	
	public static Languages fromString(String text) {
		for(Languages caregoria : Languages.values()) 
			if(categoria.idiomas.equalIgnoreCase(text)) {
				return categoria;
			}
		throw new IllegalArgumentException("Nenhuma categoria encontrada: " + text);
	}
	
}
