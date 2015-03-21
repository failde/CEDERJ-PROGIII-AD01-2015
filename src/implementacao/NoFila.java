package implementacao;

public class NoFila {

	Comprador dado;
	NoFila proximo;
	
	public NoFila(Comprador dado,NoFila proximo){
		this.dado = dado;
		this.proximo = proximo;
	}
}
