package Lista_array;

import java.text.DecimalFormat;

import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
			
		float[] nota1 = new float[5];
		float[] nota2 = new float[5];
		String[] aluno = new String[5];
		float[] media = new float[5];
	
		for(int i = 0; i < 5; i ++) {
			System.out.print("Digite o nome do aluno " + (i + 1) + ":");
			aluno[i] = teclado.next();
			System.out.print("Digite a primeira nota: ");
			nota1[i] = teclado.nextFloat();
			System.out.print("Digite a segunda nota: ");
			nota2[i] = teclado.nextInt();
			teclado.nextLine();
			
		}
		
		System.out.println("------------ Resultado -------------");
		for(int i = 0; i < 5; i++) {
			System.out.print("Aluno " + (i + 1) + " - ");
			media[i] = (nota1[i] + nota2[i]) / 2;
			
			System.out.print("Média: "+ media[i] + df.format(media));
			
			if(media[i] >= 7){
				System.out.print(" Situação: Aprovado! ");
			}else {
				System.out.print(" Situação: Reprovado! ");
			}
			System.out.println();
		}
		teclado.close();// evitar erros de string -- teclado.nextLine();

	}

}
