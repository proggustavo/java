package biblioteca;

public class Biblioteca {
	private String nome;
	private Endereco enderecoBiblioteca;
	
	
	public Biblioteca(String nome, Endereco enderecoBiblioteca) {
		super();
		this.nome = nome;
		this.enderecoBiblioteca = enderecoBiblioteca;
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
	
	
	
	
	
	
	
	
	
	
}
