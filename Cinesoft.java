package cinesoft;

import java.util.Locale;
import java.util.Scanner;

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
					break;
				
				case 2:
					break;
				
				case 3:
					break;
				
				case 4:
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
