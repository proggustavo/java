package lista_polimorfismo;

public class TrianguloEquilatero extends Triangulo{
	
	private double lado;
	


	public TrianguloEquilatero(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}
	
	

	public TrianguloEquilatero() {
		super();
		// TODO Auto-generated constructor stub
	}



	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcArea() {
		
		return (Math.sqrt(3) * (Math.pow(this.getLado(), 2)) / 4);
	}

	@Override
	public double calcPerimetro() {
		
		return 3 * this.lado;
	}

	
	
}
