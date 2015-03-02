package implementacao;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

	private List<Comprador> pessoasCadastradas;
	
	public void inserir(Comprador pessoa) {
		
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
