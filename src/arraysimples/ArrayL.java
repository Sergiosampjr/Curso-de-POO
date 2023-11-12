package arraysimples;

import java.util.ArrayList;
public class ArrayL {


	public static void main(String[] args) {
		ArrayList <String> contatos = new ArrayList<>();
		contatos.add("Sérgio");
		contatos.add("98525112");
		contatos.add("Karin");
		contatos.add("89563123");
		System.out.println(contatos.set(3,"Maria"));
	/*for (int i = 0; i < contatos.size(); i++) {
		System.out.println(contatos.get(i));
	}
	}
*/
}
}