package robo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Robo a = new Robo("preto");
        Scanner leitor = new Scanner(System.in);
        int xAlimento = leitor.nextInt();
        int yAlimento = leitor.nextInt();

//      (do while) pois o programa continuara rodando e fazendo as instruções abaixo enquanto o metodo encontrouAlimento
//      for falso
        do {
            int comando = leitor.nextInt();
            try {
                a.mover(comando);
            } catch (MovimentoInvalidoException e) {
                System.out.println(e.getMessage());
                ;
            }

            a.mostrarMatriz(xAlimento, yAlimento);
//      será feito todo o codigo acima repetidas vezes enquanto a expressão abaixo for falsa:
        } while (!a.encontrouAlimento(xAlimento, yAlimento));
    }
//      caso encontre o alimento(true) a mensagem já será printada pois o print está dentro do metodo encontroAlimento()

}
