package banco;


public class Banco {
	private String nome;
	private  Conta[]  contas;
	private int qtdcontas = 0;
	private int totalcontas;
	
	public Banco (String nome,int totalcontas){
		this.nome = nome;
		this.totalcontas = totalcontas;
		contas = new Conta[totalcontas];		
	}
	public boolean adicionarconta(Conta c) {
		if(qtdcontas<totalcontas) { 
		contas[qtdcontas] = c;
		qtdcontas ++;
		}
		else 
			return false;
		return true;
	}
	public Conta getprocurar(int numero) {
		for (int i = 0; i < qtdcontas; i++) {
			if(contas[i].getnumero(i) == numero) 
					return  contas[i];
			}
		return null;
		
	}

	}




	
