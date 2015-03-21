package implementacao;

public interface IMercado {

	void cadastrarComprador(String nome, String endereco);
	void cadastrarVendedor(String nome,String endereco);
	Comprador buscarComprador(String nome);
	Vendedor buscarVendedor(String nome);
}
