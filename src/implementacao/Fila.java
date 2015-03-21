package implementacao;

public class Fila {

	private NoFila primeiro = null;
	private NoFila ultimo = null;
	
	public void inserir(Comprador c){
		NoFila novoNo = new NoFila(c,null);
		
		if(this.ultimo != null){
			this.ultimo.proximo = novoNo;
		}
		else{
			this.primeiro = novoNo;
		}
		
		this.ultimo = novoNo;
	}
	
	public void remover(){
		this.primeiro = this.primeiro.proximo;
		
		if (this.primeiro == null){
			this.ultimo = null;
		}
	}
	
	public Comprador primeiro(){
		return this.primeiro.dado;
	}
	
	public boolean estaVazia(){
		return (this.primeiro == null);
	}
}
