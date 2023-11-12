package conta;


public class ContaBanco {
	public int numconta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	//método Construtor
	public ContaBanco(){
		this.setsaldo(0);
		this.setStatus(true);
	}
	//métodos
	public void estadoAtual(){
		System.out.println("======================================");
		System.out.println("Conta: " + this.getNumconta());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Saldo: " + this.getsaldo());
		System.out.println("Status " + this.getStatus());
		System.out.println("======================================");
	}
	public void abrirConta(String t){
		this.settipo(t);
		this.setStatus(true);
		if(t.equals("CC")) {
			this.setsaldo(this.getsaldo() + 50.0);;
		}	
		else if(t.equals("CP")) {
			this.setsaldo(this.getsaldo() + 150.0);
		}	
		}
	public void fecharConta(){
		if(saldo > 0) {
			System.out.println("Conta com dinheiro.");
		}
		else if(saldo < 0) {
			System.out.println("Conta em débito.");
		}
		else {
			status = false;
		}
	}
	public boolean depositar(double s){
		if(this.getStatus()) {
			this.setsaldo(this.getsaldo() + s);
		}
		return status;
	}
	public void sacar(double sacar){
		if(this.getStatus()) {
			if(this.getsaldo() >= sacar) {
				this.setsaldo(this.getsaldo() - sacar);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}
			else{
				System.out.println("Impossível sacar.");
			}
		}else{
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}
	public void pagarMensal(){
		int v = 0;
		if(this.getTipo() == "cc")
			v = 12;
		else if(this.getTipo() == "cp")
			v = 20;	
		if(this.getStatus() == true)
			if(this.getsaldo() > v) {
				this.setsaldo(this.getsaldo() - v);
				System.out.println("Mensalidae paga com sucesso por " + this.dono);
			}else
				System.out.println("Saldo insuficiente");
		else
			System.out.println("Impossível pagar uma conta fechada.");
	}
	public int getNumconta(){
		return numconta;
	}
	public void setnumconta(int numconta){
		this.numconta=numconta;
	}
	public String getTipo(){
		return tipo;
	}
	public void settipo(String tipo){
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getsaldo() {
		return saldo;
	}
	public void setsaldo(double saldo){
		this.saldo = saldo;
	}
	public boolean getStatus(){
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}








}
