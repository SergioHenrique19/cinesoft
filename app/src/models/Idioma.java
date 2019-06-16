/* Trabalho Final de PLP (2019/01)
 * Este codigo representa o uso de enum para idioma.
 * Onde possui um metodo que permite retornar uma String.
 * Desenvolvido por: Gabriel Peruzza, João Salgado, Otavio Lima e Sérgio Garcia */

package models;

public enum Idioma {
	DUBLADO("dublado"),
	LEGENDADO("legendado");

	private final String valor;

	Idioma(String sValor) {
		valor = sValor;
	}

	public String getValor() {
		return valor;
	}
}
