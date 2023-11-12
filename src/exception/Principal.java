package exception;


public class Principal {
	public static double dividir(int a, int b) throws DivisaoPorZeroException{
		if(b == 0)
			throw new DivisaoPorZeroException();
		return a / b;
		
		
		
	}













}
