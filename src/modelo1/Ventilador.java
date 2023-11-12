package modelo1;


public class Ventilador implements Modelo1{

	private boolean ligar;
	private String cor;
	private double helice;
	private double tamanho;
	private int velocidade;
	
	public Ventilador(boolean ligar,String cor,double tamanho,double helice,int velocidade) {
		this.ligar = false;
		this.cor = "Branco";
		this.tamanho = 60;
		this.helice = 40;
		this.velocidade = 0;
	}
	@Override
	public void ligar() {
		setLigar(true);	
	}
	@Override
	public void desligar() {
		setLigar(false);
	}

	@Override
	public void girar() {
		if(getLigar(true)) {
			return;
		}
		else {
			return;
		}
	}
	public void naoGirar() {
		if(getLigar(false)) {
			return;
		}
		else {
			return;
		}
	}
	@Override
	public void subir() {
		if(getLigar(true)) {	
			return;
		}
		else {
			return;
		}
	
	}
	@Override
	public void descer() {
		if(getLigar(true)) {
			return;
		}	
		else {
			return;
		}
	}
	public void aumentarVelocidade(int v){
		if(getLigar(true)) {
			if(getVelocidade()<=3)
				velocidade = velocidade + v;
		}
	}
	/*ligar,cor,helice,tamanho
	 * 
	 */
	public boolean getLigar(boolean ligar) {
		return ligar;
	}
	public void setLigar(boolean l){
		this.ligar = l;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String c){
		this.cor = c;
	}
	public double getHelice(){
		return helice;
	}
	public void setHelice(double l){
		this.helice = l;
	}
	public double getTamanho(){
		return tamanho;
	}
	public void setTamanho(double t){
		this.tamanho = t;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int v) {
		this.velocidade = v;
	}

	





}
