package cursopoo;

public class Principal {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Sérgio",123456,1700.0);	
		conta1.titular = "Sérgio Sampaio";
		conta1.numerodaconta = 123456;
		conta1.transferirsaldo(conta1, 40);
			conta1.depositarvalor(350.0);
			conta1.saquevalor(30.0);
			System.out.println("O saldo é " + conta1.saldo);
	
	
	}

}

	


