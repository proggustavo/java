package Lista_array;

import java.util.Random;

public class Exer5 {
	
	public static void main(String[] args) {
		Random gerador = new Random();
		
		int[] origem = new int[10];
		int[] resultado = new int[10];
		
		for(int i = 0; i < 10;  i++) {
			origem[i] = gerador.nextInt(10) + 1;
			
			if(origem[i] % 2 == 0){
				
				resultado[i] = 1;
			}else {
				resultado[i] = 0;
			}
		
		}
		
		System.out.println("------------------ Números --------------");
		
		for(int i = 0; i < 10; i++){
			System.out.print(origem[i] + " ");
		}
		System.out.println();
		
		System.out.println("----------------- Resultados -------------");
		
		for(int i = 0; i < 10; i++){
			System.out.print(resultado[i] + " ");
			
		}
		
	}

}
