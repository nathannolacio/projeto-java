package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.IProduto;

public class ProdutoController implements IProduto{
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	public Produto buscarNaCollection(int id) {
		for (var produto: listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
	
	@Override
	public void procurarPorId(int id) {
		var produto = buscarNaCollection(id);
		
		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO produto: " + id + " não foi encontrado");
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto: " + produto.getNome() + " foi cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());
		
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto: " + produto.getId() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO produto " + produto.getId() + " não foi encontrado!");
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(id);
		
		if (produto != null) {
			if (listaProdutos.remove(produto) == true) {
				System.out.println("\nO produto: " + id + " foi deletado com sucesso!");
			} else
				System.out.println("\nO produto: " + id + " não foi encontrado!");
		}
	}

	@Override
	public void comprar(int id, int quantidade) {
		var produto = buscarNaCollection(id);
		
		if (produto != null) {
			if (produto.comprar(quantidade) == true) {
				System.out.println("\nO produto: " + id + " foi comprado com sucesso!");
			} else
				System.out.println("\nO produto: " + id + " não foi encontrado!");
			
		}
	}
	
	public int gerarNumero() {
		return ++numero;
	}

}
