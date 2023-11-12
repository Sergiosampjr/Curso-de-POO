package baralho;


public class ArrayBaralho {

	public static void main(String[] args) {
		String [] naipes = {"Copas","Espadas","Ouros","Paus"};
		String []	cartas = {"ÁS","1","2","3","4","5","6","7","8","9","10","11","12","13"};
		
		String naipe = naipes [(int) (Math.random() * 4)]; 
		String carta = cartas [(int)(Math.random() * 13)];
	
		System.out.println(naipe);
		System.out.println(carta);
	
	}

}
