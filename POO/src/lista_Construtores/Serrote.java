package lista_Construtores;

public class Serrote extends Ferramenta_Manual{
	

	private double qtddentes;
	
	


	public Serrote(String modelo, String fabricante, double peso, double desgaste, String tipo, int tamanho,
			double qtddentes) {
		super(modelo, fabricante, peso, desgaste, tipo, tamanho);
		this.qtddentes = qtddentes;
	}

	public Serrote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getQtddentes() {
		return qtddentes;
	}
	public void setQtddentes(double qtddentes) {
		this.qtddentes = qtddentes;
	}
	
	
	
	
	

}
