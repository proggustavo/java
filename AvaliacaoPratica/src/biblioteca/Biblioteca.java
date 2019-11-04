package biblioteca;

public class Biblioteca {
	private String nome;
	private Endereco enderecoBiblioteca;
	private Obra[] obra;
	
	public Biblioteca(String nome, Endereco enderecoBiblioteca, Obra[] obra) {
		super();
		this.nome = nome;
		this.enderecoBiblioteca = enderecoBiblioteca;
		this.obra = obra;
	}
	
	public Biblioteca() {
		super();
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEnderecoBiblioteca() {
		return enderecoBiblioteca;
	}
	public void setEnderecoBiblioteca(Endereco enderecoBiblioteca) {
		this.enderecoBiblioteca = enderecoBiblioteca;
	}
	public Obra[] getObra() {
		return obra;
	}
	public void setObra(Obra[] obra) {
		this.obra = obra;
	}

	public void obraMaisAntiga() {
		Obra obraMaisAntiga =  this.getObra()[0];
		
		for(int i = 0; i < this.getObra().length; i ++) {
			if(obraMaisAntiga.getAno() > this.getObra()[i].getAno()) {
				obraMaisAntiga = this.getObra()[i];
			}
		}
		
		System.out.println("A obra mais antiga é: " + obraMaisAntiga);
		
	}
	
	public void autorMaisNovo() {
		Autor autorMaisNovo = this.getObra()[0].getEscritor();
		
		for(int i = 0; i < this.getObra().length; i++) {
			if(autorMaisNovo.getIdade() > this.getObra()[i].getEscritor().getIdade()) {
				autorMaisNovo = this.getObra()[i].getEscritor();
			}
		}
		System.out.println("Autor mais novo: ");
		System.out.println(autorMaisNovo);
		
		
	}
	
	public void enderecoAutor(String nome) {
		Endereco endAutor = this.getObra()[0].getEscritor().getEnderecoAutor();
		int cont = 0;
		for(int i = 0; i < this.getObra().length; i ++) {
			if(this.getObra()[i].getEscritor().getNome().equalsIgnoreCase(nome) && cont == 0) {
				endAutor = this.obra[i].getEscritor().getEnderecoAutor();
				System.out.println(this.getObra()[i].getEscritor().getNome());
				System.out.println(endAutor);
				cont++;
			}
	
		}
	
	}
	
	
	
}
