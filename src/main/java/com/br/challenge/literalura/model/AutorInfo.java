package com.br.challenge.literalura.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
@Table(name = "autores")
public class AutorInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer anoNasc;
	private Integer anoFale;
	
	@ManyToMany
	private Livro livro;

	public AutorInfo(Long id, String name, Integer anoNasc, Integer anoFale, Livro livro) {
		this.id = id;
		this.name = name;
		this.anoNasc = anoNasc;
		this.anoFale = anoFale;
		this.livro = livro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(Integer anoNasc) {
		this.anoNasc = anoNasc;
	}

	public Integer getAnoFale() {
		return anoFale;
	}

	public void setAnoFale(Integer anoFale) {
		this.anoFale = anoFale;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Autor: \nId:" + id + "\nNome:" + name + "\nAno Nascimento:" + anoNasc + "\nAno Falecimento:" + anoFale + "]";
	}
	
	
	
	
}
