package roboo;


public class MovimentoInvalidoException {
    private int x;
    private int y;
    private String cor;
    public MovimentoInvalidoException(String cor){
        this.cor=cor;
        x=0;
        y=0;
    }
    public void mover(String comando) throws MovimentoInvalidoException{
        if(comando.equals("up") || comando.equals("UP")){
            setY(y+1);
            System.out.println(getX()+","+getY());
        }
        if(comando.equals("down") || comando.equals("DOWN")){
            if(y-1<0){
                throw new MovimentoInvalidoException("Movimento Invalido, coordenadas negativas não são permitidas");
            }else{
                setY(y-1);
                System.out.println(getX()+","+getY());
            }
        }
        if(comando.equals("right") || comando.equals("RIGHT")){
            setX(x+1);
            System.out.println(getX()+","+getY());
        }
        if(comando.equals("left") || comando.equals("LEFT")){
            if(x-1<0){
                throw new MovimentoInvalidoException("Movimento Invalido, coordenadas negativas não são permitidas");
            }else{
                setX(x-1);
                System.out.println(getX()+","+getY());
            }
        }
    }
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
            throw new MovimentoInvalidoException("Comandos aceitos: up(1), down(2), right(3), left(4)");
        }
    }
    public boolean encontrouAlimento(int xAlimento, int yAlimento){
        if(getX()== xAlimento){
            if(getY()== yAlimento){
                System.out.println("O robô "+ this.getCor()+" encontrou o alimento!!!");
                return true;
            }
        }
        return false;
    }

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
}
