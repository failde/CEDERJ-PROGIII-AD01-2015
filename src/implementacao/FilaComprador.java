package implementacao;

import java.util.ArrayList;
import java.util.List;

public class FilaComprador implements IFilaComprador {

	private List<Comprador> filaComprador;
	
	@Override
	public void inserir(Comprador c) {
		filaComprador.add(c);
	}

	@Override
	public void remover() {
		filaComprador.remove(0);
	}

	@Override
	public Comprador primeiro() {
		return filaComprador.get(0);
	}

	@Override
	public boolean estaVazia() {
		return filaComprador.isEmpty();
	}

	public FilaComprador() {
		filaComprador = new ArrayList<Comprador>();
	}

}
