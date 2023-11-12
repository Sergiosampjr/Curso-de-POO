package inteiros;

import java.util.ArrayList;

public class Inteiros {
private ArrayList<int> numeros = new ArrayList<>();

public Inteiros(ArrayList<Integer> numeros) {
	super();
	this.numeros = numeros;
}
void adicionarnumero(int n) {
	if(numeros.size()<=5) {
		numeros.add(n);
	}
	else {
		System.out.println("Não permitido.");
	}
}
public ArrayList<Integer> getNumeros() {
	return numeros;
}

public void setNumeros(ArrayList<Integer> numeros) {
	this.numeros = numeros;
}


	
















}
