package controllers;

import java.sql.ResultSet;
import java.text.ParseException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import controllers.Controlador;
import models.*;
import repository.Database;

public class Cinesoft {
	public static void main(String[] args) throws ParseException {
		Database db = new Database();
		Connection conn = db.open();
		//db.insert(conn, "filmes", "titulo, lancamento, duracao", "'Avatar', '2009-05-01', 180");
		//ResultSet result = db.select(conn, "*", "filmes");
		//ResultSet result = db.select(conn, "*", "filmes", "id == 1");
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
