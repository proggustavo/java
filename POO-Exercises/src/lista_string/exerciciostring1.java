package lista_string;

import java.util.Scanner;

public class exerciciostring1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// CRIEUM  PROGRAMA  QUE,A  PARTIR  DE  UM  TEXTO  DIGITADO  PELO  USUÁRIO,CONTE  O  NÚMERO DE PALAVRAS E EXIBA O RESULTADO.
			
		System.out.println("Digite uma frase");
		String frase = teclado.nextLine();
		
		

		String[] palavras = frase.split(" ");
	   
		System.out.println(palavras.length);
		
		
		
		
		teclado.close();
	}
	
	

}
