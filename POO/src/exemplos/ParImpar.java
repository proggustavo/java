package exemplos;

import java.util.Scanner;


public class ParImpar { //on the class name the first letter of each word is uppercase
		 	
		public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in);
			
			System.out.print("Digite um número: ");
			int numero = teclado.nextInt(); 
			
		if (numero % 2 == 0) { // the comparer signal is represented by two == like "=="
			System.out.println("O número é par!");
			
		} else {
			System.out.println("Número é impar");
				}
		
		teclado.close();
		
	}

}
