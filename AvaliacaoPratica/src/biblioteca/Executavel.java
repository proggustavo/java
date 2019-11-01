package biblioteca;

public class Executavel {

	public static void main(String[] args) {
		
		// public Endereco(String rua, int numero, String bairro, String cidade, String estado); 
		
		// ENDEREÇOS
		
		Endereco end1 = new Endereco("RUA DAS MAÇAS", 100, "INGLESES", "FLORIANOPOLIS", "SANTA CATARINA");
		Endereco end2 = new Endereco("RUA DAS MAÇAS", 100, "INGLESES", "FLORIANOPOLIS", "SANTA CATARINA");
		Endereco end3 = new Endereco("RUA DAS MAÇAS", 100, "INGLESES", "FLORIANOPOLIS", "SANTA CATARINA");
		Endereco end4 = new Endereco("RUA DAS MAÇAS", 100, "INGLESES", "FLORIANOPOLIS", "SANTA CATARINA");
	
		
		
		// AUTORES
		
		Autor a1 = new Autor("CARLOS DRUMMOND", 76, end1);
		Autor a2 = new Autor("MACHADO DE ASSIS", 76, end2);
		Autor a3 = new Autor("CECILIA MEIRELES", 76, end3);
		Autor a4 = new Autor("OSVALD ANDRADE", 76, end4);

	}

}
