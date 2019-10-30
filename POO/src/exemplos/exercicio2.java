package exemplos;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float soma = 0, numero = 0;
		
		for(int cont = 0; cont < 2; cont++ ) {
			
			System.out.print("Digite o número: ");
			numero = ler.nextFloat();
			
			soma += numero;
		}
		
		System.out.println(soma);	
		
		ler.close();
		
		
			
	}
}
