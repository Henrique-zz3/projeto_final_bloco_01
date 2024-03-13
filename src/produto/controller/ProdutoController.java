package produto.controller;

import java.util.ArrayList;

import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{

	private ArrayList<Produto> listaJogos = new ArrayList<Produto>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		
		var jogo = buscarNaCollection(numero);
		
		if (jogo != null) {
			jogo.visualizar();
		}else {
			System.out.println("\nO Número identificador: " + numero + " não foi encontrada!");
		}
	}
	
	@Override
	public void listarTodos() {
		for (var jogo : listaJogos) {
			jogo.visualizar();
		}
	}

	@Override
	public void cadastrar(Produto jogo) {
		listaJogos.add(jogo);
		System.out.println("\nO jogo com o identificador: " + jogo.getNumero() + " foi criada com sucesso!");
	}

	@Override
	public void atualizar(Produto jogo) {
		var buscarJogo = buscarNaCollection(jogo.getNumero());
		
		if (buscarJogo != null) {
			listaJogos.set(listaJogos.indexOf(buscarJogo), jogo);
			System.out.println("\nO jogo com o identificador: " + jogo.getNumero() + " foi atualizada com sucesso!");
		}else{
			System.out.println("\nO jogo com o identificador:: " + jogo.getNumero() + " não foi encontrado!");
		}
		
		
	}

	@Override
	public void deletar(int numero) {
		var jogo = buscarNaCollection(numero);
		
		if (jogo != null) {
			if (listaJogos.remove(jogo) == true) {
				System.out.println("\nO jogo com o identificador: " + numero + " foi deletada com sucesso!");
			}
		}else {
			System.out.println("\nO jogo com o identificador: " + numero + " não foi encontrada!");
		}
		
		
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Produto buscarNaCollection(int numero) {
		for(var jogo : listaJogos) {
			if(jogo.getNumero() == numero) {
				return jogo;
			}
		}
		
		return null;
		
	}
	
}
