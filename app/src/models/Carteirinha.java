/* Trabalho Final de PLP (2019/01)
 * Este codigo representa o uso de enum para carteirinha.
 * Onde possui um metodo que permite retornar uma String.
 * Desenvolvido por: Gabriel Peruzza, João Salgado, Otavio Lima e Sérgio Garcia */

package models;

public enum Carteirinha {
	ID_JOVEM("id_jovem"),
	ESTUDANTE("estudante"),
	FIDELIDADE("fidelidade");

	private final String valor;

	Carteirinha(String sValor) {
		valor = sValor;
	}

	public String getValor() {
		return valor;
	}
}
