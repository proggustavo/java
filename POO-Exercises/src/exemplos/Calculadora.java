package exemplos;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Calculadora");
		System.out.println("1 - Adição ");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("0 - Para sair");
		System.out.print("Digite uma opção: ");
		int opcao = ler.nextInt();
		
		while(opcao != 0) {
				
					System.out.print("Digite o primeiro número: ");
					double numero1 = ler.nextDouble();
					System.out.print("Digite o segundo número: ");
					double numero2 = ler.nextDouble();
					System.out.println("--------------------------");
			switch(opcao) {						
				case 1: {
					System.out.println("Resultado: " +(numero1 + numero2));
					break;
				}
				case 2: {
					
					System.out.println("Resultado: " + (numero1 - numero2));
					break;
				}
				case 3: {
					System.out.println("Resultado: " + (numero1 * numero2));
					break;
				}
				case 4: {
					System.out.println("Resultado: " + (numero1 / numero2));
					break;
				}
				case 5: {
					break;
				}
				default: {
					System.out.println("Opção inválida!");
				}
				
				
			}
			
			System.out.println("Calculadora");
			System.out.println("1 - Adição ");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("0 - Para sair");
			System.out.print("Digite uma opção: ");
			opcao = ler.nextInt();
			
		}
		System.out.println("Programa finalizado!");
		
		ler.close();
	}

}
