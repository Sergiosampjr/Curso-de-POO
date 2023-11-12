package pessoa;

public class Main {
	
	public static void main(String[] args) {
		//lista de atributos
		Reservista pessoa = new Reservista("Sérgio","888.999.777-1",24,1.70,72.0);
		System.out.println("Soldado");
		System.out.println(pessoa.getnome("Sampaio"));
		System.out.println(pessoa.getaltura(1.65));
		//lista de metodos
		pessoa.andarparafrente();
		pessoa.andarparaadireita();
		pessoa.andarparaaesquerda();
		pessoa.andarparatras();
		System.out.println(pessoa);
		
	
	
	
	
	}




















}
