/* Trabalho Final de PLP (2019/01)
 * Este codigo representa o uso de enum para classificacao indicativa.
 * Onde possui um metodo que permite retornar uma String.
 * Desenvolvido por: Gabriel Peruzza, João Salgado, Otavio Lima e Sérgio Garcia */

package models;

public enum ClassIndic {
	LIVRE("livre"),
	DEZ("10"),
	DOZE("12"),
	CATORZE("14"),
	DEZESSEIS("16"),
	DEZOITO("18");

	private final String valor;

	ClassIndic(String sValor) {
		valor = sValor;
	}

	public String getValor() {
		return valor;
	}
}
