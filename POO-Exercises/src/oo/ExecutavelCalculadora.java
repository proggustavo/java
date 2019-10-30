package oo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExecutavelCalculadora {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		CalculadoraCientifica cal = new CalculadoraCientifica();
		
				double n1 = 0;
				double n2 = 0;
					

				System.out.println("Calculadora");
				System.out.println("1 - Adi��o ");
				System.out.println("2 - Subtra��o");
				System.out.println("3 - Multiplica��o");
				System.out.println("4 - Divis�o");
				System.out.println("5 - Seno");
				System.out.println("6 - Cosseno");
				System.out.println("0 - Para sair");
				System.out.print("Digite uma op��o: ");
				int opcao = teclado.nextInt();
				
				
					if(opcao <5) {
						System.out.print("Digite o primeiro n�mero: ");
						n1 = teclado.nextDouble();
						
						System.out.print("Digite o segundo valor: ");
						n2 = teclado.nextDouble();	
					}else {
						System.out.print("Digite o �ngulo: ");
						n1 = teclado.nextDouble();
						
					}
				
			
				switch(opcao) {						
				case 1: {
					System.out.print("Resultado: " + cal.somar(n1, n2));
					break;
				}
				case 2: {					
					System.out.print("Resultado: " + cal.subtrair(n1, n2));					
					break;
				}
				case 3: {
					System.out.print("Resultado: " + cal.multiplicar(n1, n2));
					break;
				}
				case 4: {
					System.out.print("Resultado: " + df.format(cal.dividir(n1, n2)));
					break;
				}
				case 5: {
					System.out.print("Resultado: " + df.format(cal.seno(n1)));
					break;
				}
				case 6: {
					System.out.print("Resultado: " + df.format(cal.cosseno(n1)));
					break;
				}
				default: {
					System.out.println("Op��o inv�lida!");
				}
				
				}
		
			teclado.close();
		
	}
}
