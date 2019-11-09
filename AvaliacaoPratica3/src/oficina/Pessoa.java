package oficina;

public class Pessoa {

	private String nome;
	private int idade;
	private String cpf;
	private Contato contato;
	
		
	public Pessoa(String nome, int idade, String cpf, Contato contato) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", contato=" + contato + "]";
	}
	
	
	
	
}
