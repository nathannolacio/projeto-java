package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.CarrinhoController;
import ecommerce.controller.ProdutoController;
//import ecommerce.controller.UsuarioController;
import ecommerce.model.Produto;
//import ecommerce.model.Cliente;
//import ecommerce.model.Usuario;
//import ecommerce.model.Vendedor;


public class Menu {

	public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController();
		CarrinhoController carrinho = new CarrinhoController();
		//UsuarioController usuarios = new UsuarioController();
		
		Scanner leia = new Scanner(System.in);
		int opcao, quantidade, id, tipoConta;
		String nomeProduto, categoria, nome, email;
		float valor;
		
//		Cliente c = new Cliente("Neitan" , "neitan", 1);
//		c.visualizar();
//		c.comprar();
		
		Produto p = new Produto(1, "Celular", "Eletrônicos", 2000.0f, 2);
		produtos.cadastrar(p);
		
		Produto p2 = new Produto(2, "Tablet", "Eletrônicos", 3000.0f, 10);
		produtos.cadastrar(p2);
		
		Produto p3 = new Produto(3, "Notebook", "Eletrônicos", 5000.0f, 20);
		produtos.cadastrar(p3);
		
		
		

		while (true) {
			
			System.out.println();
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
			System.out.println("          6 - Retirar item do carrinho           ");
			System.out.println("          7 - Sair                               ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("Entre com a opção desejada:                      ");
			System.out.println("                                                 ");

			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			if (opcao == 7) {
				System.out.println("\nDevCommerce - Obrigado pela preferência!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1 -> {
					System.out.println("\nVisualizar todos os produtos");
					produtos.listarTodos();
					
					keyPress();
				}
				case 2 -> {
					System.out.println("\nBuscar produto");
					
					System.out.println("Digite o ID do produto:");
					id = leia.nextInt();
					
					produtos.procurarPorId(id);
					
					keyPress();
				}
				case 3 -> {
					System.out.println("\nComprar");
					
					System.out.println("Digite o ID do produto:");
					id = leia.nextInt();
					System.out.println("Digite a quantidade que deseja comprar:");
					quantidade = leia.nextInt();
					
					produtos.comprar(id, quantidade);
					
					keyPress();
				}
				case 4 -> {
					System.out.println("\nVer carrinho");
					carrinho.listarProdutos();
					
					keyPress();
				}
				case 5 -> {
					System.out.println("\nAdicionar item ao carrinho");
					
					System.out.println("Digite o ID do produto que deseja adicionar ao carrinho:");
					id = leia.nextInt();
					
					carrinho.adicionarAoCarrinho(produtos.buscarNaCollection(id));
					
					keyPress();
				}
				case 6 -> {
					System.out.println("\nRetirar produto do carrinho");
					
					System.out.println("Digite o ID do produto que deseja adicionar ao carrinho:");
					id = leia.nextInt();
					
					carrinho.retirarDoCarrinho(produtos.buscarNaCollection(id));
					
					keyPress();
				}
				default -> System.out.println("\nOpção inválida!");
			}
		}

	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
