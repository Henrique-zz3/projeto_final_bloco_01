package produto.repository;

import produto.model.Produto;

public interface ProdutoRepository {
	
	public void procurarPorNumero(int numero);
	public void listarTodos();
	public void cadastrar(Produto jogo);
	public void atualizar(Produto jogo);
	public void deletar(int numero);

}
