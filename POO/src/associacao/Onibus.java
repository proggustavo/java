package associacao;

public class Onibus {
	
	private String placa;
	private int numero;
	private Motorista motorista;
	
	
	public Onibus(String placa, int numero, Motorista motorista) {
		super();
		this.placa = placa;
		this.numero = numero;
		this.motorista = motorista;
	}


	public Onibus() {
		super();
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Motorista getMotorista() {
		return motorista;
	}


	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	
	
	
	
	

}
