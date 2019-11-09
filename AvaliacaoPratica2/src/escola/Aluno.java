package escola;

public class Aluno extends Pessoa{

	public Aluno(String nome, int idade, Endereco endereco) {
		super(nome, idade, endereco);
		
	}
	
	public Aluno() {
		super();
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\nNome: " + this.getNome() +
				"\nIdade: " + this.getIdade();
	}
	
	
	
	
	
	
}
