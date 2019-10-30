package lista_Construtores;

public class Ferramenta_Manual extends Ferramenta{
	
	
	private String tipo;
	private int tamanho;
	

	public Ferramenta_Manual(String modelo, String fabricante, double peso, double desgaste, String tipo, int tamanho) {
		super(modelo, fabricante, peso, desgaste);
		this.tipo = tipo;
		this.tamanho = tamanho;
	}

	public Ferramenta_Manual() {
		super();
	}
			
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
