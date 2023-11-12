package cursopoo;


public class Aviao extends Carro {
	Double envergadura;
	public Aviao(int ano, int portas, String marca, String cor ) {
		super(ano, portas, marca, cor );
		
	}
	void aterrizar(){
		System.out.println("Atenção,Vamos aterrizar.---------________________----------");
	}
	void ligar() {
		System.out.println("On------");
	}
	void mostrardados() {
		System.out.println("O ano do avião é " + ano);
		System.out.println("O ICBC tem " + portas + " portas.");
		System.out.println("A marca do avião é " + marca);
		System.out.println("A cor do avião é " + cor);
		System.out.println("A sua envergadura é " + envergadura);
	}
	





}
