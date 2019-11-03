package escola;

public class Professor extends Pessoa{
	
	private String disciplina;

	public Professor(String nome, int idade, Endereco endereco, String disciplina) {
		super(nome, idade, endereco);
		this.disciplina = disciplina;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	
	

}
