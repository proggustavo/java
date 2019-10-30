package lista_construtores02;

public class executavelcozinha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		geladeira g1 = new geladeira("consul", "consul", 220, 60);
		
		System.out.println(g1.getCapacidade() + " " + g1.calcularconsumo());
		

	}

}
