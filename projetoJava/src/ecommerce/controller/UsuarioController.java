package ecommerce.controller;

import ecommerce.model.Usuario;
import ecommerce.repository.IUsuario;

public class UsuarioController implements IUsuario{
	
	int id = 0;

	@Override
	public void criarConta(Usuario usuario) {
		System.out.println("\nConta criada com sucesso! Agora você já pode acessar e utilizar a nossa plataforma.");
	}

	@Override
	public void comprar(int id, int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarAoCarrinho(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarId() {
		return ++id;
	}
	
}
