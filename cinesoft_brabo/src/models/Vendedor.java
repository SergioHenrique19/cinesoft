package models;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
	// Atributos individuais
	private int cpf;
	private String nome;
	private boolean sexo;   // Onde "true = feminino" e "false = masculino"
	private String dataContrato;
	private double salario;
	
	// Atributos gerais
	private List<Vendedor> listaVendedores;
	
	// Construtor com unico parametro
	public Vendedor(String nome) {
		this.nome = nome;
	}
	
	// Construtor com parametros individuais
	public Vendedor(int cpf, String nome, boolean sexo, String dataContrato, double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.dataContrato = dataContrato;
		this.salario = salario;
	}
	
	// Construtor com lista de vendedores
	public Vendedor(List<Vendedor> listaVendedores) {
		this.listaVendedores = new ArrayList<Vendedor>();
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isSexo() {
		return sexo;
	}
	
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
	public String getDataContrato() {
		return dataContrato;
	}
	
	public void setDataContrato(String dataContrato) {
		this.dataContrato = dataContrato;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
		
	public List<Vendedor> getListaVendedores() {
		return listaVendedores;
	}
	

	
	@Override
	public String toString() {
		return cpf + ", " + nome + ", " + sexo + ", " + dataContrato + ", " + salario;
	}
}
