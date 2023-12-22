package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
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
		int opcao, quantidade, id;
		String nome, categoria;
		float valor;
		
		Cliente c = new Cliente("Neitan" , "neitan", 1);
		c.visualizar();
		c.comprar();
		
		Produto p = new Produto(1, "Celular", "Eletrônicos", 2000.0f, 2);
		produtos.cadastrar(p);
		
		Produto p2 = new Produto(2, "Tablet", "Eletrônicos", 3000.0f, 10);
		produtos.cadastrar(p2);
		
		Produto p3 = new Produto(3, "Notebook", "Eletrônicos", 5000.0f, 20);
		produtos.cadastrar(p3);
		
		
		

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
					System.out.println("\nVisualizar todos os itens");
					produtos.listarTodos();
					
					keyPress();
				}
				case 2 -> {
					System.out.println("\nBuscar produto");
					
					System.out.println("Digite o nome do produto:");
					id = leia.nextInt();
					
					produtos.procurarPorId(id);
					
					keyPress();
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
					
					System.out.println("Digite o ID do produto:");
					leia.skip("\\R?");
					nome = leia.nextLine();
					System.out.println("Digite a categoria:");
					leia.skip("\\R?");
					categoria = leia.nextLine();
					System.out.println("Digite o preço:");
					valor = leia.nextFloat();
					System.out.println("Digite a quantidade:");
					quantidade = leia.nextInt();
					
					produtos.cadastrar(new Produto(produtos.gerarNumero(), nome, categoria, valor, quantidade));
					
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
