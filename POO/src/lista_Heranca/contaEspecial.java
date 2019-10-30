package lista_Heranca;


	public class contaEspecial extends conta_Bancaria{
	
		private double limite;
		
		
		
		public double getLimite() {
			return limite;
		}



		public void setLimite(double limite) {
			this.limite = limite;
		}

		@Override
		public void saque(double valorsaque) {
			if(((this.getSaldo() + this.getLimite()) - valorsaque) >= 0.0) {
				 this.setSaldo(this.getSaldo() - valorsaque);
			}else {
				System.out.println("Valor n�o dispon�vel para saque.");
			}
		}
			 
		}
	
