package biblioteca;

public class Revista extends Obra{

	

	public Revista(String titulo, int edicao, int ano, Autor escritor) {
		super(titulo, edicao, ano, escritor);
		
	}

	public Revista() {
		super();
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nTitulo: " + this.getTitulo() + 
			   "\nEdição: " + this.getEdicao() + 
			   "\nAno: " + this.getAno() + 
			   "\nEscritor: " + this.getEscritor().getNome();
	}
	

}
