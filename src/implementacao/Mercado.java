package implementacao;

public class Mercado implements IMercado {

	private ListaOrdenada compradores = new ListaOrdenada();
	private ListaOrdenada vendedores = new ListaOrdenada();
	
	@Override
	public void cadastrarComprador(String nome, String endereco) {
		this.compradores.inserir(new Comprador(nome,endereco));
	}

	@Override
	public void cadastrarVendedor(String nome, String endereco) {
		this.vendedores.inserir(new Vendedor(nome,endereco));
	}

	@Override
	public Comprador buscarComprador(String nome) {
		return (Comprador) this.compradores.buscar(nome);
	}

	@Override
	public Vendedor buscarVendedor(String nome) {
		return (Vendedor) this.vendedores.buscar(nome);
	}

}
