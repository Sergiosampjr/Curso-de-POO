package elevador;


public class Main {

	public static void main(String[] args) {
		Elevador elevador = new Elevador(10,5);
		System.out.println(elevador.getcapacidade(4));
		elevador.entra(10);
		System.out.println(elevador.entra());
	}

}
