package escola;

public class Escola {
	private String nome;
	private String telefone;
	private Turma[] turmas;
	private Endereco enderecoEscola;
	
	public Escola(String nome, String telefone, Turma[] turmas, Endereco enderecoEscola) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.turmas = turmas;
		this.enderecoEscola = enderecoEscola;
	}

	public Escola() {
		super();
		
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Turma[] getTurmas() {
		return turmas;
	}

	public void setTurmas(Turma[] turmas) {
		this.turmas = turmas;
	}

	public Endereco getEnderecoEscola() {
		return enderecoEscola;
	}

	public void setEnderecoEscola(Endereco enderecoEscola) {
		this.enderecoEscola = enderecoEscola;
	}
	
	
	public int totalAlunos() {
		int totalAlunos = 0;
		for(int i = 0; i < this.getTurmas().length; i ++) {
			totalAlunos += this.getTurmas()[i].getAlunos().length;
		}
		
		return totalAlunos;
	}
	
	public void enderecoRegente(String nome) {
		
		Endereco enderecoRegente = new Endereco();
		
		for(int i = 0; i < this.getTurmas().length; i ++) {
			if(this.getTurmas()[i].getRegente().getNome().equalsIgnoreCase(nome)) {
				enderecoRegente = this.getTurmas()[i].getRegente().getEndereco();
			}
		
		}
		
		System.out.println("Regente " + nome);
		System.out.println("Rua: " + enderecoRegente.getRua());
		System.out.println("Numero: " + enderecoRegente.getNumero());
		System.out.println("Bairro: " + enderecoRegente.getBairro());
		System.out.println("Cidade: " + enderecoRegente.getCidade());
		System.out.println("Estado: " + enderecoRegente.getEstado());
	}
	
	public void alunasPorSerie(int serie) {
		
		for(int i = 0; i < this.getTurmas().length; i ++) {
			if(this.getTurmas()[i].getSerie() == serie) {
				for(int j = 0; j < this.getTurmas()[i].getAlunos().length; j ++) {
					System.out.println(this.getTurmas()[i].getAlunos()[j].getNome());
				}
				
			}
		}
		
	}
	
	public void regenteMaisNovo() {
		
		Professor regenteMaisNovo = this.getTurmas()[0].getRegente();
		
		for(int i = 0; i < this.getTurmas().length; i ++) {	
			if(this.getTurmas()[i].getRegente().getIdade() < regenteMaisNovo.getIdade()) {
				regenteMaisNovo = this.getTurmas()[i].getRegente();
			}	
			
		}
		
		System.out.println("Regente: " + regenteMaisNovo.getNome());
		System.out.println("Idade: " + regenteMaisNovo.getIdade());
		
	}
	
	public void alunasPorCidade(String cidade) {
		
		System.out.println(cidade);
		for(int i = 0; i < this.getTurmas().length; i ++) {
			for(int j = 0; j < this.getTurmas()[i].getAlunos().length; j ++) {
				if(this.getTurmas()[i].getAlunos()[j].getEndereco().getCidade().equalsIgnoreCase(cidade)) {
					System.out.println(this.getTurmas()[i].getAlunos()[j].getNome());
				}
			}
			
		}
	}
		

}











