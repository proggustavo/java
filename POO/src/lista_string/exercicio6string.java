package lista_string;

import java.util.Scanner;

public class exercicio6string {

	public static void main(String[] args) {
		//CRIE UM  PROGRAMA QUE DADO  UM TEXTO  DIGITADO  PELO USUÁRIO O  PROGRAMA TROQUETODAS  AS OCORRÊNCIAS DE UMA PALAVRA POR OUTRA.
		//PARA ISSO O USUÁRIO DEVERÁ DIGITAR O TEXTO,A PALAVRA A SER PROCURADA  E A  PALAVRA  PARA  SER  TROCADA. 
		//AO  FINAL  O  PROGRAMA  DEVE  MOSTRAR  O TEXTO  ORIGINAL,
		//O NOVO TEXTO E INFORMAR QUANTAS OCORRÊNCIAS DE TROCA OCORRERAM.
		
		
		Scanner teclado = new Scanner(System.in);
		
		int vezespesquisa = 0;
		 

		System.out.print("Digite um texto: ");
		String texto = teclado.nextLine();
		
		System.out.print("Digite a palavra que quer procurar: ");
		String palavrapesquisa = teclado.nextLine();
		
		System.out.print("Digite por qual palavra quer trocar: ");
		String palavranova = teclado.nextLine();
		
		
		System.out.println("Original: " + texto);		
		while(texto.contains(palavrapesquisa)) {
					texto = texto.replaceFirst(palavrapesquisa, palavranova);
					vezespesquisa += 1;
				}
			
			//trocando a palavra e printando o novo texto
				
			String textonovo = texto.replaceAll(palavrapesquisa, palavranova);
			System.out.println("Modificada: " + textonovo);
			
			System.out.println("Ocorrências: " + vezespesquisa);
		
		
		
	
		
		teclado.close();
	}
	
}
