package ecommerce.repository;

import ecommerce.model.Produto;

public interface IProduto {
	public void procurarPorId(int id);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int id);
	
	public void comprar(int id, int quantidade);
}
