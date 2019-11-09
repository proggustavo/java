package model;

import java.text.DecimalFormat;
import java.util.Scanner;
import model.dao.AlunoDAO;

public class Aluno {
	
	
	private String nome;
	private String sobrenome;
	private int matricula;
	private String nivel;
	private double np1;
	private double np2;
	private double nt1;
	private double nt2;
	private int pesoProva;
	private int pesoTrabalho;
	private double mediaFinal;
	private String situacao;
	

	public Aluno(String nome, String sobrenome, int matricula, String nivel, double np1, double np2, double nt1,
			double nt2, int pesoProva, int pesoTrabalho, double mediaFinal, String situacao) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.matricula = matricula;
		this.nivel = nivel;
		this.np1 = np1;
		this.np2 = np2;
		this.nt1 = nt1;
		this.nt2 = nt2;
		this.pesoProva = pesoProva;
		this.pesoTrabalho = pesoTrabalho;
		this.mediaFinal = mediaFinal;
		this.situacao = situacao;
	}

	public Aluno() {
		super();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getNp1() {
		return np1;
	}

	public void setNp1(double np1) {
		this.np1 = np1;
	}

	public double getNp2() {
		return np2;
	}

	public void setNp2(double np2) {
		this.np2 = np2;
	}

	public double getNt1() {
		return nt1;
	}

	public void setNt1(double nt1) {
		this.nt1 = nt1;
	}

	public double getNt2() {
		return nt2;
	}

	public void setNt2(double nt2) {
		this.nt2 = nt2;
	}

	public int getPesoProva() {
		return pesoProva;
	}

	public void setPesoProva(int pesoProva) {
		this.pesoProva = pesoProva;
	}

	public int getPesoTrabalho() {
		return pesoTrabalho;
	}

	public void setPesoTrabalho(int pesoTrabalho) {
		this.pesoTrabalho = pesoTrabalho;
	}

	public double getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", sobrenome=" + sobrenome + ", matricula=" + matricula + ", nivel=" + nivel
				+ ", np1=" + np1 + ", np2=" + np2 + ", nt1=" + nt1 + ", nt2=" + nt2 + ", pesoProva=" + pesoProva
				+ ", pesoTrabalho=" + pesoTrabalho + ", mediaFinal=" + mediaFinal + ", situacao=" + situacao + "]";
	}
	
	

	public void cadastrarAluno() {
		Scanner teclado = new Scanner(System.in);
		
		Aluno a = new Aluno();
		AlunoDAO dao = new AlunoDAO();
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		System.out.println("------------------ Cadastro Aluno ------------------");
		
			
		System.out.print("Digite o nome do aluno: ");
			a.setNome(teclado.nextLine().toUpperCase().trim());
		
		System.out.print("Digite o sobrenome: ");
			a.setSobrenome(teclado.nextLine().toUpperCase().trim());
			
		System.out.print("Digite a matrícula: ");
			a.setMatricula(Integer.parseInt(teclado.nextLine().trim()));
		
		System.out.print("Digite o nível: ");
			a.setNivel(teclado.nextLine().trim());
			
		System.out.println("------------------ Cadastro notas ------------------");
			
		System.out.print("Digite a nota da prova 1: ");
			a.setNp1(a.formatarNotas(teclado.nextLine().trim()));
			
		System.out.print("Digite a nota da prova 2: ");
			a.setNp2(a.formatarNotas(teclado.nextLine().trim()));
		
		System.out.print("Digite a nota do trabalho 1: ");
			a.setNt1(a.formatarNotas(teclado.nextLine().trim()));
			
		System.out.print("Digite a nota do trabalho 2: ");
			a.setNt2(a.formatarNotas(teclado.nextLine().trim()));
			
		System.out.print("Digite o peso das provas (Porcentagem): ");
			a.setPesoProva(Integer.parseInt(teclado.nextLine().trim()));
			
		System.out.print("Digite o peso dos trabalhos (Porcentagem): ");
			a.setPesoTrabalho(Integer.parseInt(teclado.nextLine().trim()));
		
		
			
		System.out.println("A media do aluno foi: " + a.calcularMedia());
		
		
		System.out.println("Situação do aluno: " + a.calcularSituacao());
		
		
		System.out.println(a);
			
		
		
		if(a.getNome().isEmpty() || a.getSobrenome().isEmpty() ) {
				System.out.println("Aluno não cadastrado, preencha todos os campos.");
			}else if(dao.pesquisarMatricula(a.getMatricula())){
				System.out.println("Aluno não cadastrado, a matrícula já existe!");
			}else if(this.mediaFinal == -1.0) {
				System.out.println("Aluno não cadastrado, a porcetagem total é inválida!");
			}
			else{
				dao.create(a);
				System.out.println(this.getMediaFinal());
			}
		
		
		
		}
	
		private double formatarNotas(String numero) {
			
			DecimalFormat df = new DecimalFormat("0.00");
			
			numero = numero.replaceAll(",", ".");
						
			return Double.parseDouble(numero);
			
		}
	
	

		private double calcularMedia() {
			this.mediaFinal = -1.0;
			
			if((this.getPesoProva() + this.getPesoTrabalho()) <= 100) {
			this.setMediaFinal(((this.np1 + this.np2) * (this.pesoProva)) / 2 + ((this.np1 + this.np2) * (this.pesoTrabalho)) / 2);
			System.out.println(this.getPesoProva() + this.getPesoTrabalho());
			}
			return this.mediaFinal;
			
			
		}
		
		private String calcularSituacao() {
			if(this.mediaFinal >= 7) {
				this.situacao = "Aprovado";
			}else if(this.mediaFinal >= 4.5) {
				this.situacao = "Recuperação";
			}else {
				this.situacao = "Reprovado";
			}
			
			return this.situacao;
			
			
		}
	
	
	
			
	
	
			
			
				
	}
	
	
	

