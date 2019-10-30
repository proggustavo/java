package exercicios;

import java.util.Scanner;

public class IronMan {

	public static void main(String[] args) {
				Scanner teclado = new Scanner(System.in);
		
				int[] posicao = new int[20];
				int i = 0;
				int resposta = 0;
				String[] atletas = new String[20]; 
				
				
				System.out.println("Para registrar digite 1 ( 0 para sair)");
				resposta = teclado.nextInt();
					
				while(resposta == 1 ){
					
									
					System.out.println("Digite a posição do atleta");
					posicao[i] = teclado.nextInt();
					teclado.nextLine();
					System.out.println("Digite o nome do atleta:");
					atletas[i] = teclado.next();
					
					System.out.println("Para registrar digite 1 ( 0 para sair)");
					resposta = teclado.nextInt();
					i += 1;
					
				}
				System.out.println("Programa finalizado!");
				
				for(int j = 0; j < atletas.length; j++ ) {
					
						if(atletas[j] != null) {
							System.out.println("Atleta: " + atletas[j] + " na posição " + posicao[j]);	
						}					 					
					
				}
				
				
				
				teclado.close();

	}

}
