package ecommerce.model;

public class Vendedor extends Usuario{

	public Vendedor(String nome, String email, int tipo) {
		super(nome, email, tipo);
	}
	
	public boolean cadastrarProduto() {
		System.out.println("\nCadastrado");
		return true;
	}
	
}
