package robo;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Robo roboNormal = new Robo("Verde");
        RoboInteligente roboInteligente = new RoboInteligente("Azul");
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        int xAlimento = leitor.nextInt();
        int yAlimento = leitor.nextInt();
        leitor.nextLine();

//      while(true) pois a unica forma de parar o programa será com o brake dentro dos if caso os robôs
//      encontrem o alimento:

        while (true) {
            leitor.nextLine();
//          Gera numeros no intervalo (0,4), 0 está incluso apenas para chamar um caso da excessão e ver ela funcionando
            int randomA = gerador.nextInt(5);
            int randomB = gerador.nextInt(5);
            System.out.println("Comando Robo Normal: "+ Robo.comandos(randomA));
            System.out.println("Comando Robo Inteligente: "+ Robo.comandos(randomB));

//          tenta mexer o robo, caso funcione o robo se mexe, caso não funcione cai no catch, lança a exceção
            System.out.print("Robo normal: ");
            try {
                roboNormal.mover(randomA);
            } catch (MovimentoInvalidoException e) {
                System.out.println(e.getMessage());
            }

            if (roboNormal.encontrouAlimento(xAlimento, yAlimento)) {
//          caso o roboNormal encontre o alimento, o programa continua a rodar apenas com o roboInteligente pois o
//          programa só acaba quando os dois encontram o alimento, então se inicia outro while, ao sair do while
//          ele dá break no primeiro while e assim o programa acaba.
                while (!roboInteligente.encontrouAlimento(xAlimento, yAlimento)) {
                    int randomInterno = gerador.nextInt(5);
                    System.out.println("Comando Robo Inteligente: "+ Robo.comandos(randomInterno));
                    System.out.print("Robo inteligente: ");
                    try {
                        roboInteligente.mover(randomInterno);
                    } catch (MovimentoInvalidoException e) {
                        System.out.println(e.getMessage());
                    }
                    roboInteligente.mostrarMatriz(xAlimento, yAlimento);
                    leitor.nextLine();
                    System.out.println();
                }
                System.out.println();
                break;
            }

            System.out.print("Robo Inteligente: ");
            ;
            try {
                roboInteligente.mover(randomB);
            } catch (MovimentoInvalidoException e) {
                System.out.println(e.getMessage());
            }
            Robo.mostrarMatriz(roboNormal, roboInteligente, xAlimento, yAlimento);

            if (roboInteligente.encontrouAlimento(xAlimento, yAlimento)) {
//          mesma logica do comentario no if do roboNormal.encontroAlimento()
                while (!roboNormal.encontrouAlimento(xAlimento, yAlimento)) {
                    int randomInterno = gerador.nextInt(5);
                    System.out.println("Comando Robo Normal: "+ Robo.comandos(randomInterno));
                    System.out.print("Robo Normal: ");
                    try {
                        roboNormal.mover(randomInterno);
                    } catch (MovimentoInvalidoException e) {
                        System.out.println(e.getMessage());
                    }
                    roboNormal.mostrarMatriz(xAlimento, yAlimento);
                    leitor.nextLine();
                    System.out.println();
                }
                System.out.println();
                break;
            }
            leitor.nextLine(); // espera um enter do usario para continuar a caminhada dos robozinhos e assim vermos
            // passo a passo da caminhada deles em busca do alimento
            System.out.println();

        }
        System.out.println("Numero de movimentos do Robo(normal) " + roboNormal.getCor() + ": " + roboNormal.getMovimentosValidos());
        System.out.println("Numero de movimentos do Robo(inteligente) " + roboInteligente.getCor() + ": " + roboInteligente.getMovimentosValidos());

    }
}






