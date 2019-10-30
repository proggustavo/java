package lista_Construtores;

public class Ferramenta {
	
	
	private String modelo;
	private String fabricante;
	private double peso;
	private double desgaste;
	
	public Ferramenta(String modelo, String fabricante, double peso, double desgaste) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.peso = peso;
		this.desgaste = desgaste;
	}
	public Ferramenta() {
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getDesgaste() {
		return desgaste;
	}
	public void setDesgaste(double desgaste) {
		this.desgaste = desgaste;
	}

	public double CalculaVida() {
				
		return (100 / this.getDesgaste());
		
	}
	
	public double CalculaVida(String tempo){
		if(tempo.equalsIgnoreCase("dia")) {
			return CalculaVida() / 24;
		}else if(tempo.equalsIgnoreCase("semana")){
			return CalculaVida() / (24 * 7);
		}else {
			return CalculaVida() / 24;
		}
		
	}
	
	
	
	
	

	
	
	
	
	
	

}
