package lista_string;

import java.util.Scanner;

public class exercicio5string {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String palavra = new String();
		
		System.out.println("Digite um verbo: ");
		String verbo = teclado.nextLine();
		
		
		boolean termina = verbo.endsWith("ar");
		
		if(termina){
			System.out.println("Termina");
			
			
			palavra = verbo.substring(0, verbo.lastIndexOf("ar"));
			
			
		}else {
			System.out.println("N�o � verbo");
		}
		
		System.out.println("Eu " + palavra + "o" );
		System.out.println("Tu " + palavra + "as");
		System.out.println("Ele " + palavra + "a");
		System.out.println("N�s " + palavra + "amos");
		System.out.println("V�s " + palavra + "ais");
		System.out.println("Eles " + palavra + "am");
		
		
		System.out.println("----------Outra op��o ---------");
	
		
		
		teclado.close();

	}

}
