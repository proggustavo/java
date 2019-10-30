package associacao;

public class Pessoa {
	private String nome;
	private int idade;
	private Endereco endereco;
	private Contato contato;
	
	
	public Pessoa(String nome, int idade, Endereco endereco, Contato contato) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.contato = contato;
	}


	public Pessoa() {
		super();
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Contato getContato() {
		return contato;
	}


	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	
	
	
	
	
	
}
