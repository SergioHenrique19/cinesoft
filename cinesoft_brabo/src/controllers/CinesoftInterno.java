package controllers;

import java.util.Date;

import models.ClassIndic;
import models.Filme;
import models.IngressoInteiro;
import models.IngressoMeio;
import models.Sessao;

public class CinesoftInterno {
	// Metodo que vende ingresso
	public void venderIngresso(int idIngresso, Date dataVenda, int idSessao, int poltrona) {
		Sessao s = new Sessao(idSessao);
		IngressoInteiro i = new IngressoInteiro(idIngresso, dataVenda, s, poltrona);
		// listaIngressos.add(i);
	}
	
	// Metodo que cadastra sessao
	public void cadastraSessao(int idSessao, int hora, Date dia, Filme filme, boolean idioma, boolean tela, String titulo) {
		Filme f = new Filme(titulo);
		
		Sessao s = new Sessao(idSessao, hora, f, idioma, tela);
		// listaSessoes.add(s);
	}
	
	// Metodo que cadastra vendedor
	public void cadastrarVendedor(int cpf, String nome, boolean sexo, String dataContrato, double salario) {
		Vendedor v = new Vendedor(cpf, nome, sexo, dataContrato, salario);
		// listaVendedores.add(v);
	}
	
	// Metodo que cadastra filme
		public void cadastrarFilme(int idFilme, String titulo, Date dataLancamento, int duracao, ClassIndic classIndic) {
			Filme f = new Filme(idFilme, titulo, dataLancamento, duracao, classIndic);
			// listaFilmes.add(f);
		}
	

}
