package implementacao;

import java.util.ArrayList;
import java.util.List;

public class FilaComprador {

	private List<Comprador> filaComprador;
	
	public void inserir(Comprador c) {
		filaComprador.add(c);
	}

	public void remover() {
		if (filaComprador.isEmpty())
			System.out.println("N�o h� entregas para serem feitas");
		else
			filaComprador.remove(0);
	}

	public Comprador primeiro() {
		return filaComprador.get(0);
	}

	public boolean estaVazia() {
		return filaComprador.isEmpty();
	}

	public FilaComprador() {
		filaComprador = new ArrayList<Comprador>();
	}

}
