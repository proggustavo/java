package biblioteca;

public class Executavel {

	public static void main(String[] args) {
		
		// public Endereco(String rua, int numero, String bairro, String cidade, String estado); 
		
		// ENDEREÇOS
		
		Endereco end1 = new Endereco("RUA DAS MAÇAS", 100, "INGLESES", "FLORIANOPOLIS", "SANTA CATARINA");
		Endereco end2 = new Endereco("RUA DAS LARANJAS", 200, "ARIRIU", "PALHOÇA", "SANTA CATARINA");
		Endereco end3 = new Endereco("RUA DAS UVAS", 300, "PEDRA BRANCA", "PALHOÇA", "SANTA CATARINA");
		Endereco end4 = new Endereco("RUA DAS MELANCIAS", 400, "ESTREITO", "FLORIANOPOLIS", "SANTA CATARINA");
		Endereco end5 = new Endereco("RUA DAS MANGAS", 500, "CENTRO", "FLORIANOPOLIS", "SANTA CATARINA");
		
		
		// AUTORES
		
		Autor a1 = new Autor("CARLOS DRUMMOND", 76, end1);
		Autor a2 = new Autor("MACHADO DE ASSIS", 107, end2);
		Autor a3 = new Autor("CECILIA MEIRELES", 95, end3);
		Autor a4 = new Autor("OSVALD ANDRADE", 88, end4);
		
		// REVISTAS 
		// public Revista(String titulo, int edicao, int ano, Autor escritor) 
		
		
		Revista r1 = new Revista("Veja", 60, 2012, a1);
		Revista r2 = new Revista("IstoÉ", 80, 2013, a2);
		Revista r3 = new Revista("Auto Esporte", 20, 2011, a3);
		Revista r4 = new Revista("Super Interessante", 100, 2011, a4);		
		
		// Livros
		//public Livro(String titulo, int edicao, int ano, Autor escritor)
		
		Livro l1 = new Livro("Brejo das almas", 8, 1983, a1);
		Livro l2 = new Livro("Quincas Borba", 1, 1892, a2);
		Livro l3 = new Livro("Colar de Carolina", 3, 1934, a3);
		Livro l4 = new Livro("Livro os Condenados", 7, 1941, a4);
		
		// Obra
		// public Obra(String titulo, int edicao, int ano, Autor escritor) 
		
		Obra[] obras = {l1, l2, l3, l4, r1, r2, r3, r4};
		
		
		// Biblioteca
		//String nome, Endereco enderecoBiblioteca, Obra[] obra) {
			
		Biblioteca b1 = new Biblioteca("BIBLIOTECA CENTRAL", end5, obras);

		System.out.println("O número de obras da biblioteca são: " + b1.getObra().length);
		
		System.out.println("------------------------------");
		b1.obraMaisAntiga();
		System.out.println("------------------------------");
		b1.autorMaisNovo();
		System.out.println("------------------------------");
		b1.enderecoAutor("Machado de Assis");
		
		
		
	}

}
