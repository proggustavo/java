package exercicios;

import java.util.Random;

public class grafo {

	public static void main(String[] args) {
		Random gerador = new Random();

		
			int[][] grafo = new int[4][4];
			
			
			for( int i = 0; i < grafo.length; i ++) {
				for(int j = 0; j < grafo[i].length; j ++) {
					if(i != j) {
						grafo[i][j] = gerador.nextInt(9) + 1;
						grafo[j][i] = grafo[i][j];
					}else {
						grafo[i][j] = 0;
					}
					
				}
			}
			
			for( int i = 0; i < grafo.length; i ++) {
				for(int j = 0; j < grafo[i].length; j ++) {
					System.out.print(grafo[i][j] + " ");
					
				}
				System.out.println(" ");
			}
			
			System.out.println("Gustavo Rodrigues, Adrian, João Arthur, Lucas Gomes, Eduardo Da Costa");
			System.out.println("É us guri");
	}

}
