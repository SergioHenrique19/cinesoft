package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import models.*;

public class Controlador {
	// Listas de filmes e de sessoes
	protected static List<Filme> listaFilmes = new ArrayList<Filme>();
	protected static List<Sessao> listaSessoes = new ArrayList<Sessao>();
	
	// Metodo para cadastrar um filme na lista e no arquivo
	public static void cadastrarFilme(int idFilme, String titulo, String datah, int duracao, String classific) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ClassIndic classIndic = null;
		Date dataLancamento = sdf.parse(datah);
		
		switch(classific) {
			case "l":
				classIndic = ClassIndic.LIVRE;
				break;
			
			case "10":
				classIndic = ClassIndic.DEZ;
				break;
			
			case "12":
				classIndic = ClassIndic.DOZE;
				break;
			
			case "14":
				classIndic = ClassIndic.CATORZE;
				break;
			
			case "16":
				classIndic = ClassIndic.DEZESSEIS;
				break;
			
			case "18":
				classIndic = ClassIndic.DEZOITO;
				break;
			
			default:
				classIndic = null;
				break;
		}
		
		Filme f = new Filme(idFilme, titulo, dataLancamento, duracao, classIndic);
		listaFilmes.add(f);
	}
	
	// Funcao que busca filme pelo titulo na lista do mesmo
	public static Filme buscarFilme(String busca) {
		for(Filme filme : listaFilmes) {
			if(filme.getTitulo().equals(busca)) {
				return filme;
			}
		}		
		return null;
	}
	
	// Metodo para cadastrar uma sessao na lista e no arquivo
	public static void cadastrarSessao(int idSessao, int hora, String filmeh, String idiomah, String telah) {
		Filme filme = buscarFilme(filmeh);
		Idioma idioma = null;
		Tela tela = null;
		
		if(filme.equals(null)) {
			System.out.println("Filme nao encontrado...");
		}
		
		switch(idiomah) {
			case "dub":
				idioma = Idioma.DUBLADO;
				break;
			
			case "leg":
				idioma = Idioma.LEGENDADO;
				break;
			
			default:
				tela = null;
				break;
		}
		
		switch(telah) {
			case "2d":
				tela = Tela.DOIS_D;
				break;
			
			case "3d":
				tela = Tela.TRES_D;
				break;
			
			default:
				tela = null;
				break;
		}
		
		Sessao s = new Sessao(idSessao, hora, filme, idioma, tela);
		listaSessoes.add(s);
	}
	
	// Funcao para buscar sessao pelo id na lista do mesmo
	public static Sessao buscarSessao(int busca) {
		for(Sessao sessao : listaSessoes) {
			if(sessao.getIdSessao() == busca) {
				return sessao;
			}
		}		
		return null;
	}
	
	// Metodo para alterar sessao pelo id
	public static void alterarSessao(int id, int opcao) {
		Scanner sc = new Scanner(System.in);
		int ind = -1;
		
		for(Sessao sessao : listaSessoes) {
			if(sessao.getIdSessao() == id) {
				ind = listaSessoes.indexOf(sessao);
			}
		}
		
		switch(opcao) {
			case 1:
				System.out.println("Digite a nova hora: ");
				int nHora = sc.nextInt();
				listaSessoes.get(ind).setHora(nHora);
				break;
			
			case 2:
				System.out.println("Digite o titulo do filme: ");
				String ntitulo = sc.next();
				
				Filme nFilme = buscarFilme(ntitulo);
				listaSessoes.get(ind).setFilme(nFilme);
				break;
			
			case 3:
				System.out.println("Digite o idioma: ");
				String nIdiomah = sc.next();
				
				Idioma nIdioma = null;
				
				if(nIdiomah.equals("dub")) {
					nIdioma = Idioma.DUBLADO;
				} else {
					nIdioma = Idioma.LEGENDADO;
				}
				
				listaSessoes.get(ind).setIdioma(nIdioma);
			
			case 4:
				System.out.println("Digite a tela: ");
				String nTelah = sc.next();
				
				Tela nTela = null;
				
				if(nTelah.equals("2d")) {
					nTela = Tela.DOIS_D;
				} else {
					nTela = Tela.TRES_D;
				}
				
				listaSessoes.get(ind).setTela(nTela);
		}
	}
	
	// Metodo para remover sessao pelo id
	public static void removerSessao(int id) {
		int ind = -1;
		
		for(Sessao sessao : listaSessoes) {
			if(sessao.getIdSessao() == id) {
				ind = listaSessoes.indexOf(sessao);
			}
		}
		
		listaSessoes.remove(ind);
	}
}
