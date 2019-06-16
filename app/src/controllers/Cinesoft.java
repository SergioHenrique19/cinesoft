package controllers;

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
		Connection c = db.open();

		Controlador.cadastrarFilme(0, "avatar", "25/09/2010", 120, "12");		
		System.out.println(Controlador.listaFilmes.get(0));
		
		Controlador.listaFilmes.get(0).setTitulo("ava");
		System.out.println(Controlador.listaFilmes.get(0).getTitulo());
		
		System.out.println(Controlador.buscarFilme("avatar"));
		
		//Teste para salvar sessao na lista
		Controlador.cadastrarSessao(0, 19, "ava", "dub", "2d");
		System.out.println(Controlador.listaSessoes.get(0).toString());
	}
}
