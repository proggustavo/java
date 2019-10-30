package oo;

public class ExecutavelPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Adriano");
		p1.setIdade(41);
		p1.setSexo("M");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Melo");
		p2.setIdade(41);
		p2.setSexo("M");
		
		Pessoa p3 = new Pessoa();
		p3.setNome("Jurema");
		p3.setIdade(35);
		p3.setSexo("F");
		
		Pessoa[] listaPessoa = {p1, p2, p3};
		
		for(int i = 0; i < listaPessoa.length; i++){
			if(listaPessoa[i].getSexo().equalsIgnoreCase("F")){
				System.out.println(listaPessoa[i].getNome());
			}
			
		}
	}

}
