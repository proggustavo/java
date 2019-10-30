package exemplos;

import java.util.Random;

public class Matrizes {

	public static void main(String[] args) {
		Random gerador = new Random();
	
		int[][] matrizA= new int[3][3];
		int[][] matrizB = new int[3][3];
		int[][] resultado = new int[3][3];
		
		// Atribuindo random na matriz
		
		System.out.println("---------MATRIZ A-----------");
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				
				matrizA[i][j]= gerador.nextInt(9) + 1;
				System.out.print(matrizA[i][j] + " ");
				
			}
			System.out.println();
		}
		
		// Print matrizA
		/*
		System.out.println("---------MATRIZ A-----------");
		for(int i = 0; i < matrizA.length; i++) {
			for(int j= 0; j < matrizA[i].length; j ++) {
				
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		
		*/
		
		// Atribuindo random matrizB
		
		System.out.println("---------MATRIZ B-----------");	
		for(int i = 0; i < matrizB.length; i++) {
			for( int j = 0; j < matrizB[i].length; j++) {
				
				matrizB[i][j] = gerador.nextInt(9) + 1;
				
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
		
		//Print matrizB
		/*
		System.out.println("---------MATRIZ B-----------");
		for(int i = 0; i < matrizB.length; i ++) {
			for( int j= 0; j < matrizB[i].length; j ++) {
				
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
	*/
		
		// Somando resultado 
		
		System.out.println("---------RESULTADO-----------");
		for(int i = 0; i < resultado.length; i++) {
			for( int j =0; j < resultado[i].length; j++ ) {
				
				resultado[i][j] = matrizA[i][j] + matrizB[i][j];
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}
		
		//Printando resultado
		/*
		System.out.println("---------RESULTADO-----------");
		for(int i =0; i < resultado.length; i++) {
			for(int j = 0; j < resultado[i].length; j++) {
				if(resultado[i][j] < 10) {
					System.out.print("0" +resultado[i][j] + " ");
				}else {
					System.out.print(resultado[i][j] + " ");
				}
				
			}
			System.out.println();
		}
		*/
	
		
		
	}

}
