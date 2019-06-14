package models;

import java.util.Date;

public class IngressoInteiro {
	// Atributos individuais
	protected int idIngresso;
	protected Date dataVenda;
	protected Sessao sessao;   // Atributo que referencia sessao
	protected int poltrona;
	protected double total;
	
	// Construtor sem parametro
	public IngressoInteiro() {}
	
	// Construtor com parametros individuais
	public IngressoInteiro(int idIngresso, Date dataVenda, Sessao sessao, int poltrona) {
		this.idIngresso = idIngresso;
		this.dataVenda = dataVenda;
		this.sessao = sessao;
		this.poltrona = poltrona;
		this.total = 20.00;
	}
	
	public int getIdIngresso() {
		return idIngresso;
	}
	
	public void setIdIngresso(int idIngresso) {
		this.idIngresso = idIngresso;
	}
	
	public Date getDataVenda() {
		return dataVenda;
	}
	
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	public Sessao getSessao() {
		return sessao;
	}
	
	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}
	
	public int getPoltrona() {
		return poltrona;
	}
	
	public void setPoltrona(int poltrona) {
		this.poltrona = poltrona;
	}
	
	public double getTotal() {
		return total;
	}
	
	@Override
	public String toString() {
		return idIngresso + ", " + dataVenda + ", " + sessao + ", " + ", " + poltrona + ", " + total;
	}
}
