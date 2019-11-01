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

	
	
	
	
	
	
	
	
	
	
	
}
