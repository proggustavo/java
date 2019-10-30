package oo;

public class Calculadora {
		
		
				
		public double somar(double n1, double n2) {
			return  n1 + n2;
		}		
		
		public double subtrair(double n1, double n2) {
			return  n1 - n2;
		}
		public double multiplicar(double n1, double n2) {
			return  n1 * n2;
		}
		public double dividir(double n1, double n2) {
			double resultado = 0;
				if(n2 == 0) {
					System.out.println("Erro: Não é possível dividir por zero");
					
				}else {
					resultado =  n1 / n2;
				}
				return resultado;
		}

}
