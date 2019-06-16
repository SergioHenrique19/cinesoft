/* Trabalho Final de PLP (2019/01)
 * Este codigo a interacao com o usuario.
 * Desenvolvido por: Gabriel Peruzza, João Salgado, Otavio Lima e Sérgio Garcia */

package controllers;

import java.text.ParseException;
import java.util.Scanner;
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
		Scanner sc = new Scanner(System.in);
		int opcao = 0;

		while(opcao != 9) {
			System.out.println("------- C I N E S O F T -------");
			System.out.println(" Digite uma operação:");
			System.out.println(" (1) Cadastrar filme");
			System.out.println(" (2) Listar filmes");
			System.out.println(" (3) Cadastrar sessão");
			System.out.println(" (4) Alterar sessão");
			System.out.println(" (5) Listar sessões");
			System.out.println(" (6) Deletar sessão");
			System.out.println(" (7) Vender ingresso");
			System.out.println(" (9) Sair");
			System.out.println(" Opcao: ");
			opcao = sc.nextInt();

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
					System.out.println(" Classificação indicativa: ");
					String cf = sc.next();

					Controlador.cadastrarFilme(id, tit, datah, dur, cf);

					break;

				case 2:
					System.out.println("#  L I S T A R  F I L M E S  #");

					for(Filme filme : Controlador.listaFilmes) {
						System.out.println(filme);
					}

					break;

				case 3:
					System.out.println("#  C A D A S T R A R  S E S S A O  #");
					System.out.println(" Id da sessão: ");
					int idS = sc.nextInt();
					System.out.println(" Hora da sessao (apenas numero): ");
					int hora = sc.nextInt();
					System.out.println(" Filme: ");
					String tits = sc.next();
					System.out.println(" Idioma (dub ou leg): ");
					String idiomah = sc.next();
					System.out.println(" Tela (2d ou 3d): ");
					String telahs = sc.next();

					Controlador.cadastrarSessao(idS, hora, tits, idiomah, telahs);

					break;

				case 4:
					System.out.println("#  A L T E R A R  S E S S A O  #");
					System.out.println(" Id da sessao: ");
					int idA = sc.nextInt();
					System.out.println(" Dado a alterar");
					System.out.println(" (1) Hora");
					System.out.println(" (2) Filme");
					System.out.println(" (3) Idioma");
					System.out.println(" (4) Tela");
					System.out.println(" Opcao: ");
					int op = sc.nextInt();

					Controlador.alterarSessao(idA, op);

					break;

				case 5:
					System.out.println("#  L I S T A R  S E S S O E S  #");

					for(Sessao sessao : Controlador.listaSessoes) {
						System.out.println(sessao);
					}

					break;

				case 6:
					System.out.println("#  D E L E T A R  S E S S A O  #");
					System.out.println(" Id da sessao: ");
					int idD = sc.nextInt();

					Controlador.removerSessao(idD);

					break;

				case 7:
					System.out.println("#  V E N D E R  I N G R E S S O  #");
					System.out.println(" Tipo de ingresso - Inteira (1) ou Meio (2): ");
					int opI = sc.nextInt();

					int idI, idIS, pol = 0;
					String dataI = "";

					System.out.println(" Id do ingresso: ");
					idI = sc.nextInt();
					System.out.println(" Data: ");
					dataI = sc.next();
					System.out.println(" Id da sessao: ");
					idIS = sc.nextInt();
					System.out.println(" Poltrona: ");
					pol = sc.nextInt();

					if(opI == 1) {
						Controlador.cadastrarIngrInt(idI, dataI, idIS, pol);
					} else if(opI == 2) {
						System.out.println(" Carteirinha (id_jovem, estudante, fidelidade): ");
						String card = sc.next();

						Controlador.cadastrarIngrMeio(idI, dataI, idIS, pol, card);
					} else {
						System.out.println("Opcao invalida...");
					}

					break;

				case 9:
					System.out.println("Volte sempre...");

					break;

				default:
					System.out.println("ERROR: OPCAO INVALIDA!!!");
					break;
			}
		}

		sc.close();
	}
}
