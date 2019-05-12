/* Trabalho final de PLP (2019/01)
 * Este código representa a estrutura de um vendedor e suas credenciais. */

package models;

import java.util.Date;

import entities.enums.Position;

public class Costumers extends Employees {
	// TODO implementar as funcoes que tem direito
	// Construtor vazio
	public Costumers() {}
	
	// Construtor com parametros
	public Costumers(int cpf, String name, Position position, Date hiringDate, double baseSalary, double comission) {
		super(cpf, name, position, hiringDate, baseSalary, comission);
	}
}
