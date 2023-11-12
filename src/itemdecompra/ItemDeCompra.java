package itemdecompra;



public class ItemDeCompra {
	int codigo;
	String nome;
	Double precounitario;
	int qtdcomprada;
public ItemDeCompra(int codigo,String nome,Double precounitario,int qtdcomprada){
		this.codigo = codigo;
		this.nome = nome;
		this.precounitario = precounitario;
		this.qtdcomprada = qtdcomprada;
	}
		void calculartotal() {
			System.out.println(precounitario * qtdcomprada);
		}
















}
