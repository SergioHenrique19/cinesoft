package controllers;

import java.sql.ResultSet;
import java.text.ParseException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import models.*;
import repository.Database;

public class Cinesoft {
	public static void main(String[] args) throws ParseException {
		Filme filme = new Filme();
		int idfilme = filme.create("Avatar", "2009-05-01", 180);
		filme.update(1, "titulo = 'Titanic'");
		models.Filme resultadoFilme = filme.getByTitulo("Tita");
		System.out.println(resultadoFilme.getTitulo());

		Sessao sessao = new Sessao();
		int idSessao = sessao.create(1,1,18,1);
		sessao.update(1, "hora = 24");
		models.Sessao resultadoSessao = sessao.getById(idSessao);
		System.out.println(resultadoSessao.getHora());

		IngressoInteiro ingressoInteiro = new IngressoInteiro();
		int idIngressoInteiro = ingressoInteiro.create("2019-16-06", 45, idSessao);
		ingressoInteiro.update(idIngressoInteiro, "venda = '2019-15-05'");
		models.IngressoInteiro resultadoIngressoInteiro = ingressoInteiro.getById(idIngressoInteiro);
		System.out.println(resultadoIngressoInteiro.getPoltrona());

		/*while(true)
		{
			try {
				if (!result.next()) break;
				System.out.println(result.getString("titulo"));
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		db.close(conn);*/

		/*Controlador.cadastrarFilme(0, "avatar", "25/09/2010", 120, "12");
		System.out.println(Controlador.listaFilmes.get(0));

		Controlador.listaFilmes.get(0).setTitulo("ava");
		System.out.println(Controlador.listaFilmes.get(0).getTitulo());

		System.out.println(Controlador.buscarFilme("avatar"));

		//Teste para salvar sessao na lista
		Controlador.cadastrarSessao(0, 19, "ava", "dub", "2d");
		System.out.println(Controlador.listaSessoes.get(0).toString());*/
	}
}
