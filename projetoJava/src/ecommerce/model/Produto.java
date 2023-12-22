package ecommerce.model;

public class Produto {
	private String nome;
	private int categoria;
	private float valor;
	private int quantidade;
	
	public Produto(String nome, int categoria, float valor, int quantidade) {
		this.nome = nome;
		this.categoria = categoria;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public boolean comprar(int quantidade) {
		if (this.getQuantidade() >= quantidade) {
			this.setQuantidade(this.getQuantidade() - quantidade);
			System.out.println("Compra efetuada com sucesso!");
			return true;
		}
		System.out.println("Compra não efetuada!");
		return false;
	}
	
	public boolean addCarrinho() {
		System.out.println("adicionado ao carrinho");
		return true;
	}
	
	public boolean retirarCarrinho() {
		System.out.println("Retirado do carrinho");
		return true;
	}
	
	public void visualizar() {
		System.out.println("*************************************************");
		System.out.println("  Produto:                                       ");
		System.out.println("*************************************************");
		System.out.println("* Nome: " + this.nome);
		System.out.println("* Categoria: " + this.categoria);
		System.out.println("* Valor: " + this.valor);
		System.out.println("* Qauntidade: " + this.quantidade);
		System.out.println("*************************************************");
	}
}
