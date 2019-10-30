package lista_string;

import java.util.Scanner;

public class exerciciostring2 {
	// CRIE  UM PROGRAMA  ONDEO  USUÁRIO  IRÁ  DIGITAR  UMA  FRASE.DEPOIS  O PROGRAMA DEVERÁ SOLICITAR QUE  O USUÁRIO  DIGITE  
	// UMA PALAVRA.OPROGRAMA  DEVE  APRESENTAR  A  FRASE  DIGITADA,A  PALAVRA DIGITADA,BEM COMO A QUANTIDADE DE VEZES QUE A PALAVRA DIGITADA APARECE NA FRASE

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			String frase = new String();
			String palavra = new String();
			String resultado[] = new String[20];
			int numero = 0;
			
			System.out.println("Digite a frase: ");
			frase = teclado.nextLine();
			
			
			System.out.println("Digite a palavra: ");
			palavra = teclado.next();
			
					
			
			if(frase.contains(palavra)){
				
				resultado = frase.split(" ");
				
				for(int i = 0; i < resultado.length; i++) {
					
					if(resultado[i].equals(palavra)) {
						
						numero += 1;							
						
					}
					
				}
				
				
				System.out.println("Contem " + numero + " vezes a palavra " + palavra);
				
			}else {
				System.out.println("Não contém");
			}
			
	
			
			
			teclado.close();
	}

}
