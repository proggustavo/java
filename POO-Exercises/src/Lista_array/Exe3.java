package Lista_array;

import java.util.Random;

public class Exe3 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int[] vetor = new int[10];
		int soma = 0;
		float media = 0;
		int contimpar = 0;
		
		System.out.println("-------------- Array ----------");
		for(int i = 0; i < 10; i++) {
			vetor[i] = gerador.nextInt(100);
			
			System.out.print(vetor[i] + " ");
			if(vetor[i] % 2 == 1){
				soma += vetor[i];
				contimpar += 1;
			}
			
		}		
		System.out.println();
		System.out.println("-------------------------------");
		 media = soma /  contimpar;
		System.out.println(media);
	}

}
