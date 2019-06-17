package models;

import java.util.Date;

import models.Carteirinha;

public class IngressoMeio extends IngressoInteiro{
	private String carteirinha;

	public IngressoMeio(int idIngresso, Date dataVenda, int sessao, int poltrona, String carteirinha) {
		super(idIngresso, dataVenda, sessao, poltrona);
		this.carteirinha = carteirinha;
		this.total = 10.00;
	}

	public String getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(String carteirinha) {
		this.carteirinha = carteirinha;
	}

//	@Override
//	public String toString() {
//		return idIngresso + "," + getDataVenda() + "," + sessao.getIdSessao() + "," + poltrona + "," + total + "," + carteirinha.getValor();
//	}
}
