package ecommerce.repository;

import ecommerce.model.Produto;

public interface ICarrinho {
	public void listarProdutos();
	public void adicionarAoCarrinho(Produto produto);
	public void retirarDoCarrinho(Produto produto);
}
