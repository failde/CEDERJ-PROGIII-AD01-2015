package implementacao;

public class Mercado implements IMercado {

	private Cadastro cadastroCompradores;
	private Cadastro cadastroVendedores;
	
	@Override
	public void cadastrarComprador(String nome, String endereco) {
		cadastroCompradores.inserir(nome, endereco);
	}

	@Override
	public void cadastrarVendedor(String nome, String endereco) {
		cadastroVendedores.inserir(nome, endereco);
	}

	@Override
	public Comprador buscarComprador(String nome) {
		return cadastroCompradores.buscaPessoa(nome);
	}

	@Override
	public Vendedor buscarVendedor(String nome) {
		return (Vendedor) cadastroVendedores.buscaPessoa(nome);
	}

	public Mercado() {
		cadastroCompradores = new Cadastro();
		cadastroVendedores = new Cadastro();
	}

}
