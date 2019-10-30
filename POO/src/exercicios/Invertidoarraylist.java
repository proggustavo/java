package exercicios;

import java.util.*;

public class Invertidoarraylist {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
			
			 	
			int continuar = 0;
			ArrayList<String> atletas = new ArrayList<String>();;
			
			System.out.println("Digite 1 para continuar: ");
			continuar = teclado.nextInt();
			
			
			while(continuar == 1) {
				System.out.println("Digite o nome do Atleta: ");
				String nome = teclado.next();
				atletas.add(nome);
				System.out.println("Digite 1 para continuar: ");
				continuar = teclado.nextInt();
				
			}
			
			System.out.println(atletas);
			
			//imprimir por posição
			
			System.out.println(atletas.get(2));
			
			
			
			teclado.close();

	}

}
