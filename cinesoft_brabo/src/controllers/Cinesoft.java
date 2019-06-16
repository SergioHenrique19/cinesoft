package controllers;

import java.text.ParseException;

import controllers.Controlador;
import models.*;

public class Cinesoft {
	public static void main(String[] args) throws ParseException {
		// Teste para salvar filme na lista
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
