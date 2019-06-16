/* Trabalho Final de PLP (2019/01)
 * Este codigo representa o uso de enum para tela.
 * Onde possui um metodo que permite retornar uma String.
 * Desenvolvido por: Gabriel Peruzza, João Salgado, Otavio Lima e Sérgio Garcia */

package models;

public enum Tela {
	DOIS_D("2d"),
	TRES_D("3d");

	private final String valor;

	Tela(String sValor) {
		valor = sValor;
	}

	public String getValor() {
		return valor;
	}
}
