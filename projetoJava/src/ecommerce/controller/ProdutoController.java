package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.IProduto;

public class ProdutoController implements IProduto{
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprar(int numero, int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarAoCarrinho(int numero) {
		// TODO Auto-generated method stub
		
	}

}
