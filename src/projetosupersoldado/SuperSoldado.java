package projetosupersoldado;

import pessoa.Pessoa;

public class SuperSoldado extends Pessoa {
	public SuperSoldado(String nome, int idade, Double altura) {
		super(nome, idade, altura);
		
	}
	public boolean getforca (double forca) {
		if(forca > 50) {
			 System.out.println("Super soldado");
			 return true;
		} 
		else {
			return false;
		}
	
	}
		
	








}
