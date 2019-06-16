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
