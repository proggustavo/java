package Lista_array;

import java.util.Random;

public class Exer7 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int j = 0;
		for(int i = 0; i < 10; i++) {
			vetorA[i] = gerador.nextInt(9) + 1; 
			
		}

		 for (int i = vetorA.length - 1; i >= 0; i--) {
		         vetorB[j] = vetorA[i];
		            j++;		    
		    }

		System.out.println("---------- Vetor A ----------");
		for(int i = 0; i < 10; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("---------- Vetor B -----------");
		for(int i = 0; i < 10; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
	}

}
