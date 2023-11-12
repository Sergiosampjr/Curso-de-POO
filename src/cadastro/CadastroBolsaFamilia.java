package cadastro;

import banco.Conta;

public class CadastroBolsaFamilia extends Conta{

	protected CadastroBolsaFamilia(String titular, int numero) {
		super(titular, numero);
	}

	public static void main(String[] args) {
		CadastroBolsaFamilia cadastro = new CadastroBolsaFamilia("Francisca", 789532);
		cadastro.titular = "Francisca";
		cadastro.numero = 456931;
		cadastro.saldo = 180.0;
		cadastro.sacar(15.0);
	}

}
