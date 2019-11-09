package oficina;

public class Oficina {
	private String nome;
	private Moto[] motos;
	private Carro[] carros;
	private Contato contatoOficina;
	
	public Oficina(String nome, Moto[] motos, Carro[] carros, Contato contatoOficina) {
		super();
		this.nome = nome;
		this.motos = motos;
		this.carros = carros;
		this.contatoOficina = contatoOficina;
	}
	
	public Oficina() {
		super();
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Moto[] getMotos() {
		return motos;
	}
	public void setMotos(Moto[] motos) {
		this.motos = motos;
	}
	public Carro[] getCarros() {
		return carros;
	}
	public void setCarros(Carro[] carros) {
		this.carros = carros;
	}
	public Contato getContatoOficina() {
		return contatoOficina;
	}
	public void setContatoOficina(Contato contatoOficina) {
		this.contatoOficina = contatoOficina;
	}
	
	
}
