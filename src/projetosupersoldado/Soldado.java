package projetosupersoldado;

import pessoa.Pessoa;

public class Soldado extends Pessoa {
	String chapeu = "Chapeu";
	
	public Soldado(String nome, int idade, Double altura) {
		super(nome, idade, altura);
	}

	public static void main(String[] args) {
		Pessoa capitao = new Pessoa("Roger",70,1.81);
		System.out.println(capitao.getaltura(1.82));
	
	}
	







}
