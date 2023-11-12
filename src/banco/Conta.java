package banco;

public class Conta {
	protected String titular;
	protected int numero;
	protected Double saldo;
	protected Conta(String titular,int numero,Double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}
	protected void depositar(double valor) {
		saldo = saldo + valor;
		}
	protected void sacar (double valor){
		if (saldo>=valor) {
			saldo = saldo - valor;
		}
			else {
				
				saldo = 0.0;
			}
			}
	protected void transferir(Conta destino,Double valor) {
		if (saldo >= valor) {
			sacar(valor);
			destino.depositar(valor);
		}
		else {
			System.out.println("Operação inválida: \nsaldo = " + saldo);
			}
	}
		public int getnumero(int numero) {
			return numero;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
