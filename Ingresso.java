/* Trabalho Final de PLP (2019/01)
 * Este codigo representa a estrutura de um ingresso e suas operacoes.
 * Um ingresso precisa referenciar uma sessao e um funcionario.
 * Um ingresso pode cadastrar (vender), imprimir ou listar. */

package cinesoft;

import java.util.List;

public class Ingresso {
	// Atributos individuais
	private int idIngresso;
	private String dataVenda;
	private Sessao sessao;   // Atributo que referencia sessao
	private Vendedor vendedor;   // Atributo que referencia vendedor
	private boolean tipoIngresso;   // Onde "true = inteira" e "false = meia"
	private int qtdPoltronas;
	private double total;
	
	// Atributos gerais
	private List<Ingresso> listaIngressos;
	
	// Construtor sem parametro
	public Ingresso() {}

	// Construtor com parametros individuais
	public Ingresso(int idIngresso, String dataVenda, Sessao sessao, Vendedor vendedor, boolean tipoIngresso, int qtdPoltronas, double total) {
		this.idIngresso = idIngresso;
		this.dataVenda = dataVenda;
		this.sessao = sessao;
		this.vendedor = vendedor;
		this.tipoIngresso = tipoIngresso;
		this.qtdPoltronas = qtdPoltronas;
		this.total = total;
	}

	public int getIdIngresso() {
		return idIngresso;
	}

	public void setIdIngresso(int idIngresso) {
		this.idIngresso = idIngresso;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public boolean isTipoIngresso() {
		return tipoIngresso;
	}

	public void setTipoIngresso(boolean tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}

	public int getQtdPoltronas() {
		return qtdPoltronas;
	}

	public void setQtdPoltronas(int qtdPoltronas) {
		this.qtdPoltronas = qtdPoltronas;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	// Metodo que vende ingresso
	public void venderIngresso(int idIngresso, String dataVenda, Sessao sessao, 
			Vendedor vendedor, boolean tipoIngresso, int qtdPoltronas, double total,
			String nomeVendedor, int idSessao) {
		Vendedor v = new Vendedor(nomeVendedor);
		Sessao s = new Sessao(idSessao);
		Ingresso i = new Ingresso(idIngresso, dataVenda, s, v, tipoIngresso, qtdPoltronas, total);
		// listaIngressos.add(i);
	}

	@Override
	public String toString() {
		return idIngresso + ", " + dataVenda + ", " + sessao + ", "
				+ vendedor + ", " + tipoIngresso + ", " + qtdPoltronas + ", " + total;
	}
}
