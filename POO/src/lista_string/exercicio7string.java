package lista_string;


import java.util.Scanner;

public class exercicio7string {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número: ");
		String numero = teclado.nextLine();
		
		char[] numeroChar = numero.toCharArray();
		String[] numeroString = new String[numeroChar.length]; 
		
		
		for(int i = 0; i < numeroChar.length; i ++) {
			switch(numeroChar[i]) {
				case '0':{ 
					numeroString[i] = "zero";
					
				break;
				}
				case '1': {
					numeroString[i] = "um";
					
					break;}
				case '2':{
					numeroString[i] = "dois";
					
					break;}
				case '3':{
					numeroString[i] = "três";
					
					break;}
				case '4':{
					numeroString[i] = "quatro";
					
					break;}
				case '5':{
					numeroString[i] = "cinco";
					
					break;}
				case '6':{
					numeroString[i] = "seis";
					
					break;}
				case '7':{
					numeroString[i] = "sete";
					
					break;}
				case '8':{
					numeroString[i] = "oito";
					break;}
				case '9':{
					numeroString[i] = "nove";
				}
			}
			
		}
		

		for(int i = 0; i < numeroString.length; i ++) {
			if(i + 1 != numeroString.length) {
				System.out.print(numeroString[i] + ", ");				
			}else {				
				System.out.print(numeroString[i] + ".");
			}
		}
		
		
		
			
		
		teclado.close();
	}

}
