/* Trabalho Final de PLP (2019/01)
 * Este codigo representa a estrutura de um ingresso meio, que herda ingresso inteiro.
 * Desenvolvido por: Gabriel Peruzza, João Salgado, Otavio Lima e Sérgio Garcia */

package models;

import java.util.Date;

import models.Carteirinha;

public class IngressoMeio extends IngressoInteiro{
	private Carteirinha carteirinha;

	public IngressoMeio(int idIngresso, Date dataVenda, Sessao sessao, int poltrona, Carteirinha carteirinha) {
		super(idIngresso, dataVenda, sessao, poltrona);
		this.carteirinha = carteirinha;
		this.total = 10.00;
	}

	public Carteirinha getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(Carteirinha carteirinha) {
		this.carteirinha = carteirinha;
	}

	@Override
	public String toString() {
		return idIngresso + "," + getDataVenda() + "," + sessao.getIdSessao() + "," + poltrona + "," + total + "," + carteirinha.getValor();
	}
}
