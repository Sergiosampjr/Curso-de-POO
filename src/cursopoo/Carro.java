package cursopoo;

public class Carro {
	int ano;
	int portas;
	String marca;
	String cor;
	public Carro(int ano,int portas,String marca,String cor) {
		this.ano = ano;
		this.portas = portas;
		this.marca = marca;
		this.cor = cor;
	}
	
	
	void acelerar() {
		System.out.println("RAAAAAAM.....RAAAAMMMM");
	}
	void ligar() {
		System.out.println("Rum...");
		
	}
	void desligar() {
		System.out.println("Carro desligado");
	}
	void abrirporta() {
		System.out.println("Porta aberta.");
	}
	void fecharporta() {
		System.out.println("Porta fechada.");
	}
	void mostrardados() {
		System.out.println("O ano do carro é " + ano);
		System.out.println("O carro tem " + portas + " Portas");
		System.out.println("A marca do carro é " + marca);
		System.out.println("A cor do carro é " + cor);
	}








}
