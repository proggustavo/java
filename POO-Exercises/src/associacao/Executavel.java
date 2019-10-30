package associacao;

public class Executavel {

	public static void main(String[] args) {
		
		// Endereco dos Passageiros
		
		Endereco end1 = new Endereco("Rua do Passe", 100, "Estreito", "Florianópolis", "SC");
		Endereco end2 = new Endereco("Rua do Troco", 200, "Capoeiras", "Florianópolis", "SC");
		Endereco end3 = new Endereco("Rua do Dinheiro", 300, "Jardim Atlântico", "Florianópolis", "SC");
		Endereco end4 = new Endereco("Rua do Cartão", 400, "Balneário do Estreito", "Florianópolis", "SC");
		Endereco end5 = new Endereco("Rua do Estudante", 500, "Barreiros", "São José", "SC");
		Endereco end6 = new Endereco("Rua do Idoso", 600, "Capoeiras", "Florianópolis", "SC");
		Endereco end7 = new Endereco("Rua do Passe livre", 700, "Estreito", "Florianópolis", "SC");
		Endereco end8 = new Endereco("Rua do Passageiro", 800, "Jardim atlânntico", "Florianópolis", "SC");
		Endereco end9 = new Endereco("Rua do transporte", 900, "Estreito", "Florianópolis", "SC");
		Endereco end10 = new Endereco("Rua da Condução", 1000, "Balneário do estreito", "Florianópolis", "SC");
		
		// Contato dos passageiros
		
		Contato con1 = new Contato("1111-1111", "joao@gmail.com");
		Contato con2 = new Contato("2222-2222", "jose@gmail.com");
		Contato con3= new Contato("3333-3333", "joana@gmail.com");
		Contato con4 = new Contato("4444-4444", "joaquim@gmail.com");
		Contato con5 = new Contato("5555-5555", "jair@gmail.com");
		Contato con6 = new Contato("6666-6666", "jaime@gmail.com");
		Contato con7 = new Contato("7777-7777", "janaina@gmail.com");
		Contato con8 = new Contato("8888-8888", "janice@gmail.com");
		Contato con9 = new Contato("9999-9999", "jean@gmail.com");
		Contato con10 = new Contato("1010-1010", "juvenal@gmail.com");
		
		// Passageiros
		
		Passageiro p1 = new Passageiro("Joao", 30, end1, con1);
		Passageiro p2 = new Passageiro("Jose", 29, end2, con2);
		Passageiro p3 = new Passageiro("Joana", 48, end3, con3);
		Passageiro p4 = new Passageiro("Joaquim", 25, end4, con4);
		Passageiro p5 = new Passageiro("Jair", 41, end5, con5);
		Passageiro p6 = new Passageiro("Jaime", 31, end6, con6);
		Passageiro p7 = new Passageiro("Janaina", 22, end7, con7);
		Passageiro p8 = new Passageiro("Janice", 15, end8, con8);
		Passageiro p9 = new Passageiro("Jean", 50, end9, con9);
		Passageiro p10 = new Passageiro("Juvenal", 80, end10, con10);
		
		//Endereço dos Motoristas
		
		Endereco end11 = new Endereco("Rua do Motora", 1100, "Estreito", "Florianópolis", "SC");
		Endereco end12 = new Endereco("Rua do Cobrador", 1200, "Capoeiras", "Florianópolis", "SC");
		
		// Contato dos Motoristas
		
		Contato con11 = new Contato("1011-1011", "jorge@gmail.com");
		Contato con12 = new Contato("1012-1012", "julio@gmail.com");
		
		// Motoristas
		
		Motorista m1 = new Motorista("Jorge", 47, end11, con11, 3500);
		Motorista m2 = new Motorista("Julio", 45, end12, con12, 3900);
		
		// Onibus
		
		Onibus bus1 = new Onibus("MLG-3435", 234, m1);
		Onibus bus2 = new Onibus("MLG-3437", 235, m2);
		
		
		// array de passageiros
		
		Passageiro[] passageiros1 = {p1, p3, p5, p7, p9};
		Passageiro[] passageiros2 = {p2, p4, p6, p8, p10};
		
		// Linha 
		Linha linha1 = new Linha(5.00, bus1, passageiros1);
		Linha linha2 = new Linha(4.00, bus2, passageiros2);
		
		// ENDERECO EMPRESA
		
		Endereco end13 = new Endereco("Rua do Onibus", 1500, "Centro", "Florianopolis", "SC");
		
		//CONTATO EMPRESA
		Contato cont13 = new Contato("3033-3033", "viagem@gmail.com");
		
		//Array de linhas
		Linha[] listaLinhas = {linha1, linha2};
		
		// EMPRESA 
		Empresa emp = new Empresa("Viagem Bem", end13, cont13, listaLinhas);
		
		
		// Identificar motorista mais novo
		
		emp.identificarMotoristaMaisNovo();
		
		// calcular valor da linha;
		
		emp.calcularFaturamentoPorLinha();
		
		// Contato dos passageiros de um determinado bairro
		
		emp.recuperarContatoPorBairro("Barreiros");
		
		// Informações do motorista que tem o maior salário
		
		
		
		// Dado um telefone informar qual o nome do passageiro
		
		
		

	}

}
