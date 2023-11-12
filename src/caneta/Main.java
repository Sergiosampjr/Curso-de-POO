package caneta;


public class Main {

	
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.carga = 45;
		c1.tampa = true;
		c1.ponta = 1.2;
		c1.rabiscarcaneta();
		c1.getcor("Preto");
	
	}

}
