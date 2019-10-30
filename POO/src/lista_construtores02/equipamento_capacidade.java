package lista_construtores02;

public class equipamento_capacidade extends equipamento{
	private double capacidade;
	
	public equipamento_capacidade(String modelo, String fabricante, double consumo, double capacidade) {
		super(modelo, fabricante, consumo);
		this.capacidade = capacidade;
	}
	public equipamento_capacidade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	
	
	
}
