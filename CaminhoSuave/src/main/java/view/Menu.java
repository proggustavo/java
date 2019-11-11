package view;

import java.util.Scanner;

public class Menu {
	
	Scanner teclado = new Scanner(System.in);
	
	private static final int CADASTRAR_ALUNO = 1;
	private static final int SAIR = 9;
	
	public void apresentarMenu() {
		int opcao = this.apresentarOpcoesMenu();
		
		while(opcao != SAIR) {
			switch(opcao) {
				case CADASTRAR_ALUNO: {
						Aluno a = new Aluno();
						a.cadastrarAluno();
						
				break;		
				}
				default: {
					System.out.println("Opção inválida!");
					break;
				}
			}
			
			
			opcao = this.apresentarOpcoesMenu();
		}
		
	}
	
	
	
	
	private int apresentarOpcoesMenu() {
		System.out.println("\n------------------ SISTEMA CURSO CAMINHO SUAVE ------------------");
		System.out.println(CADASTRAR_ALUNO + " - Cadastrar aluno");
		System.out.println(SAIR + " - Sair");
		System.out.print("\nEscolha a opção: ");
		return Integer.parseInt(teclado.nextLine());
	}
	
	
	

}
