package robo;

public class MovimentoInvalidoException extends Exception {

//  esse construtor receberá uma mensagem como parametro, para cada caso da exceção ser personalizado da maneira correta
    public MovimentoInvalidoException(String mensagem){

//  super(mensagem) chama o construtor da classe Exception e nos permite utilizar o .getMessage a partir do parametro dado.
        super(mensagem);
    }

}
