package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.ICarrinho;

public class CarrinhoController implements ICarrinho{
	
	private ArrayList<Produto> carrinho = new ArrayList<Produto>();
	

	@Override
	public void listarProdutos() {
		for (var c : carrinho) {
			c.visualizar();
		}
	}

	@Override
	public void adicionarAoCarrinho(Produto produto) {
		carrinho.add(produto);
		System.out.println("\nProduto adicionado ao carrinho!");
	}

	@Override
	public void retirarDoCarrinho(Produto produto) {
		carrinho.remove(produto);
		System.out.println("\nProduto removido do carrinho!");
	}
	
}
