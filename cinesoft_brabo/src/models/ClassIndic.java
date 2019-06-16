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
