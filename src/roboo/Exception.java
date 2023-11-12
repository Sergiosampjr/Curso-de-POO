package roboo;


public class MovimentoInvalidoException extends Exception {


	 
	private static final long serialVersionUID = 1L;

	/*esse construtor receberá uma mensagem como parametro, para cada caso da exceção ser personalizado da maneira correta
    */
    public MovimentoInvalidoException(String mensagem){

    super(mensagem) chama o construtor da classe Exception e nos permite utilizar o .getMessage a partir do parametro dado.
    	super(mensagem);
    }

}