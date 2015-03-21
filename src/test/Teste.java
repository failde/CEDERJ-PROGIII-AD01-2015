package test;

import implementacao.Mercado;
import implementacao.Vendedor;
import implementacao.Comprador;

public class Teste {

	public static void main(String[] args) {

		Mercado mercado = new Mercado();
		
		mercado.cadastrarComprador("Jose", "Rua Sernambetiba, 602");
		mercado.cadastrarComprador("Maria", "Rua Laura Lopes, 305");
		mercado.cadastrarComprador("Gustavo","Rua Jose Fernandes, 804");
		
		mercado.cadastrarVendedor("Fabio", "Rua Elpido Boamorte, s/n");
		mercado.cadastrarVendedor("Lucia", "Rua do Alvoredo, 38");
		
		Vendedor Lucia = mercado.buscarVendedor("Lucia");
		Lucia.realizarVendaPara(mercado.buscarComprador("Jose"));
		Lucia.realizarVendaPara(mercado.buscarComprador("Maria"));
		Lucia.realizarEntrega();
	}

}
