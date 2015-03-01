package implementacao;

public class Comprador {

	private final String nome;
	private String endereco;
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getNome(){
		return nome;
	}
	
	public Comprador(String nome,String endereco){
		this.nome = nome;
		this.endereco = endereco;
	}
}
