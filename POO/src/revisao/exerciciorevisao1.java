package revisao;

import java.util.Random;

public class exerciciorevisao1 {

	public static void main(String[] args) {
			Random gerador = new Random();
				
			int resultado = 0;
			
			System.out.println("Jogando dados: ");
			
			for(int i = 0; i < 10; i ++) {
				resultado = gerador.nextInt(6) + 1;
				
			}
			
			System.out.println(resultado);
	}

}
