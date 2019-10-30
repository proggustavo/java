package exemplos;

public class UsandoTabelaASCII {
	public static void main(String[] args) {
	
		char letraG = 71;
		char letrau = 117;
		char letras = 115;
		char letrat = 116;
		char letraa = 97;
		char letrav = 118;
		char letrao = 111;
		int resultado = letraG + letrau + letras + letrat + letraa + letrav + letrao;
		
		System.out.println(resultado);
		if(resultado > 800){
			System.out.println("Nome: "  +  letraG + letrau + letras + letrat + letraa + letrav + letrao );
		}else {
			 System.out.println("Contrário: " + letrao + letrav + letraa + letrat + letras + letrau +  letraG);
		}
		
	
		
	}
}
