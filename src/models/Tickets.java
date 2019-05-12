/* Trabalho final de PLP (2019/01)
 * Este código representa a estrutura de um ingresso. */

package models;

import java.util.Date;

public class Tickets {
	// TODO implementar as funcoes de ingressos TODAS => by Sergio
	private int idTicket;
	private Date saleDate;
	private Sessions session;
	private Costumers costumer;
	private int quantitySeat;
	private boolean typeTicket;   // Onde true = inteira e false = meia
	private double value;   // Valor do ingresso inteiro
	private double total;   // Calculo total de quantidade, tipo de ingresso e valores
	
	// Construtor vazio
	public Tickets() {}
	
	// Construtor com parametros
	public Tickets(int idTicket, Date saleDate, Sessions session, Costumers costumer, int quantitySeat, boolean typeTicket, double value, double total) {
		this.idTicket = idTicket;
		this.saleDate = saleDate;
		this.session = session;
		this.costumer = costumer;
		this.quantitySeat = quantitySeat;
		this.typeTicket = typeTicket;
		this.value = value;
		this.total = total;
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public Sessions getSession() {
		return session;
	}

	public void setSession(Sessions session) {
		this.session = session;
	}

	public Costumers getCostumer() {
		return costumer;
	}

	public void setCostumer(Costumers costumer) {
		this.costumer = costumer;
	}

	public int getQuantitySeat() {
		return quantitySeat;
	}

	public void setQuantitySeat(int quantitySeat) {
		this.quantitySeat = quantitySeat;
	}

	public boolean isTypeTicket() {
		return typeTicket;
	}

	public void setTypeTicket(boolean typeTicket) {
		this.typeTicket = typeTicket;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
