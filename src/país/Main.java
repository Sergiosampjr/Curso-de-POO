package país;


public class Main {

	
	public static void main(String[] args) {
		País país1 = new País("Brasil","Brasilia",11.02);
		País país2 = new País("Brasil","Brasilia",11.02);
		System.out.println(país1.getnome());
		System.out.println(país1.getcapital());
		System.out.println(país1.getdimensao());
		System.out.println(país1.equals(país2));
	}

}
