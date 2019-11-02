package associacao;

public class Linha {
	
	private double valorPassagem;
	private Onibus onibus;
	private Passageiro[] passageiros;
	
	
	public Linha(double valorPassagem, Onibus onibus, Passageiro[] passageiros) {
		super();
		this.valorPassagem = valorPassagem;
		this.onibus = onibus;
		this.passageiros = passageiros;
	}

	public Linha() {
		super();
		
	}

	public double getValorPassagem() {
		return valorPassagem;
	}

	public void setValorPassagem(double valorPassagem) {
		this.valorPassagem = valorPassagem;
	}

	public Onibus getOnibus() {
		return onibus;
	}

	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}

	public Passageiro[] getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(Passageiro[] passageiros) {
		this.passageiros = passageiros;
	}
	
	public double calcularFaturamentoLinha() {
		return this.getPassageiros().length * 2 * this.getValorPassagem();
	}

	public void recuperarContatoPassageiros(String bairro) {
		for(int i = 0; i < this.getPassageiros().length; i ++) {
			if(this.getPassageiros()[i].getEndereco().getBairro().equalsIgnoreCase(bairro)) {
				System.out.println("Nome: " + this.getPassageiros()[i].getNome());
				System.out.println("Contato: " + this.getPassageiros()[i].getContato());
			}
			
			this.getPassageiros()[0].getContato();
			
		}
		
	};
	

}
