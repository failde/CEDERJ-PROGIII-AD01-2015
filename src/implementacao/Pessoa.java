package implementacao;

public abstract class Pessoa {

	private String nome;
	private String endereco;
	
	public Pessoa(String nome,String endereco){
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String obterNome(){
		return this.nome;
	}
	
	public String obterEndereco(){
		return this.endereco;
	}
	
	public void definirEndereco(String endereco){
		this.endereco = endereco;
	}
}
