package calculadora;

import java.lang.ref.Cleaner;

public class Operacoes {

double valor1;
double valor2;
int total = 0;
public Operacoes(double valor1,double valor2) {
	this.valor1 = valor1;
	this.valor2 = valor2;
}
void adicao(double valor) {
	System.out.println(valor1+valor2);
	total = total + 1;
}
void subtracao(double valor) {
	System.out.println(valor1-valor2);
	total = total + 1;

}
void multiplicacao(double valor){
	System.out.println(valor1 * valor2);
	total = total + 1;
}
public boolean divisao(double valor) {
	if(valor1<valor2) {
		System.out.println("Operação não permitida:");
		return false;
	}
	else {
		System.out.println(valor1/valor2);
		total = total + 1;
		return true;
	
	}

}
public double getValor1() {
	return valor1;
}
public void setValor1(double valor1) {
	this.valor1 = valor1;
}
public double getValor2() {
	return valor2;
}
public void setValor2(double valor2) {
	this.valor2 = valor2;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}












}






