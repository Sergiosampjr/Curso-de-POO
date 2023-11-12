package arraymultidimensao;


public class ArrayMultid {

	public static void main(String[] args) {
	System.out.println("Lista decontatos:\n");
		String [][]	agenda_whatsapp = {{"Beatriz","123548","beatriz55@gmail.com"},{"camila","2222-22222","camisasouza@gmail.com"},{"vitoria","55555-5555","vitoria.ferreira@outlook.com.br"}};
			for (int i = 0; i < agenda_whatsapp.length; i++) {
				System.out.println("_________________");
				for (int j = 0; j < agenda_whatsapp.length; j++) { 
					System.out.println(agenda_whatsapp[i][j]);
			}
			}
	}

}
