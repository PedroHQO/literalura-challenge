package com.br.challenge.literalura.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "livros")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String titulo;
	@OneToMany(mappedBy = "livro", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<AutorInfo> autores;
	@Enumerated(EnumType.STRING)
	private Languages languages;
	private Double downloads;
	
	public Livro() {
		super();
	}

	public Livro(String titulo, List<AutorInfo> autores, List<String> languages, Double downloads) {
		this.titulo = titulo;
		this.autores = new ArrayList<>();
		this.languages = Languages.fromString(languages.get(0));
		this.downloads = downloads;
		
		for(Autores autorInfo : autores) {
			AutorInfo autor = new AutorInfo(autorInfo.name(),autorInfo.anoNasc, autorInfo.anoFale, this);
			this.autores.add(autor);
		}
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<AutorInfo> getAutores() {
		return autores;
	}

	public void setAutores(List<AutorInfo> autores) {
		this.autores = autores;
	}

	public Languages getLanguages() {
		return languages;
	}

	public void setLanguages(Languages languages) {
		this.languages = languages;
	}

	public Double getDownloads() {
		return downloads;
	}

	public void setDownloads(Double downloads) {
		this.downloads = downloads;
	}

	@Override
	public String toString() {
		return "Informações Livro " + "\nTítulo: " + titulo + "\nAutores: " + autores + "\nNúmero downloads:" + downloads;
	}

	
	

	
}


