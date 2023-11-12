package modelo1;


public class Main {
	
	public static void main(String[] args) {
		Ventilador v = new Ventilador(true, "Branco", 60, 40, 0);
		System.out.println(v.getLigar(true));
		v.setCor("amarelo");
		System.out.println(v.getCor());
		v.aumentarVelocidade(7);
		System.out.println(v.getVelocidade());
	}

}
