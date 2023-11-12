package país;


public class País {
	private String nome = "Brasil";
	private String capital = "Brasilia";
	private double dimensao = 11.02;
	
	public País(String nome,String capital,double dimensao) {
		this.nome = nome;
		this.capital = capital;
		this.dimensao = dimensao;
	}
	/*public boolean fazfronteira() {
		if(nome.equals(nome)&&capital.equals(capital)) {
			return false;
		}
	
	}*/
	
	public boolean equals() {
		if(nome.equals(capital)) {
			System.out.println("O" + nome + " É igual ao " + this.nome);
			return true;
		}
		System.out.println("Não são iguais.");
		return false;
		
	
	}
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getcapital(){
		return capital;
	}
	public void setcapital(String capital) {
		this.capital = capital;
	}
	public double getdimensao() {
		return dimensao;
	}
	public void setdimensao(double dimensao) {
		this.dimensao = dimensao;
	}


}
