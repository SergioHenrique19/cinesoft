/* Trabalho final de PLP (2019/01)
 * Este código representa a estrutura de um gerente e suas credenciais. */

package models;

import java.util.Date;

import entities.enums.Position;

public class Managers extends Employees {
	// TODO implementar as funcoes que tem direito
	// Construtor vazio
	public Managers() {}
	
	// Construtor com parametros
	public Managers(int cpf, String name, Position position, Date hiringDate, double baseSalary, double comission) {
		super(cpf, name, position, hiringDate, baseSalary, comission);
	}
}
