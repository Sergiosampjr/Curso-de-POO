package aluno;


public class Aluno {
	private String nome;
	private int matricula;
	double nota1;
	double nota2;
	public Aluno(String nome,int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	void mediaaritmetica() {
		if((nota1 + nota2)/2>=7) {
			System.out.println("Aprovado");
		}
		else
			System.out.println("Reprovado");
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public int getmatricula() {
		return matricula;
	}
	public void setmatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double getnota1() {
		return nota1;
	}
	public void setnota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getnota2() {
		return nota2;
	}
	public void setnota2(double nota2) {
		this.nota2 = nota2;
	}






}
