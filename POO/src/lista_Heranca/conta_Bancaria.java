package lista_Heranca;


public class conta_Bancaria {
	
	private String nome;
	private int numconta;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumconta() {
		return numconta;
	}
	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valordeposito) {
		saldo = saldo + valordeposito;
	}
	public void saque(double valorsaque) {
		if((saldo - valorsaque) >= 0.0) {
			 saldo = saldo - valorsaque;
		}else {
			System.out.println("Valor n�o dispon�vel para saque.");
		}
		
	}
	
	

}
