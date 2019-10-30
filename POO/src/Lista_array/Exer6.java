package Lista_array;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[3];
		int i = 0;
		
		while(i < 3) {
			System.out.print("Digite um número de 1 até 9: ");
			vetor[i] = teclado.nextInt();
			
				if(vetor[i] > 0 && vetor[i] < 10) {
					i++;
				}else {
					System.out.println("Entrada inválida!");
				}
		}	
		
		for( i = 0; i < vetor.length; i++) {
			System.out.println("-------- Tabuada " + vetor[i] + "-----------");
			for(int t = 0; t < 11; t++) {
				System.out.println(t + " x " + vetor[i] + " = " + (t * vetor[i]) );
			}
			
		}
		teclado.close();
	}

}
