package exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
				
				
			System.out.print("Digite o tempo gasto (horas): ");
			int tempo = teclado.nextInt();
			
			System.out.print("Digite a velocidade média: ");
			float velocidade = teclado.nextFloat();
			
			System.out.print("Quanto o carro percorre com um litro? ");
			float kmLitro = teclado.nextFloat(); 
			
			float distancia = (velocidade * tempo);
			float consumo = (distancia / kmLitro);
			
			System.out.println("A distância percorrida foi: " + distancia);
			System.out.println("O consumo foi de: " + df.format(consumo) + " litros");
						
			teclado.close();

			
	}
	
	
}
