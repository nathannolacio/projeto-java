package ecommerce;

import java.util.Scanner;

import ecommerce.controller.ProdutoController;
import ecommerce.model.Cliente;
import ecommerce.model.Produto;
//import ecommerce.model.Usuario;
//import ecommerce.model.Vendedor;


public class Menu {

	public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController();
		
		Scanner leia = new Scanner(System.in);
		int opcao, quantidade;
		String nome, categoria;
		float valor;
		
		Cliente c = new Cliente("Neitan" , "neitan", 1);
		c.visualizar();
		c.comprar();
		
		Produto p = new Produto("Celular", "Eletrônicos", 2000.0f, 2);
		p.visualizar();
		
		Produto p2 = new Produto("Tablet", "Eletrônicos", 3000.0f, 10);
		p2.visualizar();
		
		Produto p3 = new Produto("Notebook", "Eletrônicos", 5000.0f, 20);
		p3.visualizar();
		
		
		

		while (true) {

			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("                   DevCommerce                   ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("          1 - Visualizar todos os itens          ");
			System.out.println("          2 - Buscar item                        ");
			System.out.println("          3 - Comprar                            ");
			System.out.println("          4 - Ver carrinho                       ");
			System.out.println("          5 - Adicionar item ao carrinho         ");
			System.out.println("          6 - Cadastrar produto                  ");
			System.out.println("          7 - Sair                               ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("Entre com a opção desejada:                      ");
			System.out.println("                                                 ");

			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println("\nDevCommerce - Obrigado pela preferência!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1 -> {
					System.out.println("\nVisualizar todos os itens");
					produtos.listarTodos();
				}
				case 2 -> {
					System.out.println("\nBuscar item");
				}
				case 3 -> {
					System.out.println("\nComprar");
				}
				case 4 -> {
					System.out.println("\nVer carrinho");
				}
				case 5 -> {
					System.out.println("\nAdicionar item ao carrinho");
				}
				case 6 -> {
					System.out.println("\nCadastrar produto");
					
					System.out.println("Digite o nome do produto");
					nome = leia.nextLine();
					System.out.println("Digite a categoria");
					categoria = leia.nextLine();
				}
				default -> System.out.println("\nOpção inválida!");
			}
		}

	}

}
