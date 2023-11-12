package banco;

public class Principal {

	
	public static void main(String[] args) {
		//construtor dos atributos
		Conta conta1 = new Conta("Sérgio", 456789,40.0);
		//atributos da classe conta1
		System.out.println(conta1.saldo = 70.0);
		//metodos da conta1
		conta1.depositar(0.0);
		conta1.sacar(0.0);
		//objeto conta2
		Conta conta2 = new Conta("Karin",36457,80.0);
		conta2.titular = "Karin";
		conta2.numero = 36457;
		conta2.saldo = 80.0;
		//métodos conta2
		conta2.depositar(0.0);
		conta2.sacar(0.0);
		//transferencia
		conta2.transferir(conta1,500.0);
		System.out.format("saldo do Sérgio " + conta1.saldo + "\n");
		System.out.format("saldo da Karin " + conta2.saldo + "\n ");
		
	}











}
