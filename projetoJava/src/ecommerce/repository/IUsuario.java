package ecommerce.repository;

import ecommerce.model.Usuario;

public interface IUsuario {
	public void criarConta(Usuario usuario);
	
	public void comprar(int id, int quantidade);
	public void adicionarAoCarrinho(int id);
	public void cadastrar(Usuario usuario);
}
