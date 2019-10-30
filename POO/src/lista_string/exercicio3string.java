package lista_string;

import java.util.Scanner;

public class exercicio3string {
	// CRIE  UM  PROGRAMA ONDE  O  USUÁRIO  IRÁ  DIGITAR  UMA  FRASEE  O PROGRAMA IRÁ  CONTABILIZAR A QUANTIDADE   DE   CADA   VOGALDA   
	// FRASEDIGITADA.CONSIDERE   QUE A   FRASE   NÃO   POSSUA   NENHUMA ACENTUAÇÃO.PORFIM APRESENTE A FRASEE A QUANTIDADE DE CADA VOGAL

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String frase = new String();
		int a = 0;
		int e = 0;
		int ii = 0;
		int o = 0;
		int u = 0;		
		
		System.out.println("Digite a frase");
		frase = teclado.nextLine();
		
		frase.toLowerCase();
		
		char[] letras = new char[frase.length()];
		letras = frase.toCharArray();
		
		
		for(int i = 0; i < letras.length; i ++) {
			
			
			if(letras[i] == 'a'){
				
				a += 1;
				
			}else if(letras[i] == 'e'){
				e += 1;
			}else if(letras[i] == 'i'){
				ii += 1;
			}else if(letras[i] == 'o'){
				o += 1;
			}else if(letras[i] == 'u'){
				u += 1;
			}
			
			
			
		}
		System.out.println("Vogal A: " + a );
		System.out.println("Vogal E: " + e );
		System.out.println("Vogal I: " + ii );
		System.out.println("Vogal O: " + o );
		System.out.println("Vogal U: " + u );
		
		teclado.close();
		
		

	}

}
