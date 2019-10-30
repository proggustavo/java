package revisao;

import java.util.Random;

public class exerciciorevisao2 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int[] numeros = new int[5];
		int[] numeros2 = new int[5];
		
		
		for(int i = 0; i < numeros.length; i ++) {
			
			numeros[i] = gerador.nextInt(101);
		}
		
		
		for(int i =0; i < numeros.length; i ++) {
			if(numeros[i] % 2 == 0) {
				
				numeros2[i] = numeros[i] * 2;
				System.out.println("Par: " + numeros[i] + " - " + numeros2[i]);
			}else {
				
				numeros2[i] = numeros[i] * 3;
				System.out.println("Impar: " + numeros[i] + " - " + numeros2[i] );
			}
			
			
			System.out.println(numeros[i]);
			
		}
		
		
		
		
	}

}
