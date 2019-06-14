package cinesoft;

import java.util.Locale;
import java.util.Scanner;

import models.Filme;
import models.IngressoInteiro;
import models.Sessao;
import models.Vendedor;

public class Cinesoft {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int opcao = 1;
		
		while(opcao != 0) {
			System.out.println("------- C I N E S O F T -------");
			System.out.println("Digite a opção desejada: ");
			System.out.println(" (1) Cadastrar filme ");
			System.out.println(" (2) Cadastrar Sessao ");
			System.out.println(" (3) Cadastrar Funcionario ");
			System.out.println(" (4) Vender ingresso ");
			System.out.println(" (0) Sair\n");
			System.out.print(" Opcao: ");
			
			opcao = sc.nextInt();
			
			switch (opcao) {
				case 1:
					// Atributos de filme
					int idFilme;
					String titulo;
					String dataLancamento;
					int duracao;
					
					// Insercao de dados do filme
					System.out.print("\n\nDigite o id do filme: ");
					idFilme = sc.nextInt();
					sc.nextLine();
					System.out.print("Digite o titulo do filme: ");
					titulo = sc.nextLine();
					System.out.print("Digite a data de lancamento (dd/mm/yyyy): ");
					dataLancamento = sc.next();
					System.out.print("Digite o tempo de duracao (minutos): ");
					duracao = sc.nextInt();
					sc.nextLine();
					
					Filme f = new Filme(idFilme, titulo, dataLancamento, duracao);
					f.cadastrarFilme(idFilme, titulo, dataLancamento, duracao);
					
					break;
				
				case 2:
					// Atributos de sessao
					int idSessao;
					int hora;
					String dia;
					boolean idioma;
					boolean tela;
					
					// Insercao de dados da sessao
					System.out.print("\n\nDigite o id da sessao: ");
					idSessao = sc.nextInt();
					sc.nextLine();
					System.out.print("Digite a hora: ");
					hora = sc.nextInt();
					sc.nextLine();
					System.out.print("Digite o dia (dom ... sab): ");
					dia = sc.nextLine();
					System.out.print("Digite o titulo do filme: ");
					titulo = sc.nextLine();
					System.out.print("Indique o idioma do filme - true = dublado ou false = legendado: ");
					idioma = sc.nextBoolean();
					System.out.print("Indique a tela da sessao - true = 3D ou false = 2D: ");
					tela = sc.nextBoolean();
					
					Filme f1 = new Filme(titulo);
					Sessao s = new Sessao(idSessao, hora, dia, f1, idioma, tela);
					s.cadastraSessao(idSessao, hora, dia, f1, idioma, tela, titulo);
					
					break;
				
				case 3:
					// Atributos de vendedor
					int cpf;
					String nome;
					boolean sexo;
					String dataContrato;
					double salario;
					
					// Insercao de dados de vendedor
					System.out.print("\n\nDigite o CPF: ");
					cpf = sc.nextInt();
					sc.nextLine();
					System.out.print("Digite o nome: ");
					nome = sc.nextLine();
					System.out.print("Indique o sexo - true = feminino ou false = masculino: ");
					sexo = sc.nextBoolean();
					sc.nextLine();
					System.out.print("Digite a data de contratacao (dd/mm/yyyy): ");
					dataContrato = sc.next();
					System.out.print("Digite o salario (R$): ");
					salario = sc.nextDouble();
					
					Vendedor v = new Vendedor(cpf, nome, sexo, dataContrato, salario);
					v.cadastrarVendedor(cpf, nome, sexo, dataContrato, salario);
					
					break;
				
				case 4:
					// Atributos de ingresso
					int idIngresso;
					String dataVenda;
					boolean tipoIngresso;
					int qtdPoltronas;
					double total;
					
					// Insercao dos dados de ingresso
					System.out.print("Digite o id do ingresso: ");
					idIngresso = sc.nextInt();
					sc.nextLine();
					System.out.print("Digite a data da venda (dd/mm/yyyy): ");
					dataVenda = sc.next();
					System.out.print("Digite o id da sessao: ");
					idSessao = sc.nextInt();
					sc.nextLine();
					System.out.print("Digite o nome do vendedor: ");
					nome = sc.nextLine();
					System.out.print("Indique o tipo do ingresso - true = inteira ou false = meia: ");
					tipoIngresso = sc.nextBoolean();
					sc.nextLine();
					System.out.print("Digite a quantidade de poltrona: ");
					qtdPoltronas = sc.nextInt();
					sc.nextLine();
					
					// Calcular valor total da venda
					if (tipoIngresso == false) {
						total = (24 * qtdPoltronas) / 2.0;
					} else {
						total = (24 * qtdPoltronas);
					}
					
					Sessao s1 = new Sessao(idSessao);
					Vendedor v1 = new Vendedor(nome);
					
					IngressoInteiro t = new IngressoInteiro(idIngresso, dataVenda, s1, v1, tipoIngresso, qtdPoltronas, total);
					t.venderIngresso(idIngresso, dataVenda, s1, v1, tipoIngresso, qtdPoltronas, total, nome, idSessao);
					
					break;
					
				case 0:
					System.out.println("Ate a proxima...");
					break;
	
				default:
					System.out.println("Opcao invalida...");
					break;
			}
		}
		
		sc.close();
	}
}
