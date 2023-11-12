package robo;

import java.util.Scanner;
import java.util.Random;

public class Main2 {
    public static void main(String[] args){
        Robo a = new Robo("Azul");
        Robo b = new Robo("Verde");
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        int xAlimento = leitor.nextInt();
        int yAlimento = leitor.nextInt();
        leitor.nextLine(); // necessario para consumir a linha pendente depois do nextInt


//      while(true) pois a unica forma de parar o programa será com o brake dentro dos if caso os robôs
//      encontrem o alimento:

        while(true){
//          Gera numeros no intervalo (0,4), 0 está incluso apenas para chamar um caso da excessão e ver ela funcionando
            int randomA = gerador.nextInt(5);
            int randomB = gerador.nextInt(5);

//          tenta mexer o robo, caso funcione o robo se mexe, caso não funcione cai no catch, lança a exceção
            System.out.printf("Robo %s: ",a.getCor());
            try {
                a.mover(randomA);
                if(a.encontrouAlimento(xAlimento, yAlimento)){
                    Robo.mostrarMatriz(a,b, xAlimento, yAlimento);
                    break;
                }
            } catch (MovimentoInvalidoException e) {
                System.out.println(e.getMessage());
            }


            System.out.printf("Robo %s: ", b.getCor());
            try {
                b.mover(randomB);
                if(b.encontrouAlimento(xAlimento, yAlimento)){
                    Robo.mostrarMatriz(a,b, xAlimento, yAlimento);
                    break;
                }
            } catch (MovimentoInvalidoException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("\nMatriz: ");
            Robo.mostrarMatriz(a,b, xAlimento, yAlimento);
            leitor.nextLine(); // usado para esperar um enter do usuario, e visualizar assim, passo a passo, os dois
            // robos se movendo


        }

//      invalidos:
        System.out.println("numero de movimentos invalidos do robo " + a.getCor() + ": "+  a.getMovimentosInvalidos());
        System.out.println("numero de movimentos invalidos do robo " + b.getCor() + ": "+  b.getMovimentosInvalidos());
//      validos:
        System.out.println("numero de movimentos validos do robo " + a.getCor() + ": "+ a.getMovimentosValidos());
        System.out.println("numero de movimentos validos do robo " + b.getCor() + ": "+ b.getMovimentosValidos());
    }

}