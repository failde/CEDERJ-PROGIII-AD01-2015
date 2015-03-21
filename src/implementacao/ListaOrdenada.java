package implementacao;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ListaOrdenada {

	private Pessoa[] itens = new Pessoa[0];
	
	public void inserir(Pessoa pessoa){
		int chave = 0;
		while ((chave < this.itens.length) && (this.itens[chave].obterNome().compareTo(pessoa.obterNome()) <= 0)){
			chave++;
		}
		
		Pessoa[] novoArray = new Pessoa[this.itens.length + 1];
		System.arraycopy(this.itens,0,novoArray,0,chave);
		novoArray[chave] = pessoa;
		System.arraycopy(this.itens, chave, novoArray, chave + 1, this.itens.length - chave);
		this.itens = novoArray;
	}
	
	public Pessoa buscar(String nome){
		for(int i = 0; i < this.itens.length; i++){
			if(this.itens[i].obterNome() == nome){
				return this.itens[i];
			}
		}
		return null;
	}
	
	public boolean estaVazia(){
		return (this.itens.length == 0);
	}
}
