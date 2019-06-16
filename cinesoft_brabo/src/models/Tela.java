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
