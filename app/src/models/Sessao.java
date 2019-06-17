package models;

import models.Idioma;
import models.Tela;

public class Sessao {
	// Atributos de uma sessao
	private int idSessao;
	private int hora;
	private int filme;   // Atributo que referencia um (titulo) filme
	private int idioma;   // dublado ou legendado
	private int tela;   // Onde "true = 3D" e "false = 2D"
	
	// Construtor sem parametro
	public Sessao(){}
	
	// Construtor com parametros individuais
	public Sessao(int idSessao, int hora, int filme, int idioma, int tela) {
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
	
	public int getFilme() {
		return filme;
	}
	
	public void setFilme(int filme) {
		this.filme = filme;
	}
	
	public int getIdioma() { return idioma; }
	
	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}
	
	public int getTela() {
		return tela;
	}
	
	public void setTela(int tela) {
		this.tela = tela;
	}
	
//	@Override
//	public String toString() {
//		return idSessao + "," + hora + "," + filme.getTitulo() + "," + idioma.getValor() + "," + tela.getValor();
//	}
}
