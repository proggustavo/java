package lista_construtores02;

public class equipamento {
	
	private String modelo;
	private String fabricante;
	private double consumo;
	
	public equipamento(String modelo, String fabricante, double consumo) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.consumo = consumo;
	}
	
	public equipamento() {
		super();
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public double calcularconsumo() {
		double consumomes;
		return  consumomes = this.consumo * 30;
	}
	
	
	

}
