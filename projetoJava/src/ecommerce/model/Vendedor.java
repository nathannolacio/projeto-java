package ecommerce.model;

public class Vendedor extends Usuario{

	public Vendedor(int id, String nome, String email, int tipo) {
		super(id, nome, email, tipo);
	}
	
	public boolean cadastrarProduto() {
		System.out.println("\nCadastrado");
		return true;
	}
	
}
