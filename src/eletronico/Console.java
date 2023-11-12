package eletronico;


public class Console implements Eletronico {
	private boolean ligar;
	private String cor;
	private double tamanho;
	private String marca;
	private String tipo;
	
	
	public Console(boolean ligar,String cor, double tamanho, String marca, String tipo) {
		this.ligar = false; 
		this.cor = "Preto";
		this.tamanho = 33.44;
		this.marca = "Sony";
		this.tipo = "Slim";
	}

	@Override
	public boolean ligar() {
		setLigar(getLigar(true));
		return ligar;
	}

	@Override
	public void desligar() {
		setLigar(getLigar(false));
		
	}

	@Override
	public void status() {
		if (ligar == true) {
			setLigar(getLigar(true));
		}
		else {
			setLigar(getLigar(false));
		}
	}

	@Override
	public void mudarJogo() {
		if(setLigar(getLigar()) {
			
		}
		
	
	
	
	}

	@Override
	public void inserirDisco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void conectarRede() {
		
		
	}

	@Override
	public void iniciarJogo() {
		
		
	}
	public boolean getLigar(boolean ligar) {
		return ligar;
	}

	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


























}
