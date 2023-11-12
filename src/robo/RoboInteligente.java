package robo;

import java.util.ArrayList;
import java.util.Random;

public class RoboInteligente extends Robo {

    public RoboInteligente(String cor) {
        super(cor);
    }

//  nesse metodo sobreescrito iremos verificar alguns casos para quando o movimento passado ter sido invalido, o novo não
//  ser, com isso temos as seguintes ideias:
    public void mover(int num) throws MovimentoInvalidoException {
        Random gerador = new Random();
//      verifica o movimentoInvalido herdado da classe robo, para garantir que quando houver um movimento invalido
//      registrado, o proximo não poderá ser invalido novamente

//      ** é necessario utilizar o movimentoInvalido herdado da classe, pois precisamos ver todas as exceções que podem
//      ser geradas, caso se utilize apenas um contador de invalidos o codigo fica maior e haveria de tratar cada exceção
//      dentro desse metodo, para contabilizar da maneira correta, oq ficaria enorme e confuso **

//      o ponto negativo dessa forma é não puder utilizar de maneira correta o movimentoInvalido para o roboInteligente
//      para contabilizar o total de invalidos, oq é facilmento solucionado se fizer um outro atributo na classe Robo
//      apenas para contabilizar, mas como não é necessario printar o tanto de movimentos invalidos, apenas os validos
//      na main3 então vai ficar assim

        if (this.getMovimentosInvalidos() == 0) {
            super.mover(num);

//      a partir daqui começa as verificações para garantir um proximo movimento valido, o codigo está grande pois
//      queremos garantir que o proximo movimento continue sendo de certo modo aleatorio, naõ apenas um movimento pra
//      cima ou pra baixo a depender da exceção, pois dessa forma haveria um movimento pra cima quando houvesse uma
//      exceção de movimento para baixo, mas seria ignorado a possibilidade de movimentos em outras direções

//      garante movimento validos para o caso das posições (0,y) e (x,0)
//      sendo necessario o x e y ser diferente de 4 para não utilizarmos movimento, nesse caso, que ultrapasse a matriz
        } else if ((this.getX() == 0 || this.getY() == 0) && (this.getX() != 4 && this.getY() != 4)) {
            if(num != 4 && num != 2 && num!=0){
                this.setMovimentosInvalidos(0);
                super.mover(num);
            }else {
                int numAleatorio = gerador.nextInt(1);
                while (numAleatorio == 4 || numAleatorio == 2) {
                    numAleatorio = gerador.nextInt(1);
                }
                this.setMovimentosInvalidos(0); // volta o movimentoInvalido para 0, pois dessa forma garantimos que nunca
//          haverá dois movimentos invalidos seguidos, podemos verificar dessa forma se o movimento anterior foi valido
//          ou invalido
                super.mover(numAleatorio);
            }
//      garante movimento validos para o caso das posições (4,y), (x,4)
//      sendo necessario o x e y serem diferentes de 0 para não ter risco de usarmos um movimento que vá para o negativo
        } else if ((this.getX() == 4 || this.getY() == 4) && ((this.getX() != 0 && this.getY() != 0))) {
            if(num != 1 && num!= 3 && num!=0){ // caso 'num' seja diferente desses numeros não teria problema ele andar para onde
                // o usuario digitou
                this.setMovimentosInvalidos(0);
                super.mover(num);
            }else {
                int numAleatorio = gerador.nextInt(1);
                while (numAleatorio == 1 || numAleatorio == 3) {
                    numAleatorio = gerador.nextInt(1);
                }
                this.setMovimentosInvalidos(0);
                super.mover(numAleatorio);
            }
//      garante movimento validos para quando houver caso de posição (4,0)
        } else if (this.getX() == 4 || this.getY() == 0) {
            if(num != 2 && num !=3 && num!=0){
                this.setMovimentosInvalidos(0);
                super.mover(num);
            }else {
                int numAleatorio = gerador.nextInt(1);
                while (numAleatorio == 2 || numAleatorio == 3) {
                    numAleatorio = gerador.nextInt(1);
                }
                this.setMovimentosInvalidos(0);
                super.mover(numAleatorio);
            }
//      garante movimento validos para quando houver caso de posição (0,4)
        } else if (this.getX() == 0 || this.getY() == 4) {
            if(num != 4 && num != 1 && num!=0){
                this.setMovimentosInvalidos(0);
                super.mover(num);
            }else {
                int numAleatorio = gerador.nextInt(1);
                while (numAleatorio == 4 || numAleatorio == 1) {
                    numAleatorio = gerador.nextInt(1);
                }
                this.setMovimentosInvalidos(0);
                super.mover(numAleatorio);
            }
//      caso nenhum dos casos acima seja verdadeiro, como em posições (2,3) e etc, nesse caso é possivel afirmar que
//      a posição atual do robo não dará movimento invalido em nenhuma das direções
        } else {
            int numAleatorio = gerador.nextInt(1);
            if(num != 0) {
                this.setMovimentosInvalidos(0);
                super.mover(num);
            }else{
                this.setMovimentosInvalidos(0);
                super.mover(numAleatorio);
            }


        }


    }
}














