package Lista_array;

import java.util.Random;

public class Lista_Array {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int[] vetor = new int [10];
		
		System.out.println("---------------Array----------------------");
		
		int pares = 0;
		
		for(int i =0; i < 10; i ++) {
			vetor[i] = gerador.nextInt(26);
			System.out.print(vetor[i] + " ");
			if( vetor[i] % 2 == 0){
				pares += 1;
				
			}
			
			
		}
		System.out.println();
		
		System.out.println("----------------------------------");
		
		System.out.print("Pares= " + pares);
		
		
	
	}

}
