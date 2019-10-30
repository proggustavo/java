package lista_construtores02;

public class fogao extends equipamento{
	
	private int qtdBocas;

	
	public fogao(String modelo, String fabricante, double consumo, int qtdBocas) {
		super(modelo, fabricante, consumo);
		this.qtdBocas = qtdBocas;
	}
	
	public fogao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQtdBocas() {
		return qtdBocas;
	}

	public void setQtdBocas(int qtdBocas) {
		this.qtdBocas = qtdBocas;
	}
	
	
}
