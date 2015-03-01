package implementacao;

public class Vendedor extends Comprador implements IFluxoDeVendaEEntrega {

	private FilaComprador filaComprador;
	
	@Override
	public void realizarVendaPara(Comprador comprador) {
		filaComprador.inserir(comprador);
	}

	@Override
	public void realizarEntrega() {
		filaComprador.remover();
	}
	
	public Vendedor(String nome, String endereco) {
		super(nome, endereco);
		filaComprador = new FilaComprador();
	}
}
