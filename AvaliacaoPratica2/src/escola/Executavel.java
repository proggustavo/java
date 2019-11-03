package escola;

public class Executavel {

	public static void main(String[] args) {
		
		
		// Enderecos
		
		Endereco end1 = new Endereco("Rua das Jujubas", 100, "Campeche", "Florianópolis", "Santa Catarina");
		Endereco end2 = new Endereco("Rua das Gomas", 200, "Pedra Branca", "Palhoça", "Santa Catarina");
		Endereco end3 = new Endereco("Rua dos Caramelos", 300, "Kobrasol", "São José", "Santa Catarina");
		Endereco end4 = new Endereco("Rua dos Pirulitos", 400, "Estreito", "Florianópolis", "Santa Catarina");
		Endereco end5 = new Endereco("Rua dos Chicletes", 500, "Aririú", "Palhoça", "Santa Catarina");
		Endereco end6 = new Endereco("Rua dos Bombons", 600, "Forquilhinhas", "São José", "Santa Catarina");
		Endereco end7 = new Endereco("Rua das Balas", 700, "Capoeiras", "Florianópolis", "Santa Catarina");
		Endereco end8 = new Endereco("Rua das Trufas", 800, "Centro", "Biguaçu", "Santa Catarina");
		Endereco end9 = new Endereco("Rua dos Chicletes", 900, "Campinas", "São José", "Santa Catarina");
		Endereco end10 = new Endereco("Rua dos Confetes", 1000, "Capoeiras", "Florianópolis", "Santa Catarina");
		Endereco end11 = new Endereco("Rua das Enciclopédias", 500, "Centro", "Florianópolis", "Santa Catarina");
		Endereco end12 = new Endereco("Rua dos Dicionarios", 750, "Centro", "Florianópolis", "Santa Catarina");
		Endereco end13 = new Endereco("Rua dos Estudos", 1000, "Centro", "Florianópolis", "Santa Catarina");
		
		// Alunos
		
		Aluno a1 = new Aluno("Juliana Silva", 15, end1);
		Aluno a2 = new Aluno("Daniele Veiga", 14, end2);
		Aluno a3 = new Aluno("Bruna Andrade", 13, end3);
		Aluno a4 = new Aluno("Helena de Andrade", 16, end4);
		Aluno a5 = new Aluno("Mary Souza", 15, end5);
		Aluno a6 = new Aluno("Paula Vieira", 14, end6);
		Aluno a7 = new Aluno("Renata Augusta", 15, end7);
		Aluno a8 = new Aluno("Luiza Pires", 15, end8);
		Aluno a9 = new Aluno("Beatriz Santos", 14, end9);
		Aluno a10 = new Aluno("Suellen Lima", 17, end10);
		
		// Professors
		
		Professor p1 = new Professor("Zeca", 45, end11, "Matematica");
		Professor p2 = new Professor("Pires", 40, end12, "Português");
		
		
		// Array de Alunos
		
		Aluno[] alunosA = {a1, a2, a3, a4, a5};
		Aluno[] alunosB = {a6, a7, a8, a9, a10};
		
		// Turmas
		
		Turma turmaA = new Turma(7, alunosA, p1);
		Turma turmaB = new Turma(8, alunosB, p2);
		
		// Array de turmas
		
		Turma[] turmas = {turmaA, turmaB};
		
		// Escola
		
		Escola escola = new Escola("Escola Básica Das Meninas De Florianópolis", "3232-3232",turmas, end13);
		
		// Número de alunos
		System.out.println("Total de alunas da escola: " + escola.totalAlunos());
		
		//Endereco de um regente
		System.out.println("-------------- Endereço Regente ----------");
		escola.enderecoRegente("pires");
		
		System.out.println("-------------- Alunas por Serie ----------");
		escola.alunasPorSerie(8);
		
		System.out.println("-------------- Regente Mais novo ---------");
		escola.regenteMaisNovo();
		
		System.out.println("-------------- Alunas por Cidade ---------");
		escola.alunasPorCidade("São José");
		
		
		
		
		

	}

}
