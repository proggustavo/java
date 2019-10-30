package exercicios;

import java.util.Random;
import java.util.Scanner;
import  java.lang.Thread;

public class ExercicioFrutas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
				
		String[] frutas = new String[6];
			
		int nsaladas = 0;
					
		for( int i = 0; i < frutas.length; i++) {
		
			System.out.print("Informe o nome da fruta " + (i + 1) + ": ");
			frutas[i] = teclado.next();
		}
		
			System.out.print("Você quer quantas saladas de frutas? ");
			nsaladas = teclado.nextInt();
			
						
			try {
					System.out.println("Fazendo a salada de frutas...");				
					Thread.sleep(3000);
			  } catch (InterruptedException e) {
				   e.printStackTrace();
			  	}
						
		
		for(int i = 0; i < nsaladas; i++){
			System.out.println("------- " + (i + 1) + "ª Salada de frutas ---------");
			for(int j = 0; j < 3; j++) {
			
				System.out.println(frutas[gerador.nextInt(5)]);
			
			}
			
		}
				
		teclado.close();
			
		
	}

}
