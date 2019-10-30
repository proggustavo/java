package exemplos;
import java.util.Scanner;

public class exercicio {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int nota = 10;
		float vetor[] = new float[nota];
		float totnotas = 0;
		float media = 0;
		int menor = 0;
	
		for (int cont = 0; cont < nota; cont++ ) {
		System.out.print("Digite a nota do aluno: ");
		
		vetor[cont] = ler.nextFloat(); 

			
		totnotas = totnotas + vetor[cont];
		
		}
				
		media = totnotas / nota;
		
		for (int cont = 0; cont < nota; cont++ ) {
			 if(vetor[cont] < media)
				 menor++;
		}
		
				
		System.out.println(media);
		System.out.println(menor);
		System.out.println(menor * 100 / nota);
		
		ler.close();
	}
	
	
}
