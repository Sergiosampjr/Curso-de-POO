package conta;


public class Main {

	
	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		c1.numconta = 123456;
		c1.abrirConta("CC");
		c1.setStatus(true);
		System.out.println(c1.numconta);
		System.out.println(c1.depositar(300));
		System.out.println(c1.getsaldo());
		
	}

}
