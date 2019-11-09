package oficina;

public class Executavel {

	public static void main(String[] args) {
		
		
		// Contatos 
		
		Contato c1 = new Contato("1111-1111", "carlos@gmail.com");
		Contato c2 = new Contato("2222-2222", "zeca@gmail.com");
		Contato c3 = new Contato("3333-3333", "vera@gmail.com");
		Contato c4 = new Contato("4444-4444", "bia@gmail.com");
		Contato c5 = new Contato("5555-5555", "cintia@gmail.com");
		Contato c6 = new Contato("6666-6666", "miguel@gmail.com");
		Contato c7 s= new Contato("9999-9999", "oficina@gmail.com");
		
		// Pessoas
		
		Pessoa p1 = new Pessoa("Carlos", 30, "02069194938", c1);
		Pessoa p2 = new Pessoa("Zeca", 35, "03160104038", c2);
		Pessoa p3 = new Pessoa("Vera", 42, "1653705614", c3);
		Pessoa p4 = new Pessoa("Bia", 27, "27905679831", c4);
		Pessoa p5 = new Pessoa("Cintia", 22, "58134890518", c5);
		Pessoa p6 = new Pessoa("Miguel", 42, "01954239986", c6);
		
		/
		
		// Oficina
		
		Oficina oficina = new Oficina("Senac Oficina Mecânica", );

	}

}
