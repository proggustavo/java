package associacao;

public class Motorista extends Pessoa {
	
	private double salario;

	public Motorista(String nome, int idade, Endereco endereco, Contato contato, double salario) {
		super(nome, idade, endereco, contato);
		this.salario = salario;
	}

	public Motorista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	

}
