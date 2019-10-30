package lista_string;

import java.util.Scanner;

public class exercicio8string {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//tentar fazer por substring
		
		System.out.println("Digite a data: ");
		String data = new String(teclado.nextLine());
		
		String[] dataseparada = data.split("/"); 
		
		String mes = "";
				
		switch(dataseparada[1]) {
			case "01": {
				mes = "Janeiro";
			break;
			}
			case "02": {
				mes = "Fevereiro";
			break;
			}
			case "03": {
				mes = "Março";
			break;
			}
			case "04": {
				mes = "Abril";
			break;
			}
			case "05": {
				mes = "Maio";
			break;
			}
			case "06": {
				mes = "Junho";
			break;
			}
			case "07": {
				mes = "Julho";
			break;
			}
			case "08": {
				mes = "Agosto";
			break;
			}
			case "09": {
				mes = "Setembro";
			break;
			}
			case "10": {
				mes = "Outubro";
			break;
			}
			case "11": {
				mes = "Novembro";
			break;
			}
			case "12": {
				mes = "Dezembro";
			break;
			}
		
		}
		
			System.out.print("Você nasceu em " + dataseparada[0] + " de " + mes + " de " + dataseparada[2] + ".");

			teclado.close();
		
		
	}

}
