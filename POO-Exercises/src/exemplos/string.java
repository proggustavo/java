package exemplos;

public class string {

	public static void main(String[] args) {
			
		String disciplina = new String();
		disciplina = "Ol� tudo bem:";
		
		System.out.println(disciplina);
		System.out.println(disciplina.length());
		
		//M�todo charAt Recupera um caracter de uma posi��o espec�fica
		
		System.out.println(disciplina.charAt(1));
		
		// M�todo getChars Recupera um conjunto de caracteres 
		
		char[] letras = new char[11];
		disciplina.getChars(0,  11, letras, 0);
		
		for (int i = 0; i < letras.length;  i++) {
			
			System.out.println("O caracter da posi��o " + i + " �: " + letras[i]);
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
