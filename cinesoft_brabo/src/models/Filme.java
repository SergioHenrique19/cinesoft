package models;

import java.text.SimpleDateFormat;
import java.util.Date;

import models.ClassIndic;

public class Filme {
	// Atributos individuais de um filme
	private int idFilme;
	private String titulo;
	private Date dataLancamento;
	private int duracao;   // Duração deve ser em minutos
	private ClassIndic classIndic;
	
	// Construtor sem parametro
	public Filme(){}
	
	// Construtor com parametros individuais
	public Filme(int idFilme, String titulo, Date dataLancamento, int duracao, ClassIndic classIndic) {
		this.idFilme = idFilme;
		this.titulo = titulo;
		this.dataLancamento = dataLancamento;
		this.duracao = duracao;
		this.classIndic = classIndic;
	}
	
	public int getIdFilme() {
		return idFilme;
	}
	
	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDataLancamento() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(dataLancamento);
	}
	
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}	
	
	public ClassIndic getClassIndic() {
		return classIndic;
	}

	public void setClassIndic(ClassIndic classIndic) {
		this.classIndic = classIndic;
	}
	
	@Override
	public String toString() {
		return idFilme + "," + titulo + "," + getDataLancamento() + "," + duracao + "," + classIndic.getValor();
	}
}
