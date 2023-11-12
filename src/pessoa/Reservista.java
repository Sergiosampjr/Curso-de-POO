package pessoa;


public class Reservista extends Pessoa {
	private int numerodocumento;
	
	public Reservista(String nome, String cpf, int idade, Double altura, double peso){
		super(nome, cpf, idade, altura, peso);
	}	
	
	void andarparaadireita(){
		System.out.println("Vire à direita");
	}
	public int getnumerodocumento(int d){
		return numerodocumento;
	}
	void setnumerodocumento(){
		this.numerodocumento = numerodocumento;	
	}
	





}
