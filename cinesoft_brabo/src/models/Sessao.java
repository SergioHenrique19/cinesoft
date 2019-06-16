package models;

import models.Idioma;
import models.Tela;

public class Sessao {
	// Atributos de uma sessao
	private int idSessao;
	private int hora;
	private Filme filme;   // Atributo que referencia um (titulo) filme
	private Idioma idioma;   // dublado ou legendado
	private Tela tela;   // Onde "true = 3D" e "false = 2D"
	
	// Construtor sem parametro
	public Sessao(){}
	
	// Construtor com parametros individuais
	public Sessao(int idSessao, int hora, Filme filme, Idioma idioma, Tela tela) {
		this.idSessao = idSessao;
		this.hora = hora;
		this.filme = filme;
		this.idioma = idioma;
		this.tela = tela;
	}
	
	public int getIdSessao() {
		return idSessao;
	}
	
	public void setIdSessao(int idSessao) {
		this.idSessao = idSessao;
	}
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public Filme getFilme() {
		return filme;
	}
	
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	public Idioma getIdioma() {
		return idioma;
	}
	
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	public Tela getTela() {
		return tela;
	}
	
	public void setTela(Tela tela) {
		this.tela = tela;
	}
	
	@Override
	public String toString() {
		return idSessao + "," + hora + "," + filme.getTitulo() + "," + idioma.getValor() + "," + tela.getValor();
	}
}
