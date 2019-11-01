package estruturadedados;

public class Bubblesort {

	public static void main(String[] args) {
		
		
		int numeros[] = new int[100000];
		int aux = 0;
		
		for(int i = 0; i < numeros.length; i ++) {
			numeros[i] = (int) (Math.random() * 100);
		}
		  long tempoInicial = System.currentTimeMillis();
		
		
		System.out.println("Lista desordenada");
		for(int i = 0; i < numeros.length;i ++ ) {
			System.out.print(numeros[i] + ", ");
		}
		
		
		for(int i = 0; i < numeros.length; i++ ) {
			for(int j = 0; j < (numeros.length - 1); j ++) {
				if(numeros[j] > numeros[j + 1] ) {
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}
		}
		
		long tempoFinal = System.currentTimeMillis();
		System.out.println("");
		System.out.println("Lista ordenada");
		for(int i = 0; i < numeros.length;i ++ ) {
			System.out.print(numeros[i] + ", ");
		}
		System.out.println("");
		System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
	}

}
