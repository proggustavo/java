package Lista_array;

import java.util.Random;

public class exe2 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int[] vetor = new int[10];
		int soma = 0;
		
		System.out.println("-------------------- Array --------------------");
		for(int i = 0; i < 10; i++) {
			
			vetor[i] = gerador.nextInt(100);
			
			System.out.print(vetor[i] + " ");
			
			soma += vetor[i];
		}
		
		System.out.println();
		System.out.println("-------------- Soma ---------------");
		System.out.println(soma);
		
		

	}

}
