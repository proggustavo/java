package revisao;

import java.util.Random;

public class exerciciorevisao5 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
	// CRIE UM PROGRAMA QUE TENHA DUAS MATRIZES (A E B) DE INTEIROS COM DIMENSÕES 4 LINHAS POR 4 COLUNAS. 
	 // OS NÚMEROS DEVEM SER FORNECIDOS DE FORMA ALEATÓRIA. O PROGRAMA DEVERÁ CRIAR UMA TERCEIRA MATRIZ (SUBTRACAO) QUE DEVE CONTER 
	//	A SUBTRAÇÃO DA POSIÇÃO DOS ELEMENTOS DAS MATRIZES “A” E “B”.  APRESENTE OS VALORES DAS MATRIZES “A”, “B” E “SUBTRACAO”.	
		
		int[][] A = new int[4][4];
		int[][] B = new int[4][4];
		int[][] C = new int[4][4];
		
		
		for(int i = 0; i < A.length; i ++) {
			for(int j = 0; j < A[0].length; j++) {
				A[i][j] = gerador.nextInt(10);
				B[i][j] = gerador.nextInt(10);
				C[i][j] = A[i][j] - B[i][j];
			}
		}	
				
		System.out.println("-------- Matriz A ---------");
		for(int i = 0; i < A.length; i ++) {
			for(int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("-------- Matriz B ---------");
		for(int i = 0; i < B.length; i ++) {
			for(int j = 0; j < B[0].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("-------- Matriz C ---------");
		for(int i = 0; i < C.length; i ++) {
			for(int j = 0; j < C[0].length; j++) {
				if(C[i][j] < 0 || C[i][j] > 9) {
					System.out.print(C[i][j] + " ");
				}else {
					System.out.print(" " + C[i][j] + " ");
				}
				
			}
			System.out.println("");
		}
		

	}

}
