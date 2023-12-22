package ecommerce.model;

public class Cliente extends Usuario {

	public Cliente(String nome, String email, int tipo) {
		super(nome, email, tipo);
		
	}
	
	public boolean comprar() {
		System.out.println("\nComprando");
		return true;
	}
	
	public void visualizarCarrinho() {
		System.out.println("Visualizando carrinho");
	}
	
	public void visualizar() {
		super.visualizar();
	}
}
