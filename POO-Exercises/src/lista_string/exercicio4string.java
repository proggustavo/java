package lista_string;

import java.util.Scanner;

public class exercicio4string {

	public static void main(String[] args) {

		//CRIE   UM   PROGRAMA ONDE   O   USU�RIO   IR�   DIGITAR   UMA PALAVRAE  APRESENTE  AS   SEGUINTES INFORMA��ES:A)
		//ON�MERO DE CARACTERES DA PALAVRA.B)APALAVRACOM TODAS SUAS LETRAS EM MAI�SCULO.C)ON�MERO DEVOGAIS DA PALAVRA.D)SE A 
		//PALAVRADIGITADA COME�A COMUM TERMO A SER DIGITADO PELO USU�RIOE)SE A PALAVRADIGITADA 
		//TERMINA COM UM TERMO A SER DIGITADO PELO USU�RIO
		
		Scanner teclado = new Scanner(System.in);
		
		int vogal = 0;
		
		System.out.println("Digite uma palavra: ");
		String palavra = teclado.nextLine();
		
		palavra = palavra.toLowerCase();
		
		char[] letras = palavra.toCharArray();
		
		System.out.println("O n�mero de caracteres �: " + letras.length);
		System.out.println("Mai�sculo: " + palavra.toUpperCase());
		
		
		//contando vogais 
		
			for(int i = 0; i < letras.length; i ++) {
				if(letras[i] == 'a' | letras[i] == 'e' | letras[i] == 'i' | letras[i] == 'o' | letras[i] == 'u' ) {
					vogal += 1;
				}
			}
			
		System.out.println("A palavra tem " + vogal  + " vogais");
		
		
		
		System.out.println("------------------------------------");
		System.out.println("Digite um termo para verificar se inicia ou termina com ele: ");
		String termo = teclado.nextLine();
		
		boolean inicia = palavra.startsWith(termo);
		boolean termina = palavra.endsWith(termo);

		if(inicia) {
			System.out.println("Inicia com o termo ");
		}if(termina) {
			System.out.println("Termina com o termo");
		}else if(termina && inicia){
			System.out.println("N�o inicia nem termina com o termo");
		}
		
		
		
		
		teclado.close();
	}

}
