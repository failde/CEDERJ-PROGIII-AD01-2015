package implementacao;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

	private List<Comprador> pessoasCadastradas;
	
	public void inserir(String nome,String endereco) {
		Comprador comprador = new Comprador(nome,endereco);
		
		//Falta arrumar uma forma de inserir em ordem alfabética.
		pessoasCadastradas.add(comprador);
	}
	
	public Comprador buscaPessoa(String nome){
		return null;
	}
	
	public boolean estaVazia(){
		return pessoasCadastradas.isEmpty();
	}
	
	public Cadastro() {
		pessoasCadastradas = new ArrayList<Comprador>();
	}

}
