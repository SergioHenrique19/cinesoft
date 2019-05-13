/* Trabalho Final de PLP (2019/01)
 * Este codigo representa a estrutura de uma sessao e suas operacoes.
 * Uma sessao precisa referenciar um filme.
 * Uma sessao pode cadastrar, listar ou editar. */

package cinesoft;

import java.util.ArrayList;
import java.util.List;

public class Sessao {
	// Atributos de uma sessao
	private int idSessao;
	private int hora;
	private String dia;
	private Filme filme;   // Atributo que referencia um (titulo) filme
	private boolean idioma;   // Onde "true = dublado" e "false = legendado"
	private boolean tela;   // Onde "true = 3D" e "false = 2D"
	
	// Atributos gerais
	private List<Sessao> listaSessoes;
	
	// Construtor com unico parametro
	public Sessao(int idSessao) {
		this.idSessao = idSessao;
	}

	// Construtor com parametros individuais
	public Sessao(int idSessao, int hora, String dia, Filme filme, boolean idioma, boolean tela) {
		this.idSessao = idSessao;
		this.hora = hora;
		this.dia = dia;
		this.filme = filme;
		this.idioma = idioma;
		this.tela = tela;
	}
	
	// Construtor com lista de sessao
	public Sessao(List<Sessao> listaSessoes) {
		this.listaSessoes = new ArrayList<Sessao>();
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

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public boolean isIdioma() {
		return idioma;
	}

	public void setIdioma(boolean idioma) {
		this.idioma = idioma;
	}

	public boolean isTela() {
		return tela;
	}

	public void setTela(boolean tela) {
		this.tela = tela;
	}
	
	// Metodo que cadastra sessao
	public void cadastraSessao(int idSessao, int hora, String dia, Filme filme, boolean idioma, boolean tela, String titulo) {
		Filme f = new Filme(titulo);
		
		Sessao s = new Sessao(idSessao, hora, dia, f, idioma, tela);
		// listaSessoes.add(s);
	}

	@Override
	public String toString() {
		return idSessao + ", " + hora + ", " + dia + ", " + filme + ", " + idioma + ", " + tela;
	}
}
