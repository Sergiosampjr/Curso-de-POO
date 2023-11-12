package pessoa;


public class Pessoa {
	private String nome = "Sérgio";
	private String cpf = "222.444.555-88";
	private int idade = 24;
	private double altura = 1.70;
	private double peso = 72.0;
	public Pessoa (String nome,String cpf,int idade,Double altura,double peso){
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	void andar() {
		System.out.println("🚶🚶🚶🚶🚶🚶🚶🚶");
	}
	void andarparafrente() { 
		System.out.println("🔼🔼🔼🔼🔼🔼🔼🔼");
	}
	void andarparatras() {
		System.out.println("🔽🔽🔽🔽🔽🔽🔽🔽");
	}
	void andarparaadireita() {
		System.out.println("▶▶▶▶▶▶▶▶▶▶▶");
	}
	void andarparaaesquerda() {
		System.out.println("◀◀◀◀◀◀◀◀◀◀◀");
	}
	void falar() {
		System.out.println("🗣️🗣️🗣️🗣️🗣️🗣️🗣️🗣️🗣️🗣️");
	}
	
	void mostrar_dados() {
		System.out.println(nome);
		System.out.println(altura);
		System.out.println(idade);
	} 
	public String getnome(String nome) {
		return  nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public int getcpf(int cpf) {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	public Double getaltura(Double altura) {
		return altura;
	}
	public void setaltura(double altura) {
		this.altura = altura;
	}
	public double getpeso(Double peso) {
		return peso;
	}
	public void setpeso(double peso) {
		this.peso = peso;
	}
	public String totring() {
		return "CPF: " + cpf + "," + "Nome: " + nome;
		
	}

















}
