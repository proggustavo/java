package oficina;

public class Veiculo {
	private String modelo;
	private String fabricante;
	private int ano;
	private double valor;
	private String placa;
	private Pessoa dono;
	
	
	
	
	public Veiculo(String modelo, String fabricante, int ano, double valor, String placa, Pessoa dono) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.valor = valor;
		this.placa = placa;
		this.dono = dono;
	}
	
	public Veiculo() {
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Pessoa getDono() {
		return dono;
	}
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", fabricante=" + fabricante + ", ano=" + ano + ", valor=" + valor
				+ ", placa=" + placa + ", dono=" + dono + "]";
	}
	
	
	
	
	
}
