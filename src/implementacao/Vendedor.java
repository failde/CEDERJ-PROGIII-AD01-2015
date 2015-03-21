package implementacao;

public class Vendedor extends Pessoa implements IFluxoDeVendaEEntrega {

	private Fila fila = new Fila();
	
	public Vendedor(String nome,String endereco){
		super(nome,endereco);
	}
	
	@Override
	public void realizarEntrega() {
		this.fila.remover();
	}
	
	public void realizarVendaPara(Comprador comprador){
		this.fila.inserir(comprador);
	}

}
