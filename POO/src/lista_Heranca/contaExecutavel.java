package lista_Heranca;

import java.util.Scanner;

public class contaExecutavel {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		conta_Bancaria conta = new conta_Bancaria(); 
		contaEspecial contaEspecial = new contaEspecial();
		contapoupanca contapoupanca = new contapoupanca();
		
		conta.setNome("Gustavo");
		conta.setNumconta(1);
		conta.setSaldo(5000);
		
		contaEspecial.setNome("Lucas");
		contaEspecial.setNumconta(2);
		contaEspecial.setSaldo(2000);
		contaEspecial.setLimite(1000);
		
		
		contapoupanca.setNome("Guilherme");
		contapoupanca.setNumconta(3);
		contapoupanca.setSaldo(3000);
		contapoupanca.setDiarendimento(10);
		
		
		
		System.out.println("--------------------------- Conta Comum -------------------------------");
		System.out.println("Selecione a opera��o que deseja: (Conta Bancaria)");
		System.out.println("1 - Consultar Saldo ");
		System.out.println("2 - Depositar ");
		System.out.println("3 - Sacar ");
		int operacao = teclado.nextInt();
		
		switch(operacao) {
		case 1:{
			System.out.println(conta.getSaldo());
			break;
		}
		case 2:{
			System.out.println("Digite o valor do dep�sito: ");
			conta.depositar(teclado.nextDouble());
			System.out.println("O saldo atual �: " + conta.getSaldo());
			break;
		}
		case 3:{
			System.out.println(" Digite o valor que deseja sacar: ");
			conta.saque(teclado.nextDouble());
			System.out.println("O valor atual �: " + conta.getSaldo());
			break;
		}
		}
		
		System.out.println("--------------------------- Conta Especial ----------------------------");
		System.out.println("Selecione a opera��o que deseja: (Conta especial)");
		System.out.println("1 - Consultar Saldo ");
		System.out.println("2 - Depositar ");
		System.out.println("3 - Sacar ");
		System.out.println("4 - Consultar limite");
		operacao = teclado.nextInt();
		
		switch(operacao) {
		case 1:{
			System.out.println(contaEspecial.getSaldo());
			break;
		}
		case 2:{
			System.out.println("Digite o valor do dep�sito: ");
			contaEspecial.depositar(teclado.nextDouble());
			System.out.println("O saldo atual �: " + contaEspecial.getSaldo());
			break;
		}
		case 3:{
			System.out.println(" Digite o valor que deseja sacar: ");
			contaEspecial.saque(teclado.nextDouble());
			System.out.println("O valor atual �: " + contaEspecial.getSaldo());
			break;
		}
		case 4 : {
			System.out.println("O limite dispon�vel � de " + (contaEspecial.getLimite()));
			break;
		}
		}
		
		System.out.println("--------------------------- Conta Poupanca ----------------------------");
		System.out.println("Selecione a opera��o que deseja: (Conta especial)");
		System.out.println("1 - Consultar Saldo ");
		System.out.println("2 - Depositar ");
		System.out.println("3 - Sacar ");
		System.out.println("4 - Atualizar rendimentos");
		operacao = teclado.nextInt();
		
		switch(operacao) {
		case 1:{
			System.out.println(contaEspecial.getSaldo());
		
		}
		case 2:{
			System.out.println("Digite o valor do dep�sito: ");
			contapoupanca.depositar(teclado.nextDouble());
			System.out.println("O saldo atual �: " + contapoupanca.getSaldo());
			break;
			
		}
		case 3:{
			System.out.println(" Digite o valor que deseja sacar: ");
			contapoupanca.saque(teclado.nextDouble());
			System.out.println("O valor atual �: " + contapoupanca.getSaldo());
			break;
			
		}
		case 4 : {
			System.out.println("Digite a taxa de rendimento");
			double taxarendimento = teclado.nextDouble();
			System.out.println("Digite o dia");
			int dia = teclado.nextInt();
			
			contapoupanca.atualizarsaldo(taxarendimento, dia);
			
			System.out.println("O valor atualizado � " + contapoupanca.getSaldo());
			break;
		}
		}
		
		
		
		
		
		
		
		teclado.close();
		
		
	}

}
