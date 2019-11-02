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
		System.out.println("A obra mais nova é: " + obraMaisAntiga.getTitulo());
		System.out.println("Edição: " + obraMaisAntiga.getEdicao());
		System.out.println("Ano:  " + obraMaisAntiga.getAno());
		System.out.println("Escrito: " + obraMaisAntiga.getEscritor().getNome());
		
	}
	
	public void autorMaisNovo() {
		Autor autorMaisNovo = this.getObra()[0].getEscritor();
		
		for(int i = 0; i < this.getObra().length; i++) {
			if(autorMaisNovo.getIdade() > this.getObra()[i].getEscritor().getIdade()) {
				autorMaisNovo = this.getObra()[i].getEscritor();
			}
		}
		System.out.println("Autor mais novo: ");
		System.out.println("Nome: " + autorMaisNovo.getNome());
		System.out.println("Idade: " + autorMaisNovo.getIdade());
		System.out.println("Endereço: " + autorMaisNovo.getEnderecoAutor().getCidade());
		
	}
	
	public void enderecoAutor(String nome) {
		Endereco endAutor = this.getObra()[0].getEscritor().getEnderecoAutor();
		int cont = 0;
		for(int i = 0; i < this.getObra().length; i ++) {
			if(this.getObra()[i].getEscritor().getNome().equalsIgnoreCase(nome) && cont == 0) {
				endAutor = this.obra[i].getEscritor().getEnderecoAutor();
				System.out.println("Endreço autor " + nome );
				System.out.println("Rua: " + endAutor.getRua());
				System.out.println("Número: " + endAutor.getNumero());
				System.out.println("Bairro: " + endAutor.getBairro());
				System.out.println("Cidade: " + endAutor.getCidade());
				System.out.println("Estado: " + endAutor.getEstado());
				cont++;
			}
	
		}
	
	}
	
	
	
}
