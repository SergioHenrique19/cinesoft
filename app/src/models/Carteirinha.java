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
