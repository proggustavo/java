package revisao;

import java.util.Scanner;

public class exerciciorevisao4 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			
			String[] nome = new String[3];
			int[] idade = new int[10];
			int max = 0;
			int soma = 0;
			float avg = 0;
			
			for(int i = 0; i < nome.length; i ++){
				
				System.out.print("Digite o nome " + (i + 1) + ": ");
				nome[i] = teclado.nextLine();
				
				System.out.print("Digite a idade " + (i + 1) + ": ");
				idade[i] = teclado.nextInt();
				
				teclado.nextLine();
				
				soma += idade[i]; 
				
				if(idade[i] > max ) {
					max = idade[i];
				}
				
			}
			
			avg = soma / idade.length;
			
			System.out.println("A soma das idades foi: " + soma);
			System.out.println("A média das idade foi: " + avg);
			
			teclado.close();
			
	}

}
