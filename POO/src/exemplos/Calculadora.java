package exemplos;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Calculadora");
		System.out.println("1 - Adi��o ");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		System.out.println("0 - Para sair");
		System.out.print("Digite uma op��o: ");
		int opcao = ler.nextInt();
		
		while(opcao != 0) {
				
					System.out.print("Digite o primeiro n�mero: ");
					double numero1 = ler.nextDouble();
					System.out.print("Digite o segundo n�mero: ");
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
					System.out.println("Op��o inv�lida!");
				}
				
				
			}
			
			System.out.println("Calculadora");
			System.out.println("1 - Adi��o ");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("0 - Para sair");
			System.out.print("Digite uma op��o: ");
			opcao = ler.nextInt();
			
		}
		System.out.println("Programa finalizado!");
		
		ler.close();
	}

}
