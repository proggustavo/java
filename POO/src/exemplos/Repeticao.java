package exemplos;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			System.out.print("Digite um n�mero: ");
			int numero = teclado.nextInt();
			
			for(int i = 0; i < 10; i++ ) { // (declara contador, condi��o, "passo" da vari�vel
				numero = numero + i;		
			}
			teclado.close();
			System.out.println(numero);
			
			if (numero % 2 == 0) {
				System.out.println("O n�mero � par!");
			}else {
				System.out.println("O n�mero � �mpar!");
			}
	}

}


