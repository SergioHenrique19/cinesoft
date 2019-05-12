/* Trabalho Final de PLP (2019/01)
 * Este codigo representa a estrutura de um filme e suas operacoes.
 * Pode ser considerado o principal, considerando que 
 * uma sessao precisa ter um filme referenciado.
 * Um filme pode ser cadastrado, atualizado ou listado. 
 * Os filmes são registrados numa lista de filmes. */

package cinesoft;

import java.util.ArrayList;
import java.util.List;

public class Filme {
	// Atributos individuais de um filme
	private int idFilme;
	private String titulo;
	private String dataLancamento;
	private int duracao;   // Duração deve ser em minutos
	
	// Atributos gerais
	private List<Filme> listaFilmes;
	
	// Construtor com um unico parametro
	public Filme(String titulo) {
		this.titulo = titulo;
	}
	
	// Construtor com parametros individuais
	public Filme(int idFilme, String titulo, String dataLancamento, int duracao) {
		this.idFilme = idFilme;
		this.titulo = titulo;
		this.dataLancamento = dataLancamento;
		this.duracao = duracao;
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

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
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
	
	// Metodo que cadastra filme
	public void cadastrarFilme(int idFilme, String titulo, String dataLancamento, int duracao) {
		Filme f = new Filme(idFilme, titulo, dataLancamento, duracao);
		listaFilmes.add(f);
	}

	@Override
	public String toString() {
		return idFilme + ", " + titulo + ", " + dataLancamento + ", " + duracao;
	}
}
