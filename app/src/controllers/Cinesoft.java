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
		Scanner sc = new Scanner(System.in);
		int opcao = 0;

		while(opcao != 9){
			System.out.println("------- C I N E S O F T -------");
			System.out.println(" Digite uma operação:");
			System.out.println(" (1) Cadastrar filme");
			System.out.println(" (2) Listar filme");
			System.out.println(" (3) Cadastrar sessão");
			System.out.println(" (4) Alterar sessão");
			System.out.println(" (5) Listar sessão");
			System.out.println(" (6) Vender ingresso");
			System.out.println(" (9) Sair");
			System.out.println(" Opcao: ");
			opcao = sc.nextInt();
			System.out.print("\033[H\033[2J");

			switch(opcao) {
				case 1:
					System.out.println("#  C A D A S T R A R  F I L M E  #");
					System.out.println(" Id do filme: ");
					int id = sc.nextInt();
					System.out.println(" Titulo do filme: ");
					String tit = sc.next();
					System.out.println(" Data de lançamento (dd/mm/aaaa): ");
					String datah = sc.next();
					System.out.println(" Duração (min): ");
					int dur = sc.nextInt();

					Filme filme = new Filme();
					int idfilme = filme.create(tit, datah, dur);

					break;

				case 2:
					System.out.println("#  L I S T A R  F I L M E  #");
					System.out.println(" Titulo: ");
					String titul = sc.next();
					Filme filmeh = new Filme();
					models.Filme resultadoFilme = filmeh.getByTitulo(titul);
					System.out.println(resultadoFilme.getTitulo());

					break;

				case 3:
					System.out.println("#  C A D A S T R A R  S E S S A O  #");
					System.out.println(" Id da sessão: ");
					int idS = sc.nextInt();
					System.out.println(" Hora da sessao (apenas numero): ");
					int hora = sc.nextInt();
					System.out.println(" Filme: ");
					int tits = sc.nextInt();
					System.out.println(" Idioma (dub ou leg): ");
					int idiomah = sc.nextInt();
					System.out.println(" Tela (2d ou 3d): ");
					int telahs = sc.nextInt();

					Sessao sessao = new Sessao();
					int idSessao = sessao.create(idiomah,telahs,hora,tits);

					break;

				case 4:
					System.out.println("#  A L T E R A R  S E S S A O  #");
					Sessao sessaoh = new Sessao();
					System.out.println(" Id da sessao: ");
					int idA = sc.nextInt();
					System.out.println(" Dado a alterar");
					System.out.println(" (1) Hora");
					System.out.println(" (2) Filme");
					System.out.println(" (3) Idioma");
					System.out.println(" (4) Tela");
					System.out.println(" Opcao: ");
					int op = sc.nextInt();

					if(op == 1){
						System.out.println(" Hora: ");
						int horah = sc.nextInt();
						sessaoh.update(idA, "hora = horah");
					} else if(op == 2) {
						System.out.println(" Filme: ");
						int idf = sc.nextInt();
						sessaoh.update(idA, "filme = idf");
					} else if(op == 3) {
						System.out.println(" Idioma: ");
						int idioms = sc.nextInt();
						sessaoh.update(idA,"idioma = idioms");
					} else if(op == 4) {
						System.out.println(" Tela: ");
						int telx = sc.nextInt();
						sessaoh.update(idA, "tela = telx");
					}

					break;

				case 5:
					System.out.println("#  L I S T A R  S E S S A O  #");
					System.out.println(" Id: ");
					int idSS = sc.nextInt();
					Sessao sessax = new Sessao();
					models.Sessao resultadoSessao = sessax.getById(idSS);
					System.out.println(resultadoSessao.getIdSessao());

					break;

				case 6:
					System.out.println("#  V E N D E R  I N G R E S S O  #");
					System.out.println(" Id: ");
					int idIng = sc.nextInt();
					System.out.prinln(" Inteiro ou meio (1 ou 2): ");
					int opIng = sc.nextInt();
					System.out.println(" Data: ");
					String dataIng = sc.next();
					System.out.println(" Id da sessão: ");
					int idSesIng = sc.next();
					System.out.println(" Poltrona: ");
					int pol = sc.nextInt();

					if(opIng == 1) {
						IngressoInteiro ingressoInteiro = new IngressoInteiro();
						int idIngressoInteiro = ingressoInteiro.create(dataIng, pol, idSesIng);
					} else if(opIng == 2) {
						System.out.println(" Carteirinha: ");
						String idCard = sc.next();
						IngressoMeio IngressoMeio = new IngressoMeio();
						int idIngressoMeio = IngressoMeio.create(dataIng, pol, idSesIng, idCard);
					}

					break;

				case 9:
					System.out.println("Volte sempre...");
					break;

				default:
					System.out.println("ERROR: OPCAO INVALIDA!!!");
					break;
			}
			System.out.print("\033[H\033[2J");
		}
		sc.close();
	}
}
