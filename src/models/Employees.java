/* Trabalho final de PLP (2019/01)
 * Este código representa a estrutura de um funcionário. */

package models;

import java.util.Date;

import entities.enums.Position;

public class Employees {
	// TODO funcao para calcular comissao e alterar salario => by Sergio
	private int cpf;
	private String name;
	private Position position;
	private Date hiringDate;
	private double baseSalary;
	private double comission;
	
	// Construtor vazio
	public Employees() {}
	
	// Construtor com parâmetros
	public Employees(int cpf, String name, Position position, Date hiringDate, double baseSalary, double comission) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.position = position;
		this.hiringDate = hiringDate;
		this.baseSalary = baseSalary;
		this.comission = comission;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Date getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getComission() {
		return comission;
	}

	public void setComission(double comission) {
		this.comission = comission;
	}
}
