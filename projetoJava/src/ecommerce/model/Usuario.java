package ecommerce.model;

public abstract class Usuario {
	private String nome;
	private String email;
	private int tipo;
	
	public Usuario(String nome, String email, int tipo) {
		this.nome = nome;
		this.email = email;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		String tipo = "";
		
		switch (this.tipo) {
		case 1 -> tipo = "Cliente";
		case 2 -> tipo = "Vendedor";
		}
		
		System.out.println("*************************************************");
		System.out.println("  Dados do Usuário:                              ");
		System.out.println("*************************************************");
		System.out.println("* Nome: " + this.nome);
		System.out.println("* Email: " + this.email);
		System.out.println("* Tipo: " + tipo);
		System.out.println("*************************************************");
	}
}
