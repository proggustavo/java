package revisao;

import java.util.Scanner;

public class exerciciorevisao3 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			
			int[] numeros = new int[3];
			
			for(int i = 0; i < numeros.length; i++) {
				
				System.out.println("Digite um número entre 1 e 9: ");
				numeros[i] = teclado.nextInt();
				
				while(numeros[i] > 9 || numeros[i] < 1) {
						System.out.println("Número inválido. Tente novamente com um número entre 1 e 9: ");
						numeros[i] = teclado.nextInt();
				}
				
				
			}
			
			for(int i = 0; i < numeros.length; i ++) {
				System.out.println(numeros[i]);
			}
			
			teclado.close();
		
		
		
	}

}
