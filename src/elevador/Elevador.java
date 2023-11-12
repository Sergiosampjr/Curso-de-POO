package elevador;


public class Elevador {
	private int terreo = 0;
	private int totalandar = 10;
	private int capacidade = 5;
	private int pessoaspresentes = 2;
	
public Elevador(int totalandar,int capacidade) {
	this.totalandar = totalandar;
	this.capacidade = capacidade;
	}
public boolean entra(int entra){
	if(entra<=capacidade) {
		pessoaspresentes = pessoaspresentes + 1;
		return true;
	}
	else {
		return false;
	}
}
void sai(int sai) {
	pessoaspresentes = pessoaspresentes - 1;
}

public boolean sobe(int totalandar) {
	if(totalandar<=10) {
		totalandar = totalandar + 1;
		return true;
	}
	else {
		return false;
	}
}
public boolean desce(int desce){
	if(desce == terreo) {
		
		return false;
	}
	else {
		totalandar = totalandar - 1;
		return true;
	}
}
public boolean podeEntrar(int entrar) {
	if(pessoaspresentes>5) {
		return false;
	}
	else {
		return true;
	}
}


public int getterreo(int terreo) {
	return terreo;
}
void setterreo() {
	this.terreo = terreo;
}
public int gettotalandar(int totalandar){
	return totalandar;
}
void settotalandar() {
	this.totalandar = totalandar;
}
public int getcapacidade(int capacidade){
	return capacidade;
}
void setcapacidade(){
	this.capacidade = capacidade;
}
public int getpessoaspresentes(int pp){
	return pessoaspresentes;
}
void setpessoaspresentes(){
	this.pessoaspresentes = pessoaspresentes;
}




}