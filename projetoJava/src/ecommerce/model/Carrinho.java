package ecommerce.model;

public class Carrinho {
	private int qtdProdutos;
	
	
	public Carrinho(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}

	public int getQtdProdutos() {
		return qtdProdutos;
	}

	public void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}

}
