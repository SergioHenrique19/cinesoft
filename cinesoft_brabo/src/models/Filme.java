package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import models.ClassIndic;

public class Filme {
	// Atributos individuais de um filme
	private int idFilme;
	private String titulo;
	private Date dataLancamento;
	private int duracao;   // Duração deve ser em minutos
	private ClassIndic classIndic;
	
	// Atributos gerais
	private List<Filme> listaFilmes;
	
	// Construtor com um unico parametro
	public Filme(String titulo) {
		this.titulo = titulo;
	}
	
	// Construtor com parametros individuais
	public Filme(int idFilme, String titulo, Date dataLancamento, int duracao, ClassIndic classIndic) {
		this.idFilme = idFilme;
		this.titulo = titulo;
		this.dataLancamento = dataLancamento;
		this.duracao = duracao;
		this.classIndic = classIndic;
	}
	
	// Construtor com a lista de filmes
	public Filme(List<Filme> listaFilmes) {
		this.listaFilmes = new ArrayList<Filme>();
	}
	
	public int getIdFilme() {
		return idFilme;
	}
	
	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Date getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public List<Filme> getListaFilmes() {
		return listaFilmes;
	}
	
	public void setListaFilmes(List<Filme> listaFilmes) {
		this.listaFilmes = listaFilmes;
	}	
	
	public ClassIndic getClassIndic() {
		return classIndic;
	}

	public void setClassIndic(ClassIndic classIndic) {
		this.classIndic = classIndic;
	}
	
	@Override
	public String toString() {
		return idFilme + ", " + titulo + ", " + dataLancamento + ", " + duracao + ", " + classIndic;
	}
}
