package implementacao;

public class Vendedor extends Comprador implements IFluxoDeVendaEEntrega {

	private FilaComprador filaComprador;
	
	public void proximaEntrega(){
		if (filaComprador.estaVazia())
			System.out.println("Não há entregas a serem realizadas.");
		else
			System.out.println("Próxima entrega é para " + filaComprador.primeiro().getNome());
	}
	
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
