package caneta;


public class Caneta {
	//atributos
	public String modelo;
	public String cor;
	protected int carga;
	private double ponta;
	protected boolean tampa;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public double getPonta() {
		return ponta;
	}
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	public boolean isTampa() {
		return tampa;
	}
	public void setTampa(boolean tampa) {
		this.tampa = tampa;
	}
	//métodos getters e setters 
	public void escrever() {
		System.out.println("||||||||");
	}
	public void pintar() {
		System.out.println("Pintar");
	}
	
	
	public void rabiscarcaneta() {
		if (tampa == true){	
			System.out.println("Erro!.Não pode rabiscar caneta.");
		}
		else {
			System.out.println("Pode rabiscar.");
		}
	}
	private void tampada() {
		this.tampa = true;
	}
	private void destampada() {
		this.tampa = false;
	}
	void getcor(String cor) {
		this.cor = cor;
	}
	void status () {
		System.out.println("O modelo da caneta é " + this.modelo);
		System.out.println("A cor é " + this.cor);
		System.out.println("A carga da caneta é " + this.carga);
		System.out.println("A ponta da caneta é " + this.ponta);
		System.out.println("A tampa da caneta é " + this.ponta);
	}






}


