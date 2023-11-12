package cursopoo;


public class ContaBancaria {
		String titular;
		int numerodaconta;
		double saldo;
	public ContaBancaria(String titular,int numerodaconta,Double saldo){
		this.titular = titular;
		this.numerodaconta = numerodaconta;
		this.saldo = saldo;
		}
	void depositarvalor(double valor) {
		saldo = saldo + valor;
		System.out.println("Depósito no valor de: " + valor);
	}
	void saquevalor(double valor) {
		if(saldo>valor) {
			saldo = saldo - valor;
			System.out.println("Saque no valor de: " + valor);
		}	else{
				System.out.println("Operação inválida.");
				saldo = 0;
		}
	}
	void transferirsaldo(ContaBancaria conta2, double valorsacado){
		if(saldo>=valorsacado) {
		saldo = saldo - valorsacado;
		saquevalor(valorsacado); 
		System.out.println("Transferência no valor de: " + valorsacado);	
			
		}
	
	
		}
	}



