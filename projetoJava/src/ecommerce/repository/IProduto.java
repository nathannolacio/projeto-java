package ecommerce.repository;

import ecommerce.model.Produto;

public interface IProduto {
	public void procurarPorNumero(int numero);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int numero);
	
	public void comprar(int numero, int quantidade);
	public void adicionarAoCarrinho(int numero);
}
