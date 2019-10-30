package exemplos;

import java.util.Scanner;

public class EstruturasJava {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
		
		int numero = 0;
		int resultado = 0;
		int interacoes = 0;
		
		System.out.print("Digite o número de interações: ");
		interacoes = ler.nextInt();
		
		for(int i = 0; i < interacoes; i++) {
			
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			
			if( numero % 2 ==0 ) {
				resultado = (resultado + i) * 2;
			}else
				resultado = (resultado + i) * 3;
		}
		
		System.out.println("Resultado: " + resultado);
		
		ler.close();
	}
	
	


}
