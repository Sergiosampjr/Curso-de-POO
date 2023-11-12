package itemdecompra;

import java.util.ArrayList;
import java.util.Iterator;

//compra de no maximo 5 itens
public class Compra {
	private ArrayList<ItemDeCompra> itensdevenda = new ArrayList<ItemDeCompra>();
	int total = 0;
	
	public void getinseriritem(int item) {
		if(itensdevenda.size()>5) {
		System.out.println("Não permitido.");
		}
		else { 
			itensdevenda.add(itensdevenda.get(item));
		}
	}
	void calcularTotalCompra() {
		System.out.println("O total da compra é " + itensdevenda.size());	
		}
	void darDesconto(double desconto) {
		if (desconto < 1) {
				desconto = desconto * itensdevenda.size();
			System.out.println("O desconto será de " + desconto * itensdevenda.size());
			}
		else {
			System.out.println("Não aplicável.");
		}
		}
	













}
		



