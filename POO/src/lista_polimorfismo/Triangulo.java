package lista_polimorfismo;

public abstract class Triangulo extends FormaGeometrica {

	
	public Triangulo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public abstract double calcArea(); 
	
	public abstract double calcPerimetro();	
	
}
