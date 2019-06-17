package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IngressoInteiro {
	// Atributos individuais
	protected int idIngresso;
	protected Date dataVenda;
	protected int sessao;   // Atributo que referencia sessao
	protected int poltrona;
	protected double total;
	
	// Construtor sem parametro
	public IngressoInteiro() {}
	
	// Construtor com parametros individuais
	public IngressoInteiro(int idIngresso, Date dataVenda, int sessao, int poltrona) {
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
	
	public String getDataVenda() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(dataVenda);
	}
	
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	public int getSessao() {
		return sessao;
	}
	
	public void setSessao(int sessao) {
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
	
//	@Override
//	public String toString() {
//		return idIngresso + "," + getDataVenda() + "," + sessao.getIdSessao() + "," + "," + poltrona + "," + total;
//	}
}
