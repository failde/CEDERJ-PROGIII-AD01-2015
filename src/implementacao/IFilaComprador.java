package implementacao;

public interface IFilaComprador {

	public void inserir(Comprador c);
	
	public void remover();
	
	public Comprador primeiro();
	
	public boolean estaVazia();
}
