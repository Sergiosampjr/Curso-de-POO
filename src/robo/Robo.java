package robo;

public class Robo {
    private int x;
    private int y;
    private String cor;

    private int movimentosInvalidos = 0;
    private int movimentosValidos = 0;

//  matriz estatica pois ela irá ser a mesma matriz para robos diferentes, para ser possivel ver eles andando juntos
//  no metodo mostrarMatriz()
    private static String[][] matriz = new String[5][5];

    public Robo(String cor){
        this.cor=cor;
        x=0;
        y=0;
    }

//  metodo mover recebendo String como parametro, nesse metodo contabiliza a maior parte dos movimentos invalidos bem
//  como lança a exceção para ser tratada posteriormente na main
    public void mover(String comando) throws MovimentoInvalidoException {
        if(comando.equals("up") || comando.equals("UP")){
            if(y+1>4) { // >4 pois a matriz é 5 por 5, sendo os indices 0,1,2,3,4
                movimentosInvalidos++;
                throw new MovimentoInvalidoException("Movimento Invalido, excede a matriz");

            }else{
                setY(y + 1);
                System.out.println(getX() + "," + getY());
                movimentosValidos++;
            }
        }
        if(comando.equals("down") || comando.equals("DOWN")){
            if(y-1<0){
                movimentosInvalidos++;
                throw new MovimentoInvalidoException("Movimento Invalido, coordenadas negativas não são permitidas");
            }else{
                setY(y-1);
                System.out.println(getX()+","+getY());
                movimentosValidos++;
            }
        }
        if(comando.equals("right") || comando.equals("RIGHT")){
            if(x+1>4){
                movimentosInvalidos++;
                throw new MovimentoInvalidoException("Movimento Invalido, excede a matriz");
            }else{
                setX(x + 1);
                System.out.println(getX() + "," + getY());
                movimentosValidos++;
            }
        }
        if(comando.equals("left") || comando.equals("LEFT")){
            if(x-1<0){
                movimentosInvalidos++;
                throw new MovimentoInvalidoException("Movimento Invalido, coordenadas negativas não são permitidas");
            }else{
                setX(x-1);
                System.out.println(getX()+","+getY());
                movimentosValidos++;
            }
        }
    }

//  nessa sobrecarga do metodo mover recebendo um inteiro como parametro chamamos o outro metodo mover e apenas atribuimos,
//  a depender do numero digitado, os comandos up, down e etc... [up(1), down(2), right(3), left(4)]
    public void mover(int numero) throws MovimentoInvalidoException {
        if(numero==1){
            mover("up");
        }
        if(numero==2){
            mover("down");
        }
        if(numero==3){
            mover("right");
        }
        if(numero==4){
            mover("left");
        }
        if (numero <=0 || numero > 4){
            movimentosInvalidos++;
            throw new MovimentoInvalidoException("Movimento invalido: up(1), down(2), right(3), left(4)");
        }
    }
    public static String comandos(int numero){
        String[] comandos = new String[5];
        comandos[0] = "0 não é aceito";
        comandos[1] = "Cima(1)";
        comandos[2] = "Baixo(2)";
        comandos[3] = "Direita(3)";
        comandos[4] = "Esquerda(4)";
        return comandos[numero];
    }

//  metodo para encontrar alimento, recebe como parametro as coordenadas do alimento e verifica a posição do robo e se
//  ela condiz com a posição do alimento que foi inserida no parametro do metodo
    public boolean encontrouAlimento(int xAlimento, int yAlimento){
        if(getX()== xAlimento){
            if(getY()== yAlimento){
                String tipoRobo = "";
//              verifica a instancia do robo, para imprimir a mensagem de alimento encontrado com a instancia dele,
//              sendo ou robo, ou roboInteligente
                if (this instanceof RoboInteligente){
                    tipoRobo = "robo inteligente";
                }else{
                    tipoRobo = "robo";
                }
                System.out.println("O "+ tipoRobo + " "+ this.getCor()+" encontrou o alimento!!!");
                return true;
            }
        }
        return false;
    }

//  metodo estatico pois irá mostrar mais de um robô na matriz, ou seja ao chamar na main não irá chamar uma instancia
//  de um robo especifico, e sim de forma generica Robo.mostrarMatriz, pois irá servir para dois robos ao mesmo tempo
    public static void mostrarMatriz(Robo a, Robo b, int xAlimento, int yAlimento){
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                matriz[i][j] = "0";
            }
        }
        matriz[xAlimento][yAlimento] = "\uD83C\uDF4E";
        matriz[a.getX()][a.getY()]= "\uD83E\uDD16";
        matriz[b.getX()][b.getY()]= "\uD83E\uDD16";
//      como queremos uma representação mais fiel de um plano cartesiano, precisamos fazer como que a impressão da matriz
//      comece da esquerda para a direita e de baixo para cima, sendo assim as colunas viram linhas e as linhas viram as colunas
//      bem como as linhas são impressas de forma inversa
        for (int i = 4; i>=0; i--){
            for (int j = 0; j<5; j++){
                System.out.print(matriz[j][i] + "            ");
            }
            System.out.println(" ");
        }
        matriz[b.getX()][b.getY()]= "0";
        matriz[a.getX()][a.getY()]= "0";
    }

//  metodo sobrecarregado de mostrarMatriz para o caso da Main1 e também para quando faltar um unico robo para encontrar
//  o alimento na Main3, usando assim como parametro apenas as coordenadas do alimento e chamando o metodo a partir de
//  uma intancia de robo
    public void mostrarMatriz(int xAlimento, int yAlimento){
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                matriz[i][j] = "0";
            }
        }
        matriz[xAlimento][yAlimento] = "\uD83C\uDF4E";
        matriz[this.getX()][this.getY()]= "\uD83E\uDD16";
        for (int i = 4; i>=0; i--){
            for (int j = 0; j<5; j++){
                System.out.print(matriz[j][i] + "            ");
            }
            System.out.println(" ");
        }
        matriz[this.getX()][this.getY()]= "0";
    }


//  getters e setters:
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMovimentosInvalidos() {
        return movimentosInvalidos;
    }

    public void setMovimentosInvalidos(int movimentosInvalidos) {
        this.movimentosInvalidos = movimentosInvalidos;
    }

    public int getMovimentosValidos() {
        return movimentosValidos;
    }

    public void setMovimentosValidos(int movimentosValidos) {
        this.movimentosValidos = movimentosValidos;
    }

	public static String comandos1(int randomA) {
		// TODO Auto-generated method stub
		return null;
	}

}