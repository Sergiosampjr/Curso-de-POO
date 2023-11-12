package arraysimples;


public class ArraySimples {

	
	public static void main(String[] args) {
		int	[] placas = {123,456,789};
		System.out.println("O tamanho do Array é: " + placas.length);
		placas[0] = 2032;
		for (int i = 0; i<=1 ;i++) {
			System.out.println("A placa é: " + placas[0]);
			System.out.println("A placa é: " + placas[1]);
			System.out.println("A placa é: " + placas[2]);
			
		}
	
	
	}

}
