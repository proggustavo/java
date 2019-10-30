package exemplos;

public class string {

	public static void main(String[] args) {
			
		String disciplina = new String();
		disciplina = "Olá tudo bem:";
		
		System.out.println(disciplina);
		System.out.println(disciplina.length());
		
		//Método charAt Recupera um caracter de uma posição específica
		
		System.out.println(disciplina.charAt(1));
		
		// Método getChars Recupera um conjunto de caracteres 
		
		char[] letras = new char[11];
		disciplina.getChars(0,  11, letras, 0);
		
		for (int i = 0; i < letras.length;  i++) {
			
			System.out.println("O caracter da posição " + i + " é: " + letras[i]);
		}
		System.out.println();
		
		System.out.println("-------------------COMPARAR STRINGS --------------------");
		
		String nome = new String();
		nome = "Adriano";
		
		String n = new String();
		n = "Adriano";
		
		if(nome == n) {
			System.out.println("Certo");
			System.out.println(n + nome);
			
		}else {
			System.out.println("Errado");
			System.out.println(n + nome);
		}
		
		
		

	}

}
